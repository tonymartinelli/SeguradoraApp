package com.example.root.seguradoraco.view;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.root.seguradoraco.R;
import com.example.root.seguradoraco.controller.ListaCarros;
import com.example.root.seguradoraco.googleMaps.MapsActivity;
import com.example.root.seguradoraco.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListaCarros listaCarros = new ListaCarros();

    final int txtPlacaLista       = R.id.txtListaPlaca;
    final int txtMarcaModeloLista = R.id.txtMarcaModeloLista;
    final int txtQtdEventosLista  = R.id.txtQtdEventosLista;
    final int idLvCarros          = R.id.lvCarros;


    private Button btnConfirmar, btnDeletar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton fabNovoCarro = findViewById(R.id.fabNovoCarro);
        btnConfirmar = (Button) findViewById(R.id.btnConfirmar);



        fabNovoCarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NovoCarroActivity.class);
                view.getContext().startActivity(intent);
            }
        });

    }
}
