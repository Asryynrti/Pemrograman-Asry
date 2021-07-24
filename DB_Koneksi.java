package tobat1 ;

import java.sql.*;
import javax.swing.*;

public class DB_Koneksi {
    Connection koneksi ;
    public Connection getConnection (){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/projek","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return koneksi;
    }
    
}