package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

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

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                    );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );
    }

    public void on_off(View view) {
        TextView tekst1 = findViewById(R.id.tekst1);

        ToggleButton toggleButton = (ToggleButton) view;
        boolean stan = toggleButton.isChecked();
        LinearLayout layoutMain = findViewById(R.id.main);

        if (stan) {
            tekst1.setText("Tryb nocny włączony");
            layoutMain.setBackgroundColor(Color.BLACK);
            tekst1.setTextColor(Color.WHITE);
        } else {
            tekst1.setText("Tryb dzienny włączony");
            layoutMain.setBackgroundColor(Color.WHITE);
            tekst1.setTextColor(Color.BLACK);
        }
    }

    public void Dane(View view) {

        TextView tekst1 = findViewById(R.id.tekst1);

        boolean stan = ((Switch) view).isChecked();

        if (stan) {
            tekst1.setText("Wyraziłeś zgodę marketingową");
        } else {
            tekst1.setText("Nie wyraziłeś zgody");
        }
    }
}