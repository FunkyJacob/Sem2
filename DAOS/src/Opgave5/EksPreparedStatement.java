package Opgave5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class EksPreparedStatement {

    public static void main(String[] args) {

        try {
            System.out.println("Opret Tidsregistering ");
            BufferedReader inLine = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Indtast StartTid: ");
            String Starttid = inLine.readLine();
            System.out.println("Intast Sluttid: ");
            String Sluttid = inLine.readLine();
            System.out.println("Indtast beskrivelse: ");
            String beskrivelse = inLine.readLine();
            System.out.println("Indtast Dato: ");
            String Dato = inLine.readLine();
            System.out.println("Indtast MedarbejderNummer: ");
            String MedarbejderNummer = inLine.readLine();
            System.out.println("Indtast OpgaveNummer: ");
            String OpgaveNummer = inLine.readLine();

            Connection minConnection;
            minConnection = DriverManager.getConnection(
                    "jdbc:sqlserver://LAPTOP-JET8R749\\SQLExpress;databaseName=Tidsregistering;user=sa;password=Rullekebab;");

            String sql = "insert into Tidsregistrering values(?,?,?,?,?,?) ";// preparedStatement
            PreparedStatement prestmt = minConnection.prepareStatement(sql);
            prestmt.clearParameters();

            prestmt.setString(1, Starttid);
            prestmt.setString(2, Sluttid);
            prestmt.setString(3, beskrivelse);
            prestmt.setString(4, Dato);
            prestmt.setInt(5, Integer.parseInt(MedarbejderNummer.trim()));
            prestmt.setInt(6, Integer.parseInt(OpgaveNummer.trim()));

            prestmt.executeUpdate();
            System.out.println("Tidsregistering indsat");

            prestmt.close();
            minConnection.close();

        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

}
