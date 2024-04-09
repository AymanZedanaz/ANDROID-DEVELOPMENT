package com.example.teststorageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.teststorageapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    private static final String PERMISSION_RECORD_AUDIO = Manifest.permission.;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(
                v -> requestRunTimePermission()
        );
    }

    private void requestRunTimePermission(){

    }

}