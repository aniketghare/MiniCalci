package com.example.minicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.minicalci.databinding.Activity2Binding;
import com.example.minicalci.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = binding.textView.getText().toString();
                String value2 = binding.textView2.getText().toString();

                if (value1.isEmpty() || value2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter the values", Toast.LENGTH_SHORT).show();
                    return;
                }

                float num1 = Float.parseFloat(value1);
                float num2 = Float.parseFloat(value2);

                float addition = num1 + num2;
                float subtraction = num1 - num2;
                float multiplication = num1 * num2;

                if (num2 == 0) {
                    Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }

                float division = num1 / num2;

                // Pass the calculation results to activity_2
                Intent intent = new Intent(MainActivity.this, activity_2.class);
                intent.putExtra("addition", addition);
                intent.putExtra("subtraction", subtraction);
                intent.putExtra("multiplication", multiplication);
                intent.putExtra("division", division);
                startActivity(intent);
            }
        });
    }
}
