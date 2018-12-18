package willian.duarte.exmenunativoedrawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity {

    private static final int MENU_REMOVER = 95;

    private Drawer result = null;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // begin material drawer

        //Inicio AccountHeader
        //####################### SÓ O CABEÇALHO #######################
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.accountheader_background)
                .addProfiles(
                        new ProfileDrawerItem().withName("Willian Duarte").withEmail("willianm.cduarte@gmail.com").withIcon(getResources().getDrawable(R.mipmap.ic_launcher))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener(){
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();
        result = new DrawerBuilder()
                .withActivity(this)
                .withTranslucentStatusBar(false)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .withSavedInstance(savedInstanceState)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Home").withIdentifier(0).withIcon(GoogleMaterial.Icon.gmd_home),
                        new SectionDrawerItem().withName("Ações"),
                        new SecondaryDrawerItem().withName("Tela1").withIdentifier(1).withIcon(FontAwesome.Icon.faw_facebook),
                        new SecondaryDrawerItem().withName("Tela2").withIdentifier(2).withIcon(FontAwesome.Icon.faw_twitch),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem()
                            .withName("Coisas")
                            .withIcon(GoogleMaterial.Icon.gmd_list)
                        .withSubItems(
                                new SecondaryDrawerItem().withName("Coisa1").withIdentifier(3),
                                new SecondaryDrawerItem().withName("Coisa2").withIdentifier(4)
                        )
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        switch ((int)drawerItem.getIdentifier()){
                            case 0:
                                toast("0");
                                break;
                            case 1:
                                toast("1");
                                break;
                            case 2:
                                toast("2");
                                break;
                            case 3:
                                toast("3");
                                break;
                            case 4:
                                toast("4");
                                break;
                        }
                        return false;
                    }
                }).build();


        // end material drawer

    }// close onCreate();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        menu.add(MENU_REMOVER,MENU_REMOVER,MENU_REMOVER,"Remover")
            .setIcon(R.mipmap.ic_launcher_round)
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        return true;
    }// close onCreateOptionsMenu();

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                toast("Adicionar!");
                break;
            case R.id.action_settings:
                toast("Configurações!");
                break;
            case MENU_REMOVER:
                toast("Remover!");
                break;
        }
        return super.onOptionsItemSelected(item);
    } // close onOptionItemSelected();

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_SHORT).show();
    }

}
