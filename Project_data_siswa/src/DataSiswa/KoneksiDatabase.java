
package DataSiswa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi;
    public static Statement stm;
    public static ResultSet res;
    
    public static Connection getKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_siswa";
            String user="root";
            String pass="";
            
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.err.println("gagal" +e.getMessage());
        }
        return koneksi;
    }
}
