package org.example.platzi;

import java.sql.Connection;

public class Inicio {

    public static void main(String[] args){

        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_Connection()){

        }catch(Exception e){

            System.out.println(e);

        }


    }
}
