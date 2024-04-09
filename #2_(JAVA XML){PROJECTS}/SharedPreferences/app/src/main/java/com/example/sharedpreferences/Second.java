package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    Button btn_show;
    SharedPreferences show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_show = findViewById(R.id.btn_show);

        show = getSharedPreferences("nekha", MODE_PRIVATE);

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = show.getString("name","NoAyman");
                Toast.makeText(Second.this, name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}