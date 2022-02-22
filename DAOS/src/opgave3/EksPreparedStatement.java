package opgave3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EksPreparedStatement {

    public static void main(String[] args) {

        try {
            BufferedReader inLine = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Indtast MedarbejderNavn: ");
            String medId = inLine.readLine();



            Connection minConnection;
            minConnection = DriverManager.getConnection(
                    "jdbc:sqlserver://LAPTOP-JET8R749\\SQLExpress;databaseName=Tidsregistering;user=sa;password=Rullekebab;");

            String sql = "Select * from Medarbejder m where navn = ? "  ;// preparedStatement
            PreparedStatement prestmt = minConnection.prepareStatement(sql);
            prestmt.clearParameters();

            prestmt.setString(1, medId.trim() );


            ResultSet res = prestmt.executeQuery();
            res.next();
            System.out.println(res.getString(4));

            prestmt.close();
            minConnection.close();

        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

}
