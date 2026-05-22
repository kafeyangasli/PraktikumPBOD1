/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama File: MysqlMahasiswaService.java
 * Deskripsi: Service MySQL Mahasiswa
 * Pembuat: Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal: 18 Mei 2026
 */

package jdbc.service;
import jdbc.utilities.Mysqlutility;
import jdbc.model.Mahasiswa;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class MysqlMahasiswaService {
    /* Atribut */
    Connection koneksi = null;
    
    /* Method */
    public MysqlMahasiswaService() {
        koneksi = Mysqlutility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(int id, String nama) {
        return new Mahasiswa(id, nama);
    }
    
    private String executeUpdate(String query) {
        String error = "Success!";
        
        if (koneksi != null) {
            try {
                Statement s = koneksi.createStatement();
                s.executeUpdate(query);
                s.close();
            } catch (SQLException sqle) {
                System.out.println("SQL error!\nFull Error: " + sqle.getMessage());
                error = sqle.getMessage();
            }
        }
        
        return error;
    }
    
    public String add(Mahasiswa mhs) {
        String query = "INSERT INTO Mahasiswa (id, nama) VALUES (%d, '%s');";
        query = query.formatted(mhs.getId(), mhs.getNama());
        System.out.println(query);
        return executeUpdate(query);
    }
    
    public String add(String nama) {
        String query = "INSERT INTO Mahasiswa (nama) VALUES ('%s');";
        query = query.formatted(nama);
        System.out.println(query);
        return executeUpdate(query);
    }
    
    public String update(Mahasiswa mhs) {
        String query = "UPDATE Mahasiswa SET nama = '%s' WHERE id = %d;";
        query = query.formatted(mhs.getNama(), mhs.getId());
        return executeUpdate(query);
    }
    
    public String delete(Mahasiswa mhs) {
        String query = "DELETE FROM Mahasiswa WHERE id = %d;";
        query = query.formatted(mhs.getId());
        return executeUpdate(query);
    }
    
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM Mahasiswa WHERE id = %d LIMIT 1;";
        query = query.formatted(id);
        Mahasiswa retMhs;
        
        if (koneksi != null) {
            try {
                Statement s = koneksi.createStatement();
                ResultSet rs = s.executeQuery(query);
                
                if (rs.next()) {
                    retMhs = new Mahasiswa(rs.getInt(1), rs.getString(2));
                } else {
                    retMhs = new Mahasiswa(67, "NULL");
                }
                
                s.close();
            } catch (SQLException sqle) {
                System.out.println("SQL error!\nFull Error: " + sqle.getMessage());
                retMhs = new Mahasiswa(67, "NULL");
            }
        } else {
            retMhs = new Mahasiswa(67, "NULL");
        }
        
        return retMhs;
    }
    
    public List<Mahasiswa> getAll() {
        String query = "SELECT * FROM Mahasiswa;";
        List<Mahasiswa> retMhs = new ArrayList<>();
        
        if (koneksi != null) {
            try {
                Statement s = koneksi.createStatement();
                ResultSet rs = s.executeQuery(query);
                
                while (rs.next()) {
                    retMhs.add(new Mahasiswa(rs.getInt(1), rs.getString(2)));
                }
                
                s.close();
            } catch (SQLException sqle) {
                System.out.println("SQL error!\nFull Error: " + sqle.getMessage());
            }
        }
        
        return retMhs;
    }
}
