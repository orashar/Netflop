package com.example.untitled;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NetflopHome extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_layout);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("movie1", "icon1"));
        items.add(new Item("movie2", "icon2"));
        items.add(new Item("movie3", "icon3"));
        items.add(new Item("movie4", "icon4"));
        items.add(new Item("movie5", "icon5"));
        items.add(new Item("movie6", "icon6"));
        items.add(new Item("movie7", "icon7"));
        items.add(new Item("movie8", "icon8"));

        ListOneAdapter adapterOne = new ListOneAdapter(this, items);

        ListView listOneView = (ListView) findViewById(R.id.list1);

        listOneView.setAdapter(adapterOne);

        listOneView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = items.get(position);

                Toast toast = Toast.makeText(getApplicationContext(), item.getItemTitle(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
