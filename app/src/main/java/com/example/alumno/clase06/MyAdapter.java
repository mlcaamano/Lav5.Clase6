package com.example.alumno.clase06;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private List<Persona> list;

    public MyAdapter(List<Persona>lst){
        this.list=lst;
    }


    @Override

    //Transforma un layout(XML) en view a travez de un inflate
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("onCreateViewHolder", "-");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }

    @Override
    //Bindea la info de la lista con la view
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona p= list.get(position);
        holder.setNombre(p.getNombre());
        holder.setApellido(p.getApellido());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

}
