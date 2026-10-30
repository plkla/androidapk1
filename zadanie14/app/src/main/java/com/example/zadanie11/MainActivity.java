package com.example.zadanie11;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
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

        RatingBar ratingBar = findViewById(R.id.ratingbar1);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                int ocena = (int) ratingBar.getRating();
                Toast.makeText (MainActivity. this, " cena to: " + ocena,
                        Toast.LENGTH_SHORT).show();

                TextView textView;
                textView = findViewById(R.id.tekst);

                int kolor;
                if(ocena < 2){
                    kolor = Color.RED;
                    ratingBar.setProgressTintList(ColorStateList.valueOf(kolor));
                    textView.setText("Słabo");
                }else if(ocena == 5){
                    kolor = Color.GREEN;
                    ratingBar.setProgressTintList(ColorStateList.valueOf(kolor));
                    textView.setText("Dobrze");
                }else{
                    kolor = Color.YELLOW;
                    ratingBar.setProgressTintList(ColorStateList.valueOf(kolor));
                    textView.setText("Normalnie");
                }
                Log.d("wartość v" ,String.valueOf(rating));
                Log.d("wartość b" , String.valueOf(fromUser));

            }
        });




    }
}
