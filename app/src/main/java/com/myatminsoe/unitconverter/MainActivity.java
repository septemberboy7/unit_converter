package com.myatminsoe.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] type = {"Temperature", "Length", "Area", "Volume", "Weight", "Speed"};
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.list_item, R.id.textview, type);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getBaseContext(), TempActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getBaseContext(), LengthActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getBaseContext(), AreaActivity.class));
                    default:
                        break;
                }

            }
        });

    }
}
