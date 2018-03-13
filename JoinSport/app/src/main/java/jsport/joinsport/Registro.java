package jsport.joinsport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;

import LogicaNegocio.Deporte;
import Persistencia.Persistencia;

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



        CheckBox Natacion = findViewById(R.id.chNatacion);
        CheckBox Ciclismo = findViewById(R.id.chCiclismo);
        CheckBox Baloncesto = findViewById(R.id.chBaloncesto);
        CheckBox Running = findViewById(R.id.chRunning);

        ArrayList<CheckBox> listaDeportesChecked = new ArrayList<CheckBox>();

        if (Natacion.isChecked()){ listaDeportesChecked.add(Natacion); }
        if (Ciclismo.isChecked()) { listaDeportesChecked.add(Ciclismo); }
        if (Baloncesto.isChecked()) {listaDeportesChecked.add(Baloncesto); }
        if (Running.isChecked()) {listaDeportesChecked.add(Running); }

    }

    public static String validarRegistro(String Nombre, String Apellidos, String Sexo, String Telefono, String Ciudad, String Provincia, String Email, String Password) {
        if (Nombre.getText() == NULL){
            return "Falta el campo Nombre";
        }
        if(Apellidos.getText() == NULL){


        }
        if(Sexo.getText() == NULL){

        }
        if(Telefono.getText() == NULL){

        }
        if(Ciudad.getText() == NULL){

        }
        if(Provincia.getText() == NULL){

        }
        if(Email.getText() == NULL){

        }
        if(Password.getText() == NULL){

        }
    }

    public void registrar() {

    }
}
