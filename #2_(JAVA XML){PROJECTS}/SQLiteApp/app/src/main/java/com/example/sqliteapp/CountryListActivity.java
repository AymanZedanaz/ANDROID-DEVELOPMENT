package com.example.sqliteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class CountryListActivity extends AppCompatActivity {

    final String[] from = new String[] { DatabaseHelper._ID,
            DatabaseHelper.SUBJECT, DatabaseHelper.DESC};

    final int[] to = new int[] { R.id.id, R.id.title, R.id.desc};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_emp_list);

        DBManager dbManager = new DBManager(this);
        dbManager.open();
        Cursor cursor = dbManager.fetch();

        ListView listView = findViewById(R.id.list_view);
           listView.setEmptyView(findViewById(R.id.empty));

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.activity_main_record,
                cursor, from, to, 0);

           adapter.notifyDataSetChanged();

           listView.setAdapter(adapter);

           listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long viewId) {
                   TextView idTextView = view.findViewById(R.id.id);
                   TextView titleTextView = view.findViewById(R.id.title);
                   TextView descTextView = view.findViewById(R.id.desc);

                   String id = idTextView.getText().toString();
                   String title = titleTextView.getText().toString();
                   String desc = descTextView.getText().toString();

                   Intent modify_intent = new Intent(getApplicationContext(),
                           ModifyCountryActivity.class);

                   modify_intent.putExtra("title", title);
                   modify_intent.putExtra("desc", desc);
                   modify_intent.putExtra("id", id);

                   startActivity(modify_intent);
               }
           });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.add_record){
            Intent add_mem = new Intent(this, AddCountryActivity.class);
            startActivity(add_mem);
        }
        return super.onOptionsItemSelected(item);
    }
}