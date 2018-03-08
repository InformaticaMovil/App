package jsport.joinsport;


import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Persistencia.Persistencia;

public class Iniciar_Sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar__sesion);
        final Button IniciarSesion = (Button) findViewById(R.id.btIniciarSesion);

        Toast t = Toast.makeText(getApplicationContext(), "PRINCIPIO", Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();


        IniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t3 = Toast.makeText(getApplicationContext(), "PRINCIPIO2", Toast.LENGTH_SHORT);
                t3.setGravity(Gravity.CENTER, 0, 0);
                t3.show();

                if (datosValidos()) {
                    Log.i("Error", "Datos validos");
                    //Ir a la pantalla de los anuncios, no está creada todavía
                    /*Intent CambiarActivity = new Intent(getApplicationContext(), Registro.class);
                    startActivity(CambiarActivity);*/
                } else {
                    Toast t = Toast.makeText(getApplicationContext(), "Datos invalidos", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                    final TextView textError = (TextView) findViewById(R.id.txError);
                    textError.setVisibility(View.VISIBLE);
                }
            }
        });
    }

       public boolean datosValidos () {
           Toast t = Toast.makeText(getApplicationContext(), "ENTRA DV", Toast.LENGTH_SHORT);
           t.setGravity(Gravity.CENTER, 0, 0);
           t.show();
            final EditText valorEmail=(EditText) findViewById(R.id.txEmail);
            String email= String.valueOf(valorEmail);
            final EditText valorPwd=(EditText) findViewById(R.id.txPwd);
            String pwd=valorPwd.getText().toString();
            String pwdEsperada=Persistencia.getPasswordUsuario(email);

           Toast t2 = Toast.makeText(getApplicationContext(), "ENTRA2 DV", Toast.LENGTH_SHORT);
           t2.setGravity(Gravity.CENTER, 0, 0);
           t2.show();

            return pwd.equals(pwdEsperada);
        }

    }

