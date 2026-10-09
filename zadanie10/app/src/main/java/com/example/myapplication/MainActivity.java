package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private String tekst = "Odpowiedź prawidłowa";
    private String tekst2 = "Odpowiedź błędna";
    private int duration = Toast.LENGTH_LONG;


    private Toast toast;
    private Toast toast2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        toast = Toast.makeText(this, tekst, duration);
        toast2 = Toast.makeText(this, tekst2, duration);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void zaznaczona(View view) {

        TextView tekst1 = findViewById(R.id.text2);
        Spinner kolor = findViewById(R.id.spinner);
        String wybor = String.valueOf(kolor.getSelectedItem());

        if (wybor.equals("zielony")) {
            toast.show();
        } else {
            toast2.show();
        }
            String tekst3 = String.valueOf(kolor.getSelectedItem());
            tekst1.setText(tekst3);



    }

}
