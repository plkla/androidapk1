package com.example.zadanie7;
import static com.example.zadanie7.R.color.red;

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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;

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




    public void zaznaczona(View view) {
        TextView tekst1 = findViewById(R.id.tekst);
        boolean zaznaczone = ((RadioButton) view).isChecked();
        int idCheckBox = view.getId();
        if (idCheckBox == R.id.czerwony) {
            int color = ContextCompat.getColor(this, R.color.red);
            tekst1.setTextColor(color);
        } else if (idCheckBox == R.id.zielony) {
            int color = ContextCompat.getColor(this, R.color.green);
            tekst1.setTextColor(color);
        } else if (idCheckBox == R.id.niebieski) {
            int color = ContextCompat.getColor(this, R.color.blue);
            tekst1.setTextColor(color);
        }
    }
}