package LogicaNegocio;



public class Deporte {
    private int id;
    private String nombre;
    private String imagen;

    public void Deporte (int id, String nombre, String imagen) {
        this.id=id;
        this.nombre=nombre;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
