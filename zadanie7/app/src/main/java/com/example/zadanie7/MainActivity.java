package com.example.zadanie7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;import android.widget.ImageView;import android.widget.LinearLayout;
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void wysletanie_hasla(View view) {
        TextView tekst1 = findViewById(R.id.tekst1);
        EditText pobrane = findViewById(R.id.haslotekst);
        String haslo = pobrane.getText().toString();
        Switch switch1 = (Switch) view;
        boolean stan = switch1.isChecked();
        LinearLayout layoutMain = findViewById(R.id.main);
        ImageView obrazek = findViewById(R.id.obraz);


        if (stan) {
            obrazek.setImageResource(R.drawable.ic_eye_open);
            tekst1.setText(haslo);
        } else {
            obrazek.setImageResource(R.drawable.ic_eye_closed);
            tekst1.setText("ukryte haslo");
        }
    }

}