/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama File: Program.java
 * Deskripsi: Main
 * Pembuat: Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal: 18 Mei 2026
 */

package jdbc.program;
import jdbc.service.MysqlMahasiswaService;
import java.sql.*;
import java.util.List;
import jdbc.model.Mahasiswa;
import java.util.ArrayList;

public class Program {
    /* Atribut */
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    /* Method */
    public static void main(String args[]) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        System.out.println("----- INSERT ATTEMPT -----");
        Mahasiswa mhsAdd = new Mahasiswa(26122006, "Faiq");
        service.add(mhsAdd);
        System.out.println("Insert berhasil.");
        System.out.println("--------------------------");
        
        System.out.println("----- UPDATE ATTEMPT -----");
        mhsAdd.setNama("Maulana Ghazzam Adil Al Faiq");
        System.out.println("Faiq diubah menjadi nama lengkap!");
        service.update(mhsAdd);
        System.out.println("Update berhasil.");
        System.out.println("--------------------------");
        
        System.out.println("----- DELETE ATTEMPT -----");
        Mahasiswa toDelete = new Mahasiswa(7, "Donald Bebek");
        System.out.println("Hapus Donald Bebek!");
        service.delete(toDelete);
        System.out.println("Delete berhasil.");
        System.out.println("--------------------------");
        
        System.out.println("----- GET MHS ATTEMPT -----");
        System.out.println("Cari ID = 3");
        Mahasiswa grabById = service.getById(3);
        System.out.printf("ID = %d | NAMA = %s\n", grabById.getId(), grabById.getNama());
        System.out.println("---------------------------");
        
        System.out.println("----- GET ALL ATTEMPT -----");
        listmhs = service.getAll();
        System.out.println("ISI TABEL Mahasiswa:");
        int i = 1;
        for (Mahasiswa mhs : listmhs) {
            System.out.printf("  Baris ke-%d --> ID = %d | NAMA = %s\n", i, mhs.getId(), mhs.getNama());
            i++;
        }
        System.out.println("---------------------------");
    }
}
