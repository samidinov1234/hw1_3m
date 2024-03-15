package com.example.hw1_3m;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.btnSEND.getRootView());
        binding.btnSend.setOnClickListener(v -> {
            //Intent intent = new Intent(MainActivity.this, SecondActivity.class);            //startActivity(intent);
            Intent intent = new Intent();
            intent.setType("text/html");
            intent.putExtra(Intent.EXTRA_EMAIL, binding.etEmail.getText().toString());
            intent.putExtra(Intent.EXTRA_SUBJECT, binding.etTheme.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, binding.etText.getText().toString());
            startActivity(Intent.createChooser(intent, "Send"));
        });
    }
}