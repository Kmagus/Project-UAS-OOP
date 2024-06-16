/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengambilantiket;
/**
 * @author I GUSTI KOMANG AGUS PRAMANA
 * NIM: 2201010190
 * KELAS: L
 * TANGGAL 16/6/2024
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AGUS PRAMANA
 * tgl 19/06/2024
 */
public class Koneksi {
    public static Connection getConnection() throws SQLException {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiketkonser","root","");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi ke datagase gagal");
        }
        return cnn;
    }
}
