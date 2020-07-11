package com.example.travelmantics;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.travelmantics.databinding.ActivityListBinding;

public class ListActivity extends AppCompatActivity {
    private ActivityListBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final DealAdapter adapter = new DealAdapter();
        binding.rvDeals.setAdapter(adapter);
        LinearLayoutManager dealsLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        binding.rvDeals.setLayoutManager(dealsLayoutManager);

    }
}