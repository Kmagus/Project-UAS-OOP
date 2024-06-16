package pengambilantiket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author I GUSTI KOMANG AGUS PRAMANA
 * NIM: 2201010190
 * KELAS: L
 * TANGGAL 16/6/2024
 */

public class PengambilanTiket {

    public static void main(String[] args) throws SQLException {
  
            //list_all();
            frntiket FTiket = new frntiket();
            FTiket.setResizable(false);
            FTiket.setVisible(true);
        
    }

    public static void list_all() throws SQLException {
        Connection cnn = Koneksi.getConnection();
        if (cnn == null) {
            System.out.println("Koneksi Gagal");
            return; // Exit the method if the connection is null
        }

        try (cnn) {
            String sqlvd = "SELECT * FROM datatiket;";
            try (PreparedStatement PS = cnn.prepareStatement(sqlvd);
                 ResultSet rs = PS.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Nama    :" + rs.getString("nama"));
                    System.out.println("Nim  :" + rs.getString("nim"));
                    System.out.println("Angkatan    :" + rs.getString("angkatan"));
                    System.out.println("Jumlah    :" + rs.getString("jumlah"));
                }
            }
        }
    }
}
