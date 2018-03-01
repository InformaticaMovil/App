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
                        " VALUES(?,?,?,?,?,?,?,?,?)";
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
    public static void insertarAnuncio(String provincia, String localidad, Date fecha, Time hora, String direccion, String recorrido) {
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


    public static void eliminarAnuncio(){}


    public static String getProvincia (int id) {
        Connection con=conectar();
        String consulta = "SELECT PROVINCIA FROM ANUNCIO WHERE ID=?";
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

    public static String getLocalidad(int id) {
        Connection con=conectar();
        String consulta = "SELECT LOCALIDAD FROM ANUNCIO WHERE ID=?";
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


    public static Time getHora(int id) {
        Connection con=conectar();
        String consulta = "SELECT HORA FROM ANUNCIO WHERE ID=?";
        PreparedStatement ps = null;
        Time resultado=null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=Time(rs.getTime(1));
            ps.close();
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

    public static Date getFecha(int id) {
        Connection con=conectar();
        String consulta = "SELECT FECHA FROM ANUNCIO WHERE ID=?";
        PreparedStatement ps = null;
        Date resultado=null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getDate(1);
            ps.close();
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

    public static String getDireccion(int id) {
        Connection con=conectar();
        String consulta = "SELECT DIRECCION FROM ANUNCIO WHERE ID=?";
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

    public static String getRecorrido(int id) {
        Connection con=conectar();
        String consulta = "SELECT RECORRIDO FROM ANUNCIO WHERE ID=?";
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

    public static void setProvincia(int id, String provincia) {
        Connection con=conectar();
        String consulta = "UPDATE ANUNCIO SET PROVINCIA=? WHERE ID=?";
        PreparedStatement ps = null;
        String resultado="";
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, provincia);
            ps.setInt(2, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getString(1);
            ps.close();
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
    }

    public static void setLocalidad(int id, String localidad) {
        Connection con=conectar();
        String consulta = "UPDATE ANUNCIO SET LOCALIDAD=? WHERE ID=?";
        PreparedStatement ps = null;
        String resultado="";
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, localidad);
            ps.setInt(2, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getString(1);
            ps.close();
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
    }

    public static void setFecha(int id, Date fecha) {
        Connection con=conectar();
        String consulta = "UPDATE ANUNCIO SET FECHA=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setDate(1, fecha);
            ps.setInt(2, id);
            ps.execute();
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
    }

    public static void setHora(int id, Time hora) {
        Connection con=conectar();
        String consulta = "UPDATE ANUNCIO SET HORA=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setTime(1, hora);
            ps.setInt(2, id);
            ps.execute();
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
    }

    public static void setRecorrido(int id, String recorrido) {
        Connection con=conectar();
        String consulta = "UPDATE ANUNCIO SET RECORRIDO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, recorrido);
            ps.setInt(2, id);
            ps.execute();
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

    public static void eliminarMensaje(){

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
}