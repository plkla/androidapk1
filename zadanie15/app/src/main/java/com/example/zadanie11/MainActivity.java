package com.example.zadanie11;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

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

        ProgressBar pasekProgresu = findViewById(R.id.progressBar2);
        pasekProgresu.setMax(10);
        new CountDownTimer(10000,1){
            @Override
            public void onTick(long millisUntilFinished) {

                pasekProgresu.setProgress((int)(millisUntilFinished/1000));
                TextView textView;
                textView = findViewById(R.id.tekst);
                textView.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                TextView textView;
                textView = findViewById(R.id.tekst);
                textView.setText("Koniec");
                ProgressBar a = findViewById(R.id.progressBar1);
                a.setVisibility(View.GONE);
            }
        }.start();




    }
}
