package com.example.tugas4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private PenggunaAdapter adapter;
    private ArrayList<Pengguna>itemArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new PenggunaAdapter(itemArrayList);
        RecyclerView.LayoutManager
                layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Pengguna("Tasya Farasya","Beauty Blogger", "Jakarta",R.drawable.tasya_farasya));
        itemArrayList.add(new Pengguna("Karin Novilda","Selebriti", "Jakarta",R.drawable.karis));
        itemArrayList.add(new Pengguna("Erika Karlina","Selebgram", "Cilacap",R.drawable.erikacar));
    }
}