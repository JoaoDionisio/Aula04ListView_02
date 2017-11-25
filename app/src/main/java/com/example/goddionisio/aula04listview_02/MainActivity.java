package com.example.goddionisio.aula04listview_02;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends ListActivity{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.output);

        String[] diasSemana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, diasSemana);
        setListAdapter(adapter);

    }
}
