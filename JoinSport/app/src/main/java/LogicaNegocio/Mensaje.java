package LogicaNegocio;


public class Mensaje {
    private int id;
    private String asunto;
    private String contenido;
    private boolean estado;

    public void Mensaje(int id, String a, String c, boolean e){
        this.id = id;
        this.asunto = a;
        this.contenido = c;
        this.estado = e;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
