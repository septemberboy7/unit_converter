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

public class TempActivity extends AppCompatActivity {

    Temperature temperature = new Temperature();
    TextView tvC, tvF;
    EditText et;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        init();

        setValues(0);
    }

    private void init() {
        tvC = (TextView) findViewById(R.id.tvC);
        tvF = (TextView) findViewById(R.id.tvF);
        et = (EditText) findViewById(R.id.etValue);
        sp = (Spinner) findViewById(R.id.spinner);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0)
                    setValues(Double.parseDouble(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (et.getText().length() > 0)
                    setValues(Double.parseDouble(et.getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setValues(double value) {

        if (sp.getSelectedItemPosition() == 0) {
            temperature.setC(value);
        } else {
            temperature.setF(value);
        }

        tvC.setText(temperature.getC() + "");
        tvF.setText(temperature.getF() + "");
    }
}
