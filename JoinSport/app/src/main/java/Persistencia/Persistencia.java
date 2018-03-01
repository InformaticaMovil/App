package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        try {
            PreparedStatement ps=con.prepareStatement(consulta);
            ps.setString(1, nombre);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}