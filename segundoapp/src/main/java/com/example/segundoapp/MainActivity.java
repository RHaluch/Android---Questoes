package com.example.segundoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Disciplina> disciplinas;
    private ListView listaDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDisciplinas = findViewById(R.id.listMaterias);
        disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Banco de Dados", 8.5,"Segunda"));
        disciplinas.add(new Disciplina("Algoritmos", 6.5, "Terça"));
        disciplinas.add(new Disciplina("Redes", 3.0,"Quarta"));

        preencheListaDisciplinas();


    }

    private void preencheListaDisciplinas(){
        ArrayAdapter listaAdapter = new DisciplinaAdapter(MainActivity.this,R.layout.materia_item, disciplinas);
        listaDisciplinas.setAdapter(listaAdapter);

    }
}
