package com.teksconap.meujogo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int fase = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtHistoria = findViewById(R.id.txt_historia);
        final Button btnA = findViewById(R.id.btn_opcao_a);
        final Button btnB = findViewById(R.id.btn_opcao_b);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fase == 1) {
                    txtHistoria.setText("Você entrou no sistema! Agora você é um Hacker.");
                    btnA.setText("Baixar dados");
                    btnB.setText("Sair do sistema");
                    fase = 2;
                }
            }
        });
    }
}
