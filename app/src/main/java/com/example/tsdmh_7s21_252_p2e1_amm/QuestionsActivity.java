package com.example.tsdmh_7s21_252_p2e1_amm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QuestionsActivity extends AppCompatActivity {

    RadioButton r1,r2,r3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        btn1 = findViewById(R.id.btn1);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked())
                    Toast.makeText(QuestionsActivity.this, "Selecciono Hombre", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void verificares(View v){
        if (v.getId() == R.id.r2){
            Toast.makeText(this, "Selecciono Mujer", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.r3){
            Toast.makeText(this, "No se definio", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.btn1){
            Intent intent = new Intent(this,MoveActivity.class);
            startActivity(intent);
            finish();
    }
    }
}