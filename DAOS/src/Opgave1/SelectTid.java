package Opgave1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTid {

    public static void main(String[] args) {
        Connection minConnection;

        try {

            minConnection = DriverManager
                    .getConnection("jdbc:sqlserver://LAPTOP-JET8R749\\SQLExpress;databaseName=Tidsregistering;user=sa;password=Rullekebab;");

            Statement stmt = minConnection.createStatement();

            ResultSet res = stmt.executeQuery("select * from medarbejder");
            while (res.next()) {
                System.out.println(res.getString(1) + "\t" + res.getString(2) + " \t " + res.getString(3) + "\t" + res.getString(4));
                System.out.println(res.getString(2) + "\t"  + res.getString(4));
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
