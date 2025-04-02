package com.example.checkbok;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Referencia dos Elementos View(objetos):
    private TextView textResultado;
    private CheckBox checkVerde, checkVermelho, checkAmarelo, checkPreto;
    private Button button = findViewById(R.id.button2);
    private RadioButton radioButton, radioButton2, radioButton3, radioButton4, radioButton5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        checkAmarelo = findViewById(R.id.checkAmarelo);
        checkPreto = findViewById(R.id.checkPreto);
        checkVerde = findViewById(R.id.checkVerde);
        checkVermelho = findViewById(R.id.checkVermelho);
        button = findViewById(R.id.button2);
        textResultado = findViewById(R.id.textView);

        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById();
        radioButton4 = findViewById();
        radioButton5 = findViewById()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Método para tratar o Checkbox

    public void radioButton() {
        if (radioButton.ischecked())  {
            textResultado.setText("Opção 1");
        } else if (radioButton.ischecked())  {
            textResultado.setText("Opção 1");
        }
        if (radioButton.ischecked())  {
            textResultado.setText("Opção 1");
        }
        if (radioButton.ischecked())  {
            textResultado.setText("Opção 1");
        }
    }

    public void checkBox() {

        String texto = "";

        if (checkVermelho.isChecked()) {

            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;
        }
        if (checkAmarelo.isChecked()) {

            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;
        }
        if (checkPreto.isChecked()) {

            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;
        }
        if (checkVerde.isChecked()) {

            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;
        }
        textResultado.setText(texto);
    }

    //Método para tratar o botão enviar
    public void enviar( View view) {

        checkBox();
    }
}