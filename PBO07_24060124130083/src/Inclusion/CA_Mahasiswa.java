/*
    File        : CA_Mahasiswa.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion (subclass)
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 25 April 2026
*/

public class CA_Mahasiswa extends CivitasAkademika {
    /* Atribut */
    private String NIM;
    private CA_Dosen dosen_wali;

    /* Method */

    // Konstruktor
    CA_Mahasiswa(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }
    
    // Konstruktor dengan Dosen Wali
    CA_Mahasiswa(String nama, String NIM, CA_Dosen dosen_wali) {
        super(nama);
        this.NIM = NIM;
        this.dosen_wali = dosen_wali;
    }
    
    // Getter Nomor (NIM)
    public String getNomor() {
        return this.NIM;
    }
    
    // Getter Dosen Wali
    public CA_Dosen getDosenWali() {
        return this.dosen_wali;
    }
    
    // Point I (setWali)
    public void setDosenWali(CA_Dosen dosen_wali) {
        this.dosen_wali = dosen_wali;
    }
    
    // Point J (tampilDataMahasiswa)
    public void tampilDataMahasiswa() {
        System.out.println("========== Data Mahasiswa ==========");
        System.out.printf("NIM\t\t: %s\n", this.getNomor());
        System.out.printf("Nama\t\t: %s\n", this.getNama());
        System.out.printf("Dosen Wali\t: %s\n", this.getDosenWali().getNama());
        System.out.println("====================================");
    }
}
