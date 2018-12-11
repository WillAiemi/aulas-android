package willian.duarte.exerciciosintentpermissions.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import willian.duarte.exerciciosintentpermissions.R;

public class Screen4Dexter extends AppCompatActivity implements View.OnClickListener {

    private EditText etPhone;
    private Button btCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4_dexter);


        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.s4_bt_call:
                Dexter.withActivity(this)
                        .withPermission(Manifest.permission.CALL_PHONE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse response) {
                                if(ContextCompat.checkSelfPermission(Screen4Dexter.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                                    Uri uri = Uri.parse("tel:" + etPhone.getText().toString());
                                    Intent it = new Intent(Intent.ACTION_CALL, uri);
                                    startActivity(it);
                                }
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse response) {
                                Toast.makeText(getBaseContext(),"You have to allow us so we can call your grandma",Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                                token.continuePermissionRequest();
                            }
                        })
                        .check();

                break;
        }
    }

    private void init(){
        etPhone = findViewById(R.id.s4_et_phone);
        btCall = findViewById(R.id.s4_bt_call);
        btCall.setOnClickListener(this);
    }
}
