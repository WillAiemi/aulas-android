package willian.duarte.exerciciosintentpermissions.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import willian.duarte.exerciciosintentpermissions.R;

public class Screen3 extends AppCompatActivity implements View.OnClickListener {

    private EditText etPhone;
    private Button btCall;

    private static final int REQUEST_CODE_PERMISSION_CALL_PHONE = 2222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        init();
    }// close onCreate()

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.s4_bt_call:
                if (etPhone.getText().toString().isEmpty()){
                    etPhone.setError("Type a phone here to call...");
                    return;
                }
                if(ContextCompat.checkSelfPermission(
                        Screen3.this,
                        Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(
                            Screen3.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_CODE_PERMISSION_CALL_PHONE);
                } else {
                    Uri uri = Uri.parse("tel:" + etPhone.getText().toString());
                    Intent it = new Intent(Intent.ACTION_CALL, uri);
                    startActivity(it);
                }
                break;
        }
    }// close onClick()

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case REQUEST_CODE_PERMISSION_CALL_PHONE:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    for (int i = 0; i < permissions.length; i++) {
                        if (permissions[i].equalsIgnoreCase(Manifest.permission.CALL_PHONE)) {
                            if(ContextCompat.checkSelfPermission(Screen3.this,
                                    Manifest.permission.CALL_PHONE ) == PackageManager.PERMISSION_GRANTED) {

                                Uri uri = Uri.parse("tel:" + etPhone.getText().toString());
                                Intent it = new Intent(Intent.ACTION_CALL, uri);
                                startActivity(it);
                            }
                        }//if
                    }//for
                }else if(grantResults[0] == PackageManager.PERMISSION_DENIED){
                    //EXPLICAÇÃO!
                    if(ActivityCompat.shouldShowRequestPermissionRationale(
                            Screen3.this, Manifest.permission.CALL_PHONE)){

                        Toast.makeText(getBaseContext(),
                                "You need to allow the permission to make the phone call.", Toast.LENGTH_LONG).show();
                    }//if
                }//fecha else if
                break;
        }
    }

    private void init(){
        etPhone = findViewById(R.id.s4_et_phone);
        btCall = findViewById(R.id.s4_bt_call);
        btCall.setOnClickListener(this);
    }// close init()

}
