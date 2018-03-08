package jsport.joinsport;


import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Persistencia.Persistencia;

public class Iniciar_Sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar__sesion);
        final Button IniciarSesion = (Button) findViewById(R.id.btIniciarSesion);

        IniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (datosValidos()) {
                    Log.d("Datos validos");
                    //Ir a la pantalla de los anuncios, no está creada todavía
                    /*Intent CambiarActivity = new Intent(getApplicationContext(), Registro.class);
                    startActivity(CambiarActivity);*/
                } else {
                    Log.d("Datos invalidos");
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("Datos incorrectos");
                    AlertDialog alert = builder.create();
                    alert.show();
                    final TextView textError = (TextView) findViewById(R.id.txError);
                    textError.setVisibility(View.VISIBLE);
                }
            }
        });
    }

       public boolean datosValidos () {
            final EditText valorEmail=(EditText) findViewById(R.id.txEmail);
            String email=valorEmail.getText().toString();
            final EditText valorPwd=(EditText) findViewById(R.id.txPwd);
            String pwd=valorPwd.getText().toString();
            String pwdEsperada=Persistencia.getPasswordUsuario(email);
            return pwd.equals(pwdEsperada);
        }

    }

