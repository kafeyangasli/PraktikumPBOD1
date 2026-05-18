/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama File: Mahasiswa.java
 * Deskripsi: Kelas Mahasiswa gokil
 * Pembuat: Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal: 18 Mei 2026
 */

package jdbc.model;

public class Mahasiswa {
    /* Atribut */
    private int id;
    private String nama;
    
    /* Method */
    
    // Konstruktor berparameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    // Getter
    public int getId() {
        return this.id;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    // Setter
    public void setNama(String newNama) {
        this.nama = newNama;
    }
}
