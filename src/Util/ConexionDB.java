
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
        private static Connection conexionDB;

     public static Connection getConexionDB() {

        try {
            if (conexionDB == null) {

                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/ProyectoFINALPOO?useSSL=false&serverTimezone=UTC";
                String pwd = "123456789";
                String user = "root";

                Class.forName(driver);

                conexionDB = (Connection) DriverManager.getConnection(url, user, pwd);
                System.out.println("conexion exitosa");

            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getException());
            System.out.println("error en la clase de conexion");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error en la sql");
        }
        return conexionDB;
    }

}

