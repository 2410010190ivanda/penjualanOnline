package config;



import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static Connection con;

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost/penjualanonline";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(
                    new com.mysql.cj.jdbc.Driver()
            );

            con = DriverManager.getConnection(url, user, pass);

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            System.out.println(e);

        }

        return con;
    }
}