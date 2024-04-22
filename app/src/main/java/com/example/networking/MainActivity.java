package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    private ArrayList<Mountain> mountains = new ArrayList<Mountain>();
    private RecyclerView.Adapter RecyclerViewController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountains.add(new Mountain("Fuji", "Tokyo", 3776));
        mountains.add(new Mountain("Kebnekaise", "Skanderna", 2096));
        mountains.add(new Mountain("Holland Peak", "Rocky Mountains", 2852));

        RecyclerView recView = findViewById(R.id.MountainList);
        RecyclerViewController adapter = new RecyclerViewController(this, mountains);
        recView.setLayoutManager(new LinearLayoutManager(this));

        recView.setAdapter(adapter);
       // new JsonFile(this, this).execute(JSON_FILE);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
