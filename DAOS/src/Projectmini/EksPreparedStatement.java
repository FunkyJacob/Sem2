package Projectmini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EksPreparedStatement {

    public static void main(String[] args) {

        try {
            System.out.println("Insert Karakter ");
            BufferedReader inLine = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Indtast Karakter: ");
            String karakter = inLine.readLine();
            System.out.println("Intast ForsøgNummer: ");
            String forsogNummer = inLine.readLine();
            System.out.println("Indtast StudieId: ");
            String studieID = inLine.readLine();
            System.out.println("Indtast EksamensNavn: ");
            String eksamensNavn = inLine.readLine();

            Connection minConnection;
            minConnection = DriverManager.getConnection(
                    "jdbc:sqlserver://LAPTOP-JET8R749\\SQLExpress;databaseName=MiniProject;user=sa;password=Rullekebab;");

            String sql = "insert into Karakter(karakter, forsoegsCounter, studieID, EksamensNavn) values(?,?,?,?) ";// preparedStatement
            PreparedStatement prestmt = minConnection.prepareStatement(sql);
            prestmt.clearParameters();

            prestmt.setInt(1, Integer.parseInt(karakter));
            prestmt.setInt(2, Integer.parseInt(forsogNummer));
            prestmt.setInt(3, Integer.parseInt(studieID));
            prestmt.setString(4, eksamensNavn.trim());

            prestmt.executeUpdate();
            System.out.println("Karakter indsat");

            prestmt.close();
            minConnection.close();


        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
            System.out.println("Kode: " + e.getErrorCode());
            if (e.getErrorCode() == 547) {
                System.out.println("--Karakteren du prøvede at indsætte er ikke på karakter skalaen--");
            }
            if (e.getErrorCode() == 8152) {
                System.out.println("--Eksamensnavnet er for langt - prøv et kortere navn --");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

