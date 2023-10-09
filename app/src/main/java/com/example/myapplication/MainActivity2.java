package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewResultValue = findViewById(R.id.textViewResultValue);

        double resultado = getIntent().getDoubleExtra("resultado", 0);
        textViewResultValue.setText(String.valueOf(resultado));


        Button regresar = findViewById(R.id.Volver);
        Intent intent = new Intent(this, MainActivity.class);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);

            }
        });

    }
}