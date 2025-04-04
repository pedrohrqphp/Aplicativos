package com.example.avatar;

import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private RadioGroup groupCamisa, groupCalca, groupCabeca, groupCalcado, groupAcessorio;
    private ImageView imgCamisa, imgCalca, imgCabeca, imgCalcado, imgAcessorio;

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

        //RadioGroup
        groupCamisa = findViewById(R.id.groupCamisa);
        groupCalca = findViewById(R.id.groupCalca);
        groupCabeca = findViewById(R.id.groupCabeca);

        //ImageView
        imgCamisa = findViewById(R.id.camisa);
        imgCalca = findViewById(R.id.calca);
        imgCabeca = findViewById(R.id.cabeca);

        groupCamisa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    imgCamisa.setImageResource(R.drawable.camisa_vermelha);
                    imgCamisa.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton2) {
                    imgCamisa.setImageResource(R.drawable.biquine);
                    imgCamisa.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton3) {
                    imgCamisa.setImageResource(R.drawable.camisa_preta);
                    imgCamisa.setVisibility(VISIBLE);
                }
            }
        });

        groupCalca.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton4) {
                    imgCalca.setImageResource(R.drawable.jeans);
                    imgCalca.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton5) {
                    imgCalca.setImageResource(R.drawable.bermuda);
                    imgCalca.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton6) {
                    imgCalca.setImageResource(R.drawable.saia);
                    imgCalca.setVisibility(VISIBLE);
                }
            }
        });

        groupCabeca.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton7) {
                    imgCabeca.setImageResource(R.drawable.bone);
                    imgCabeca.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton8) {
                    imgCabeca.setImageResource(R.drawable.cabelo_preto);
                    imgCabeca.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton9) {
                    imgCabeca.setImageResource(R.drawable.careca);
                    imgCabeca.setVisibility(VISIBLE);
                } else if (checkedId == R.id.radioButton10) {
                    imgCabeca.setImageResource(R.drawable.oculos);
                    imgCabeca.setVisibility(VISIBLE);
                }
            }
        });
    }
}