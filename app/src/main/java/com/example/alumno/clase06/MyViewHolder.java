package com.example.alumno.clase06;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View itemView;

    public MyViewHolder(View v){
        super(v);
        this.itemView=v.findViewById(R.id.textNombre);
    }

    public void setNombre(String nombre,String apellido){
        TextView tv=(TextView)itemView.findViewById(R.id.textNombre);
        TextView tv2=(TextView)itemView.findViewById(R.id.textApellido);
        tv.setText(nombre);
        tv2.setText(apellido);
    }
}
