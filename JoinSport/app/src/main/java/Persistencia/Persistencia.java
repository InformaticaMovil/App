package Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class Persistencia {

    public static Connection conectar() {
        Connection conexionMySQL = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexionMySQL = DriverManager.getConnection("jdbc:mysql://99.000webhost.io:3306/id4898649", "root", "Jsport2018");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexionMySQL;
    }

    //MÉTODOS DE USUARIO
    public static void insertarUsuario(String nombre, String apellidos, String password, String email, int telefono,
                                String sexo, String ciudad, String provincia, String foto) {
        Connection con=conectar();
        String consulta="INSERT INTO Usuario(NOMBRE, APELLIDOS, PASSWORD, EMAIL, TELEFONO, SEXO, CIUDAD, PROVINCIA, FOTO) " +
                        " values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps=con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, password);
            ps.setString(4, email);
            ps.setInt(5, telefono);
            ps.setString(6, sexo;
            ps.setString(7, ciudad);
            ps.setString(8, provincia);
            ps.setString(9, foto);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    //NOMBRE
    public static String getNombreUsuario(int id){

    }

    public static String setNombreUsuario(int id){

    }

    //APELLIDOS
    public static String getApellidosUsuario(int id){

    }

    public static String setApellidosUsuario(int id){

    }

    //PASSWORD
    public static String getPasswordUsuario(int id){

    }

    public static String setPasswordUsuario(int id){

    }

    //EMAIL
    public static String getEmailUsuario(int id){

    }

    public static String setEmailUsuario(int id){

    }

    //TELEFONO
    public static int getTelefonoUsuario(int id){

    }

    public static String setTelefonoUsuario(int id){

    }

    //SEXO
    public static String getSexoUsuario(int id){

    }

    public static String setSexoUsuario(int id){

    }

    //CIUDAD
    public static int getCiudadUsuario(int id){

    }

    public static int setCiudadUsuario(int id){

    }

    //PROVINCIA
    public static String getProvinciaUsuario(int id){

    }

    public static String setProvinciaUsuario(int id){

    }

    //FOTO
    public static String getFotoUsuario(int id){

    }

    public static String setFotoUsuario(int id){

    }


    //MÉTODOS DE ANUNCIO
    public static void insertarAnuncio(String provincia, String localidad, Date fecha, Date hora, String direccion, String recorrido) {
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
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getProvincia(int id) {
        Connection con=conectar();
        String consulta = "Select PROVINCIA from DEPORTE where ID=?";
        PreparedStatement ps = null;
        String resultado="";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultado;
    }

    public static Date getLocalidad(int id) {
        Connection con=conectar();
        String consulta = "Select LOCALIDAD from DEPORTE where ID=?";
        PreparedStatement ps = null;
        String resultado="";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getString(1);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }




    //MÉTODOS DE MENSAJE
    public static void insertarMensaje(String asunto, String contenido, boolean estado) {
        Connection con=conectar();
        String consulta = "INSERT INTO MENSAJE(ASUNTO, CONTENIDO, ESTADO) VALUES (?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, asunto);
            ps.setString(2, contenido);
            ps.setBoolean(3, estado);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //MÉTODOS DE DEPORTE
    public static void insertarDeporte(String nombre, String imagen) {
        Connection con=conectar();
        String consulta="INSERT INTO Deporte(NOMBRE, IMAGEN) " +
                " values(?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, imagen);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getNombreDeporte(int id) {
        Connection con=conectar();
        String consulta = "SELECT NOMBRE from DEPORTE where ID=?";
        PreparedStatement ps = null;
        String resultado="";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getString(1);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static String getImagenDeporte(int id) {
        Connection con=conectar();
        String consulta = "Select IMAGEN from DEPORTE where ID=?";
        PreparedStatement ps = null;
        String resultado="";
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getString(1);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void setNombreDeporte(String nombre, int id) {
        Connection con=conectar();
        String consulta="UPDATE Deporte SET NOMBRE=? WHERE ID=?";
        try {
            PreparedStatement ps=con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.executeQuery();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setImagenDeporte(String imagen, int id) {
        Connection con=conectar();
        String consulta="UPDATE Deporte SET IMAGEN=? WHERE ID=?";
        try {
            PreparedStatement ps=con.prepareStatement(consulta);
            ps.setString(1, imagen);
            ps.setInt(2, id);
            ps.executeQuery();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}