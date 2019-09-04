package com.example.segundoapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class DisciplinaAdapter extends ArrayAdapter<Disciplina> {

    private int rID;
    public DisciplinaAdapter(Context context, int resource, List<Disciplina> list){
        super(context,resource,list);
        rID=resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){

        View mView=currentView;

        if(mView==null){
            LayoutInflater inflate = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflate.inflate(rID,null);
        }
        Disciplina disciplina = getItem(position);


        TextView textMateria = mView.findViewById(R.id.textMateria);
        TextView textNota = mView.findViewById(R.id.textNota);
        TextView textDia = mView.findViewById(R.id.textDia);

        if(disciplina.getNota()>=7.0){
            textNota.setTextColor(Color.GREEN);
        }else if(disciplina.getNota() >= 4.0 && disciplina.getNota()<7){
            textNota.setTextColor(Color.YELLOW);
        }else {
            textNota.setTextColor(Color.RED);
        }
        textMateria.setText(disciplina.getMateria());
        textNota.setText(String.valueOf(disciplina.getNota()));
        textDia.setText(disciplina.getDia());

        return mView;
    }
}
