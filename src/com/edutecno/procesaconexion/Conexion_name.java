package com.edutecno.procesaconexion;

import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion_name {

    public static Connection conec=null;
    public static Statement st=null;
    public static ResultSet rt=null;
    public static String usu;
    public static String contra;
    public static String host;
    public static String db;
    public void Conectar(){
        try{
            usu="root"; contra="root"; host="localhost:3306"; db="prueba_4_jsp_servlet?serverTimezone=UTC";
            String url="jdbc:mysql://"+host+"/"+db;
            Class.forName("com.mysql.jdbc.Driver");
            conec=DriverManager.getConnection(url,usu,contra);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
