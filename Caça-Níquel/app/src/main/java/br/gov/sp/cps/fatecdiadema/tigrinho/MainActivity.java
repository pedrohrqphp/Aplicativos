package br.gov.sp.cps.fatecdiadema.tigrinho;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

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

    //Lógica para gerar número aleatório
    public void gerarNumero(View view) {
        //Declarando os componentes da interface
        //Tipo variável = acharPeloId(R.id.tipo)
        TextView texto = findViewById(R.id.textView);

        //Declarando objeto de uma classe do Java para gerar números aleatórios
        Random aleatorio = new Random();

        int n1 = aleatorio.nextInt(7) + 1;
        int n2 = aleatorio.nextInt(7) + 1;
        int n3 = aleatorio.nextInt(7) + 1;

        texto.setText(String.format("%d%d%d", n1, n2, n3));

        //Gerador de True e False
        //texto.setText(String.valueOf(aleatorio.nextBoolean()));
        //Deixa o texto em CapsLock
        //texto.setAllCaps(true);
    }

    //Lógica para limpar os números gerados
    public void limparNumero(View view) {
        TextView texto = findViewById(R.id.textView);

        texto.setText("000");
    }
}