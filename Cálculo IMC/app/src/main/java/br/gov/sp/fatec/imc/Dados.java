package br.gov.sp.fatec.imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dados);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText altura = findViewById(R.id.editTextText);
        EditText peso = findViewById(R.id.editTextText2);

        Button voltar = findViewById(R.id.button3);
        voltar.setOnClickListener(view -> {
            finish();
        });

        Button calcular = findViewById(R.id.button2);
        calcular.setOnClickListener(view -> {

            double alturaValor = Double.parseDouble(altura.getText().toString());
            double pesoValor = Double.parseDouble(peso.getText().toString());

            double imc = pesoValor / (alturaValor * alturaValor);

            if (imc <= 18.5 ) {
                Intent intent = new Intent(this, Abaixo.class);
                intent.putExtra("Altura", altura.getText().toString());
                intent.putExtra("Peso", peso.getText().toString());
                intent.putExtra("IMC", imc);
                startActivity(intent);
                finish();
            }

            else if (imc > 18.5 && imc < 25.0) {
                Intent intent = new Intent(this, Normal.class);
                intent.putExtra("Altura", altura.getText().toString());
                intent.putExtra("Peso", peso.getText().toString());
                intent.putExtra("IMC", imc);
                startActivity(intent);
                finish();
            }

            else {
                Intent intent = new Intent(this, Acima.class);
                intent.putExtra("Altura", altura.getText().toString());
                intent.putExtra("Peso", peso.getText().toString());
                intent.putExtra("IMC", imc);
                startActivity(intent);
                finish();
            }
        });
    }
}