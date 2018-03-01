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
        Connection con=conectar();
        String consulta = "SELECT NOMBRE FROM Usuario WHERE ID=?";
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

    public static void setNombreUsuario(int id, String nombre){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET NOMBRE=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //APELLIDOS
    public static String getApellidosUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT APELLIDOS FROM Usuario WHERE ID=?";
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

    public static void setApellidosUsuario(int id, String apellidos){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET APELLIDOS=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, apellidos);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //PASSWORD
    public static String getPasswordUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT PASSWORD FROM Usuario WHERE ID=?";
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

    public static void setPasswordUsuario(int id, String password){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET PASSWORD=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, password);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //EMAIL
    public static String getEmailUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT EMAIL FROM Usuario WHERE ID=?";
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

    public static void setEmailUsuario(int id, String email){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET EMAIL=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, email);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //TELEFONO
    public static int getTelefonoUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT TELEFONO FROM Usuario WHERE ID=?";
        PreparedStatement ps = null;
        int resultado=0;
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getInt(1);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void setTelefonoUsuario(int id, String telefono){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET TELEFONO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, telefono);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //SEXO
    public static String getSexoUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT SEXO FROM Usuario WHERE ID=?";
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

    public static void setSexoUsuario(int id, String sexo){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET SEXO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, sexo);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //CIUDAD
    public static String getCiudadUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT CIUDAD FROM Usuario WHERE ID=?";
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

    public static void setCiudadUsuario(int id, String ciudad){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET CIUDAD=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, ciudad);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //PROVINCIA
    public static String getProvinciaUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT PROVINCIA FROM Usuario WHERE ID=?";
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

    public static void setProvinciaUsuario(int id, String provincia){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET PROVINCIA=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, provincia);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //FOTO
    public static String getFotoUsuario(int id){
        Connection con=conectar();
        String consulta = "SELECT PROVINCIA FROM Usuario WHERE ID=?";
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

    public static void setFotoUsuario(int id, String foto){
        Connection con=conectar();
        String consulta = "UPDATE Usuario SET FOTO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, foto);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    //ASUNTO
    public static String getAsunto(int id){
        Connection con=conectar();
        String consulta = "SELECT ASUNTO FROM MENSAJE WHERE ID=?";
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

    public static void setAsunto(int id, String asunto){
        Connection con=conectar();
        String consulta = "UPDATE MENSAJE SET ASUNTO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, asunto);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //CONTENIDO
    public static String getContenido(int id) {
        Connection con=conectar();
        String consulta = "SELECT CONTENIDO FROM MENSAJE WHERE ID=?";
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

    public static void setContenido(int id, String contenido){
        Connection con=conectar();
        String consulta = "UPDATE MENSAJE SET CONTENIDO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, contenido);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //ESTADO
    public static boolean getEstado(int id) {
        Connection con=conectar();
        String consulta = "SELECT ESTADO FROM MENSAJE WHERE ID=?";
        PreparedStatement ps = null;
        boolean resultado=false;
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            resultado=rs.getBoolean(1);
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void setEstado(int id, boolean contenido){
        Connection con=conectar();
        String consulta = "UPDATE MENSAJE SET ESTADO=? WHERE ID=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(consulta);
            ps.setBoolean(1, contenido);
            ps.setInt(2, id);
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