package br.gov.sp.cps.fatecdiadema.megasena;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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

    public void gerarNumeros(View view) {

        //Declarando os componentes da inteface em um vetor
        TextView[] texto = {
                findViewById(R.id.textView),
                findViewById(R.id.textView3),
                findViewById(R.id.textView4),
                findViewById(R.id.textView2),
                findViewById(R.id.textView5),
                findViewById(R.id.textView6)
        };

        //Gerar números aleatórios
        Set<Integer> numeros = new HashSet<>();
        Random aleatorio = new Random();

        while(numeros.size() < 6) {
            numeros.add(aleatorio.nextInt(60) + 1);
        }

        //Ordenar números aleatórios
        List<Integer> lista = new ArrayList<>(numeros);
        Collections.sort(lista);

        //Mostrar números
        for(int i=0; i<6; i++) {
            texto[i].setText(" " + String.format("%02d", lista.get(i)) + " ");
        }
    }

    public void limparNumeros(View view) {

        TextView[] texto = {
                findViewById(R.id.textView),
                findViewById(R.id.textView3),
                findViewById(R.id.textView4),
                findViewById(R.id.textView2),
                findViewById(R.id.textView5),
                findViewById(R.id.textView6)
        };

        for(int i=0; i<6; i++) {
            texto[i].setText("      ");
        }
    }
}