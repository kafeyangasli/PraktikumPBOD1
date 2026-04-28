/*
    File        : Mahasiswa.java
    Deskripsi   : Class Mahasiswa dengan polimorfisme overloading method
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 23 April 2026
*/

public class Mahasiswa {
    /* Atribut */
    private String NIM;
    private String nama;
    private String program_studi;

    /* Methods */
    
    // Konstruktor Tanpa Parameter (Point C)
    Mahasiswa() {
        this.NIM = "999";
        this.nama = "n/a";
        this.program_studi = "n/a";
    }

    // Konstruktor Berparameter Sesuai Input (Point D)
    Mahasiswa(String NIM, String nama, String program_studi) {
        this.NIM = NIM;
        this.nama = nama;
        this.program_studi = program_studi;
    }

    // Konstruktor Kloning (Point E)
    Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.getNIM();
        this.nama = mhs.getNama();
        this.program_studi = mhs.getProgramStudi();
    }
    // Getter
    public String getNIM() {
        return this.NIM;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProgramStudi() {
        return this.program_studi;
    }

    // Print Info
    public void printMhs() {
        System.out.println("========= Data Mahasiswa ==========");
        System.out.printf("Nama\t\t: %s\n", this.NIM);
        System.out.printf("NIM\t\t: %s\n", this.nama);
        System.out.printf("Program Studi\t: %s\n", this.program_studi);
        System.out.println("===================================");
    }

    // Setter Program Studi VA : Tak berparameter
    public void setProgramStudi() {
        this.program_studi = "Kosong";
    }

    // Setter Program Studi VB : Parameter 1 String
    public void setProgramStudi(String ps) {
        this.program_studi = ps;
    }

    // Setter Program Studi VC : Parameter Mahasiswa
    public void setProgramStudi(Mahasiswa mhs) {
        this.program_studi = mhs.getProgramStudi();
    }

    // Main
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
