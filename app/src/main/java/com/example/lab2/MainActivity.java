package com.example.lab2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements CallbackListener {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_1 inputFragment = new Fragment_1();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainerView, inputFragment).commit();

        Fragment_2 outputFragment = new Fragment_2();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainerView2, outputFragment).commit();
    }

    @Override
    public void onTextSubmitted(String text) {
        Fragment_2 outputFragment = (Fragment_2) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
        outputFragment.setText(text);
    }

    }
