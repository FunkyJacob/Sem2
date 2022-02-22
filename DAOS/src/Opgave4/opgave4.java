package Opgave4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class opgave4 {
//    create proc MedarbejderNavnOgTfl
//            as
//    select m.navn, m.mobil
//    from medarbejder m
//
//    Dette er hvad du skriver i Mangetment studioes

    public static void main(String[] args) {
        Connection minConnection;

        try {

            minConnection = DriverManager
                    .getConnection("jdbc:sqlserver://LAPTOP-JET8R749\\SQLExpress;databaseName=Tidsregistering;user=sa;password=Rullekebab;");
//            Husk at ændre databasen så den passer til den du skal bruge

            Statement stmt = minConnection.createStatement();

            ResultSet res = stmt.executeQuery("exec MedarbejderNavnOgTfl");
            while (res.next()) {
                System.out.println(res.getString(1) + "\t" + res.getString(2) );
            }

            res.close();
            stmt.close();
            if(!minConnection.isClosed()) {
                minConnection.close();
            }

        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

}
