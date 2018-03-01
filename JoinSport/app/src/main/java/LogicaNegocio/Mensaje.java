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

}
