package com.example.sqliteapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ModifyCountryActivity extends Activity implements View.OnClickListener {

    private EditText titleText;
    private EditText descText;

    private long _id;

    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_country);
        setTitle("Modify Record");

        setContentView(R.layout.activity_modify_country);

        dbManager = new DBManager(this);
        dbManager.open();

        titleText = findViewById(R.id.subject_edittext);
        descText = findViewById(R.id.description_edittext);

        Button updateBtn = findViewById(R.id.btn_update);
        Button deleteBtn = findViewById(R.id.btn_delete);

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");

        _id = Long.parseLong(id);

        titleText.setText(name);
        descText.setText(desc);

        updateBtn.setOnClickListener(this);
        deleteBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_update) {
            String title = titleText.getText().toString();
            String desc = descText.getText().toString();

            dbManager.update(_id, title, desc);
            this.returnHome();
        } else if (v.getId() == R.id.btn_delete) {
            dbManager.delete(_id);
            this.returnHome();
        }
    }

    private void returnHome() {
        Intent home_intent = new Intent(getApplicationContext(),
                CountryListActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(home_intent);
    }
}