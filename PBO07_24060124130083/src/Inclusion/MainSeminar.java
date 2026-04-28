/*
    File        : MainSeminar.java
    Deskripsi   : Driver penerapan polimorfisme inclusion dengan array statis
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 25 April 2026
*/

public class MainSeminar {
    public static void main(String args[]) {
        /* Kamus */
        CA_Dosen D1, D2;
        CA_Mahasiswa M1, M2, M3, M4, M5;
        Seminar seminar;

        /* Algoritma */
        seminar = new Seminar();

        // Point E (inisialisasi)
        D1 = new CA_Dosen("Kahfi", "2006122620300817001");
        D2 = new CA_Dosen("Renee", "2004082320300817002");

        M1 = new CA_Mahasiswa("Faiq", "24060124130083", D1);
        M2 = new CA_Mahasiswa("Jordan", "24060124120044", D2);
        M3 = new CA_Mahasiswa("Haydar", "24060124120023", D1);
        M4 = new CA_Mahasiswa("Mahes", "24060124140202", D2);
        M5 = new CA_Mahasiswa("Menza", "2406024140138", D2);
        
        // Point F (aplikasi)
        seminar.registrasi(D1);
        seminar.registrasi(M1);
        seminar.registrasi(D2);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        // Point G (aplikasi)
        seminar.tampilPeserta();

        // Point H (aplikasi)
        System.out.printf("Ada %d mahasiswa dalam seminar.\n", seminar.countMahasiswa());
        
        // Point J (aplikasi) (dibuat terlebih dahulu untuk memperjelas Point I)
        M5.tampilDataMahasiswa();

        // Point I
        M5.setDosenWali(D1);
        System.out.println("Mahasiswa " + M5.getNama() + " berganti dosen wali.");
        M5.tampilDataMahasiswa();
    }
}
