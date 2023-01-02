package com.doug.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "'Devíamos ser ensinados a não esperar por inspiração para começar algo. Ação sempre gera inspiração. Inspiração raramente gera ação.'",
                "'Não importa que você vá devagar, contanto que você não pare.'",
                "'Nunca esqueça que a sua felicidade não depende de mais ninguém!'",
                "'As conquistas dependem de 50% de inspiração, criatividade e sonhos, e 50% de disciplina, trabalho árduo e determinação. São duas pernas que devem caminhar juntas.'"
        };

        /*TextView texto = findViewById(R.id.textResultado);
        int numero = Math.abs(new Random().nextInt()) % frases.length;
        texto.setText(frases[numero]);*/

        TextView texto = findViewById(R.id.textResultado);
        int numero = new Random().nextInt(4);
        texto.setText(frases[numero]);
    }
}



