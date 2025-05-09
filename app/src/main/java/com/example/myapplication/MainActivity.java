package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    Button btnPage1, btnPage2, btnPage3, btnPage4, btnPage5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPage1 = findViewById(R.id.btnPage1);
        btnPage2 = findViewById(R.id.btnPage2);
        btnPage3 = findViewById(R.id.btnPage3);
        btnPage4 = findViewById(R.id.btnPage4);
        btnPage5 = findViewById(R.id.btnPage5);

        btnPage1.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new PageOneFragment())
                    .commit();
            Toast.makeText(this, "Page 1", Toast.LENGTH_SHORT).show();
        });

        btnPage2.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new PageTwoFragment())
                    .commit();
            Toast.makeText(this, "Page 2", Toast.LENGTH_SHORT).show();
        });

        btnPage3.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new PageThreeFragment())
                    .commit();
            Toast.makeText(this, "Page 3", Toast.LENGTH_SHORT).show();
        });

        btnPage4.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new PageFourFragment())
                    .commit();
            Toast.makeText(this, "Page 4", Toast.LENGTH_SHORT).show();
        });

        btnPage5.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new PageFiveFragment())
                    .commit();
            Toast.makeText(this, "Page 5", Toast.LENGTH_SHORT).show();
        });
    }
}
