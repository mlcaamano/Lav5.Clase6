package com.example.alumno.clase06;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View itemView;

    TextView txNombre;
    TextView txApellido;

    public MyViewHolder(View v){
        super(v);
        //this.itemView=v.findViewById(R.id.textNombre);
        txNombre=(TextView)v.findViewById(R.id.textNombre);
        txApellido=(TextView)v.findViewById(R.id.txtA);
    }

    public void setNombre(String nombre){
        txNombre.setText(nombre);
    }

    public void setApellido(String apellido){

        txApellido.setText(apellido);
    }
}
