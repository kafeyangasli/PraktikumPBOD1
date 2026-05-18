/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama File: Mysqlutility.java
 * Deskripsi: Kelas untuk koneksi MySQL
 * Pembuat: Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal: 18 Mei 2026
 */

package jdbc.utilities;
import java.sql.*;

public class Mysqlutility {
    /* Atribut */
    private static Connection koneksi;
    
    /* Method */
    public static Connection getConnection() {
        if (koneksi == null) { // belum terkoneksi
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root";
                String password = user; // sama
                
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil!");
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Driver tidak ditemukan!\nFull Error: " + cnfe.getMessage());
            } catch (SQLException sqle) {
                System.out.println("SQL error!\nFull Error: " + sqle.getMessage());
            }
        }
        
        return koneksi;
    }
    
    public static void closeConnection() {
        try {
            koneksi.close();
            koneksi = null;
        } catch (SQLException sqle) {
            System.out.println("SQL error!\nFull Error: " + sqle.getMessage());
        }
    }
}
