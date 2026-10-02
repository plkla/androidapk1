package com.example.zadanie7;
import android.widget.CheckBox;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
 int kwota = 0;
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


    public void policz(View view) {
        boolean zaznaczone = ((CheckBox) view).isChecked();
        int idCheckBox = view.getId();

        if (idCheckBox == R.id.dostawa) {
            if (zaznaczone) {
                kwota += 10;
            } else {
                kwota -= 10;
            }

        } else if (idCheckBox == R.id.opakowanie) {
            if (zaznaczone) {

                kwota += 15;

            } else {

                kwota -= 15;

            }

        } else if (idCheckBox == R.id.platnosc) {
            if (zaznaczone) {
                kwota += 5;
            } else {
                kwota -= 5;
            }
        }

        TextView textView = findViewById(R.id.tekst2);
        textView.setText("Do zapłaty dodatkowo " + kwota + " złotych");
    }
}