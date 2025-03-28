package br.gov.sp.fatec.imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Acima extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acima);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button voltar = findViewById(R.id.button6);
        voltar.setOnClickListener(view -> {
            finish();
        });

        Intent intent = getIntent();

        double altura = Double.parseDouble(intent.getStringExtra("Altura"));
        double peso = Double.parseDouble(intent.getStringExtra("Peso"));
        double imc = intent.getDoubleExtra("IMC", 0.0);

        TextView textoIMC = findViewById(R.id.textView19);
        textoIMC.setText(String.format("%.2f", imc));

        TextView textoAltura = findViewById(R.id.textView22);
        textoAltura.setText(String.format("%.2f", altura));

        TextView textoPeso = findViewById(R.id.textView24);
        textoPeso.setText(String.format("%.2f", peso));
    }
}