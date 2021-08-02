package com.example.untitled;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView entrance = findViewById(R.id.entrance);

        entrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent netflopIntent = new Intent(getApplicationContext(), NetflopHome.class);
                startActivity(netflopIntent);
            }
        });
    }
}
