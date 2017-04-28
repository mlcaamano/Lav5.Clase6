package com.example.alumno.clase06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> list = new ArrayList<Persona>();
        list.add(new Persona("p1","p1"));
        list.add(new Persona("p2","p2"));
        list.add(new Persona("p3","p3"));
        list.add(new Persona("p34","p4"));
        list.add(new Persona("p5","p5"));
        list.add(new Persona("p6","p6"));
        list.add(new Persona("p1","p1"));
        list.add(new Persona("p2","p2"));
        list.add(new Persona("p3","p3"));
        list.add(new Persona("p34","p4"));
        list.add(new Persona("p5","p5"));
        list.add(new Persona("p6","p6"));
        list.add(new Persona("p1","p1"));
        list.add(new Persona("p2","p2"));
        list.add(new Persona("p3","p3"));
        list.add(new Persona("p34","p4"));
        list.add(new Persona("p5","p5"));
        list.add(new Persona("p6","p6"));

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        RecyclerView rcv = (RecyclerView) this.findViewById(R.id.rcvPersonas);
        MyAdapter adapter = new MyAdapter(list);


        rcv.setAdapter(adapter);
        rcv.setLayoutManager(layoutManager);
    }
}
