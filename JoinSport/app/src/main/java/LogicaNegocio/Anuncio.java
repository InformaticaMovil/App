package LogicaNegocio;

import java.sql.Date;

public class Anuncio {
    private int id;
    private String provincia;
    private String localidad;
    private Date fecha;
    private Date hora;
    private String direccion;
    private String recorrido;

    public void Anuncio(int id, String p, String l, Date f, Date h, String d, String r){
        this.id = id;
        this.provincia = p;
        this.localidad = l;
        this.fecha = h;
        this.hora = h;
        this.direccion = d;
        this.recorrido = r;
    }

}
