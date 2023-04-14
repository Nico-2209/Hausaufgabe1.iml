package Aufgaben.Datenbank;

import java.sql.*;

public class MySQL extends MySQLMethoden {

    private static String url = "jdbc:mysql://localhost:3306/hauptzentrale";
    private static String user = "root";
    private static String password = "root";

    public static void main(String[] args) {

addKundenToKundenTabelle("Nico","Steinberg",url,user,password);
getTabelle("kunden",url,user,password);
deleteKundeWithID(2,url,user,password);
getTabelle("kunden",url,user,password);

    }

}