package br.gov.sp.cps.fatecdiadema.jokenpo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

    //Select Pedra:
    public void selectPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    //Select Papel:
    public void selectPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    //Select Tesoura:
    public void selecTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    //Analise das opções slecionadas e jogadas:
    public void opcaoSelecionada(String opcaoSelecionada) {
        //Instanciamento dos Objetos Manipulados:
        ImageView imgResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        //Lógica da escolha do pc:
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoPC = opcoes[numero];

        //Logica mudando a figura (Escolha do pc)
        switch (opcaoPC) {
            case "pedra":
                imgResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgResultado.setImageResource(R.drawable.tesoura);
        }

        //Lógica do jogo - analisando quem ganhou
        if(
                opcaoPC == "tesoura" && opcaoSelecionada == "papel" ||
                opcaoPC == "papel" && opcaoSelecionada == "pedra" ||
                opcaoPC == "pedra" && opcaoSelecionada == "tesoura"
        ) {
            textResultado.setText("A máquina venceu!");
        } else if (
                opcaoSelecionada == "tesoura" && opcaoPC == "papel" ||
                opcaoSelecionada == "papel" && opcaoPC == "pedra" ||
                opcaoSelecionada == "pedra" && opcaoPC == "tesoura"
        ) {
            textResultado.setText("Você ganhou!");
        } else {
            textResultado.setText("Empate!");
        }
    }
}