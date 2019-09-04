package com.example.questoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup questao01, questao02, questao03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questao01 = findViewById(R.id.radio1);
        questao02 = findViewById(R.id.radio2);
        questao03 = findViewById(R.id.radio3);
    }

    public void verificar(View view) {
        int result01 = questao01.getCheckedRadioButtonId();
        int result02 = questao02.getCheckedRadioButtonId();
        int result03 = questao03.getCheckedRadioButtonId();
        int acertos=0;

        switch(result01){
            case R.id.radio1_2:
                acertos++;
                break;
        }
        switch(result02){
            case R.id.radio2_1:
                acertos++;
                break;
        }
        switch(result03){
            case R.id.radio3_4:
                acertos++;
                break;
        }
        String saida=acertos+" acertos";
        Toast.makeText(this, saida, Toast.LENGTH_SHORT).show();
    }
}
