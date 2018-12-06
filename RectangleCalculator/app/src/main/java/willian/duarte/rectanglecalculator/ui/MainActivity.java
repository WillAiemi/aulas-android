package willian.duarte.rectanglecalculator.ui;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import willian.duarte.rectanglecalculator.R;
import willian.duarte.rectanglecalculator.model.Rectangle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etWidth;
    private EditText etHeight;
    private Button btCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ma_et_calc:
                Rectangle r = new Rectangle(MainActivity.this);
                if (etWidth.getText().toString().isEmpty()){
                    etWidth.setError(getResources().getString(R.string.et_width_error));
                    return;
                }
                if (etHeight.getText().toString().isEmpty()){
                    etHeight.setError(getResources().getString(R.string.et_height_error));
                    return;
                }
                r.setWidth(Double.parseDouble(etWidth.getText().toString()));
                r.setHeight(Double.parseDouble(etHeight.getText().toString()));
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(getResources().getText(R.string.rectangle));
                msg.setMessage(r.toString());
                msg.setNeutralButton(getResources().getText(R.string.alert_neutral_button),null);
                msg.show();
                break;
        }

    }

    private void initialize(){
        etWidth = findViewById(R.id.ma_et_width);
        etHeight = findViewById(R.id.ma_et_height);
        btCalc = findViewById(R.id.ma_et_calc);

        btCalc.setOnClickListener(this);
    }
}
