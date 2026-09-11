package com.example.costam;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void jakas_metoda(View view) {
        TextView tekst = findViewById(R.id.przycisk_1);
        tekst.setText("Kliknięto przycisk 1");



    }
    int wartosc = 0;
    public void dodaj_1(View view) {
        TextView tekst2 = findViewById(R.id.przycisk_2);
        wartosc = wartosc+1;
        tekst2.setText(String.valueOf(wartosc));

    }

    public void odejmowanie(View view) {
        TextView tekst2 = findViewById(R.id.przycisk_2);
        wartosc = wartosc-1;
        tekst2.setText(String.valueOf(wartosc));
    }

    public void reset(View view) {
        TextView tekst2 = findViewById(R.id.przycisk_2);
        wartosc = 0;
        tekst2.setText(String.valueOf(wartosc));

    }

    public void jakas_metoda2(View view) {
        TextView tekst = findViewById(R.id.przycisk_1);
        tekst.setText("Kliknięto przycisk 2");


    }

    public void jakas_metoda_reset(View view) {
        TextView tekst = findViewById(R.id.przycisk_1);
        tekst.setText("");

    }
}