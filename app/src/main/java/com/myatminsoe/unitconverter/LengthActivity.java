package com.myatminsoe.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {

    private TextView m, km, in, ft, mile;
    private Length toConvert = new Length();
    private EditText inputText;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        init();
        setValues(0);
    }

    private void init() {
        m = (TextView) findViewById(R.id.tvM);
        km = (TextView) findViewById(R.id.tvKm);
        in = (TextView) findViewById(R.id.tvIn);
        ft = (TextView) findViewById(R.id.tvFt);
        mile = (TextView) findViewById(R.id.tvMile);
        inputText = (EditText) findViewById(R.id.etValue);
        spinner = (Spinner) findViewById(R.id.spinner);

        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    double value = Double.parseDouble(s.toString());
                    setValues(value);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setValues(Double.parseDouble(inputText.getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setValues(double value) {
        switch (spinner.getSelectedItemPosition()) {
            case 0:
                toConvert.setM(value);
                break;
            case 1:
                toConvert.setKm(value);
                break;
            case 2:
                toConvert.setIn(value);
                break;
            case 3:
                toConvert.setFt(value);
                break;
            case 4:
                toConvert.setMile(value);
                break;
            default:
                break;
        }
        m.setText(toConvert.getM() + "");
        km.setText(toConvert.getKm() + "");
        in.setText(toConvert.getIn() + "");
        ft.setText(toConvert.getFt() + "");
        mile.setText(toConvert.getMile() + "");
    }
}