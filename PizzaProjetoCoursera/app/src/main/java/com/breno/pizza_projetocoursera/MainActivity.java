package com.breno.pizza_projetocoursera;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton pizzaButton;
    private Button      buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaButton = (ImageButton) findViewById(R.id.pizzabutton);
        buttonAbout = (Button)      findViewById(R.id.aboutbutton);

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PizzaSizeActivity.class);
                startActivity(intent);
            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Este projeto se trata da demonstração de aplicabilidade" +
                        " dos conhecimentos coletados do curso Introdução ao Desenvolvimento " +
                        "de Aplicativos Android fornecido pela Universidade Estadual de Campinas. " +
                        "Por tanto a aplicação, propositalmente, não tem por ensejo seguir com exatidão diversas condutas" +
                        " de boas práticas de produção de código Java e demais condutas recomendaveis" +
                        " no fluxo de ações. \n\n - Francisco Breno Moura Alves.";
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

                alert.setTitle("SOBRE ESSA APLICAÇÃO:");
                alert.setMessage(message);
                alert.show();
            }
        });
    }
}
