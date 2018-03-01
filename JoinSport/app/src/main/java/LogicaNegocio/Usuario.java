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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
