/*
    File        : Overloading.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Overloading
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 23 April 2026
*/

public class Overloading {
    /* Atribut */

    /* Methods */
    public static void main(String args[]) {
        /* Kamus */
        Mahasiswa MHS1, MHS2, MHS3;

        /* Algoritma */
        // Test Konstruktor tanpa parameter
        MHS1 = new Mahasiswa();
        MHS1.printMhs();
    
        // Test Konstruktor dengan parameter sesuai input
        MHS2 = new Mahasiswa("24060124130083", "Faiq", "Informatika");
        MHS2.printMhs();

        // Test Konstruktor dengan parameter Mahasiswa lain (kloning)
        MHS3 = new Mahasiswa(MHS2);
        MHS3.setProgramStudi("Ilmu Komputer");
        MHS3.printMhs();
        
        // Test VA --> Kosong
        MHS1.setProgramStudi();
        MHS1.printMhs();
        
        // Test VB --> Ilmu Komputer
        MHS1.setProgramStudi("Ilmu Komputer");
        MHS1.printMhs();
        
        // Test VC --> Informatika (cloning MHS1)
        MHS1.setProgramStudi(MHS2);
        MHS1.printMhs();
    }
}
