package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public static class Persistencia {

    public Connection conectar() {
        Connection conexionMySQL = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance ();
        conexionMySQL = DriverManager.getConnection("jdbc:mysql://99.000webhost.io:3306/id4898649", "root", "Jsport2018");
    }

    //MÉTODOS DE USUARIO
    public void insertarUsuario(String nombre, String apellidos, String password, String email, int telefono,
                                String sexo, String ciudad, String provincia, String foto) {
        Connection con=conectar();
        String consulta="INSERT INTO Usuario(NOMBRE, APELLIDOS, PASSWORD, EMAIL, TELEFONO, SEXO, CIUDAD, PROVINCIA, FOTO) " +
                        " values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(consulta);
        ps.setString(1, nombre);
        ps.set


    }

    //MÉTODOS DE ANUNCIO
    public void insertarAnuncio(String provincia, String localidad, Date fecha, Date hora, String direccion, String recorrido) {
        Connection con=conectar();
        String consulta = "INSERT INTO ANUNCIO(PROVINCIA, LOCALIDAD, FECHA, HORA, DIRECCIÓN, RECORRIDO) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, provincia);
            ps.setString(2, localidad);
            ps.setDate(3, fecha);
            ps.setDate(4, hora);
            ps.setString(5, direccion);
            ps.setString(6, recorrido);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //MÉTODOS DE MENSAJE
    public void insertarMensaje(String asunto, String contenido, boolean estado) {
        Connection con=conectar();
        String consulta = "INSERT INTO MENSAJE(ASUNTO, CONTENIDO, ESTADO) VALUES (?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, asunto);
            ps.setString(2, contenido);
            ps.setBoolean(3, estado);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}