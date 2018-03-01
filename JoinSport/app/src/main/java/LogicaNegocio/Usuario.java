package LogicaNegocio;


public class Usuario {
    private int id;
    private String nombre;
    private String apellidos;
    private String password;
    private String email;
    private int telefono;
    private String sexo;
    private String ciudad;
    private String provincia;
    private String foto;

    public void Anuncio( int id, String nombre, String apellidos, String password, String email, int telefono,
                    String sexo, String ciudad, String provincia, String foto) {
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.password=password;
        this.email=email;
        this.telefono=telefono;
        this.sexo=sexo;
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.foto=foto;
    }
}
