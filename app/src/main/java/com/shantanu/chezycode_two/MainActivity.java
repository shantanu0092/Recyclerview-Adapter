package com.shantanu.chezycode_two;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycl_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] lang = {"sks","ravi","neha","kksingh", "priya", "henna","payal","vivek","priya", "henna","payal","vivek"};
        recyclerView.setAdapter(new Adapter(lang));
    }
}
