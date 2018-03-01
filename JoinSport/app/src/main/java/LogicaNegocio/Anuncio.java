package LogicaNegocio;

import java.sql.Date;
import java.sql.Time;

public class Anuncio {
    private int id;
    private String provincia;
    private String localidad;
    private Date fecha;
    private Time hora;
    private String direccion;
    private String recorrido;

    public void Anuncio(int id, String p, String l, Date f, Time h, String d, String r){
        this.id = id;
        this.provincia = p;
        this.localidad = l;
        this.fecha = h;
        this.hora = h;
        this.direccion = d;
        this.recorrido = r;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }
}
