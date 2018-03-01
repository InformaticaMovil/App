package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

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
        ps.setString(2, apellidos);
        ps.setString(3, password);
        ps.setString(4, email);
        ps.setInt(5, telefono);
        ps.setPaula(1, nombre);


    }

}