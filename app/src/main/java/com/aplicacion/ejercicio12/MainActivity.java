package com.aplicacion.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.aplicacion.ejercicio12.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button btnEnviar = findViewById(R.id.btnEnviar);
         EditText EtxtNombre = findViewById(R.id.EtxtNombre);
         EditText EtxtApellido = findViewById(R.id.Etxtapellido);
         EditText EtxtEdad = findViewById(R.id.EtxtEdad);
         EditText EtxtCorreo = findViewById(R.id.EtxtCorreo);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviarDatos = new Intent(MainActivity.this, RecibirActivity.class);
                String nombre = EtxtNombre.getText().toString();
                String apellido = EtxtApellido.getText().toString();
                String edad = EtxtEdad.getText().toString();
                String correo = EtxtCorreo.getText().toString();
                enviarDatos.putExtra("nombre",nombre+"");
                enviarDatos.putExtra("apellido",apellido+"");
                enviarDatos.putExtra("edad",edad+"");
                enviarDatos.putExtra("correo",correo+"");
                startActivity(enviarDatos);
            }
        });

    }
}