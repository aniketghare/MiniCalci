package com.example.minicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.minicalci.databinding.Activity2Binding;

public class activity_2 extends AppCompatActivity {
    Activity2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String addition = String.valueOf(getIntent().getFloatExtra("addition",0));
        String subtraction = String.valueOf(getIntent().getFloatExtra("subtraction",0));
        String multiplication = String.valueOf(getIntent().getIntExtra("multiplication", 0));
        String division = String.valueOf(getIntent().getIntExtra("division",0));

        binding.textView11.setText(addition);
        binding.textView12.setText(subtraction);
        binding.textView13.setText(multiplication);
        binding.textView14.setText(division);
    }
}