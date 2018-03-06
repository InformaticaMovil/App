package jsport.joinsport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        final Button Registrarme = (Button) findViewById(R.id.btRegistro);
        final Button IniciarSesion = (Button) findViewById(R.id.btLogin);

        Registrarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CambiarActivity = new Intent(getApplicationContext(), Registro.class);
                startActivity(CambiarActivity);
            }
        });

        IniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CambiarActivity2 = new Intent(getApplicationContext(), Iniciar_Sesion.class);
                startActivity(CambiarActivity2);
            }
        });
    }
}
