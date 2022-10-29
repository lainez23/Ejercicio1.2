package com.aplicacion.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecibirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);
        TextView txtnombre = findViewById(R.id.txtnombre);
        TextView txtapellido = findViewById(R.id.txtapellido);
        TextView txtedad = findViewById(R.id.txtedad);
        TextView txtcorreo = findViewById(R.id.txtcorreo);

        Intent recibirDatos = getIntent();
        String Nombre = recibirDatos.getStringExtra("nombre");
        String apellido = recibirDatos.getStringExtra("apellido");
        String edad = recibirDatos.getStringExtra("edad");
        String correo = recibirDatos.getStringExtra("correo");
        txtnombre.setText(Nombre);
        txtapellido.setText(apellido);
        txtedad.setText(edad);
        txtcorreo.setText(correo);
    }
}