package org.example.platzi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_Connection(){

        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ChatSystem", "root", "Changazion127074");
            if(conection != null){
                System.out.println("Conexion Exitosa a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            throw new RuntimeException(e);
        }
        return conection;
    }
}
