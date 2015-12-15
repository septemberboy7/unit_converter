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

public class AreaActivity extends AppCompatActivity {

    private TextView m2, km2, in2, ft2, mile2, hec, acre;
    private Area area = new Area();
    private EditText inputText;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        init();
    }

    private void init() {
        m2 = (TextView) findViewById(R.id.tvM);
        km2 = (TextView) findViewById(R.id.tvKm);
        in2 = (TextView) findViewById(R.id.tvIn);
        ft2 = (TextView) findViewById(R.id.tvFt);
        mile2 = (TextView) findViewById(R.id.tvMile);
        hec = (TextView) findViewById(R.id.tvHec);
        acre = (TextView) findViewById(R.id.tvAcre);
        inputText = (EditText) findViewById(R.id.etValue);
        spinner = (Spinner) findViewById(R.id.spinner);

        inputText.addTextChangedListener(new TextWatcher() {
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

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (inputText.getText().length() > 0)
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
                area.setM2(value);
                break;
            case 1:
                area.setKm2(value);
                break;
            case 2:
                area.setIn2(value);
                break;
            case 3:
                area.setFt2(value);
                break;
            case 4:
                area.setMile2(value);
                break;
            case 5:
                area.setHectare(value);
                break;
            case 6:
                area.setAcre(value);
                break;
            default:
                break;
        }

        m2.setText(area.getM2() + "");
        km2.setText(area.getKm2() + "");
        in2.setText(area.getIn2() + "");
        ft2.setText(area.getFt2() + "");
        mile2.setText(area.getMile2() + "");
        hec.setText(area.getHectare() + "");
        acre.setText(area.getAcre() + "");
    }

}

