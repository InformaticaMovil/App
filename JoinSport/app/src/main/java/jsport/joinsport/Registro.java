package jsport.joinsport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        EditText Nombre = findViewById(R.id.txNombre);
        EditText Apellidos = findViewById(R.id.txApellidos);
        EditText Sexo = findViewById(R.id.txSexo);
        EditText Telefono = findViewById(R.id.txTelefono);
        EditText Ciudad = findViewById(R.id.txCiudad);
        EditText Provincia = findViewById(R.id.txProvincia);
        EditText Email = findViewById(R.id.txEmail);
        EditText Password = findViewById(R.id.txPassword);

    }

    public void registrar() {

    }
}
