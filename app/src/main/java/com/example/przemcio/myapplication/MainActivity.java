package com.example.przemcio.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private String[] lang;
    private String[] phrases;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.model);
        initResources();
        initLanguagesListView();
    }

    private void initResources(){
        Resources res = getResources();
        lang = res.getStringArray(R.array.model);
    }

    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,lang));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id){
                switch(pos)
                {
                    case 0:
                        Context context;
                        context = getApplicationContext();
                        Intent intent = new Intent(context,zerowy.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Context context2;
                        context2 = getApplicationContext();
                        Intent intent2 = new Intent(context2 ,pierwszy.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Context context3;
                        context3 = getApplicationContext();
                        Intent intent3 = new Intent(context3 ,drugi.class);
                        startActivity(intent3);
                        break;

                }

            }
        });
    }


}
