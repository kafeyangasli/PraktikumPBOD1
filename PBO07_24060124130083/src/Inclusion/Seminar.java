/*
    File        : Seminar.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion dengan array statis
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 25 April 2026
*/

public class Seminar {
    /* Atribut */
    private CivitasAkademika[] pesertas = new CivitasAkademika[100];
    private int banyakpesertas;

    /* Methods */

    // Konstruktor
    Seminar() {
        this.banyakpesertas = 0;
    }
    
    // Point C
    public int countPeserta() {
        return this.banyakpesertas;
    }
    
    // Point D
    public void registrasi(CivitasAkademika ca) {
        if (banyakpesertas < 100) {
            pesertas[banyakpesertas] = ca;
            banyakpesertas++;
        } else {
            System.out.println("Seminar telah penuh.");
        }
    }
    
    // Point G
    public void tampilPeserta() {
        int i = 1;
        System.out.println("==> Daftar Peserta Seminar:");
        for (CivitasAkademika peserta : pesertas) {
            if (i > banyakpesertas) break; // limit
            System.out.printf("%d. %s (%s)\n", i, peserta.getNama(), peserta.getNomor());
            i++;
        }
    }
    
    // Point H
    public int countMahasiswa() {
        int count = 0;
        for (CivitasAkademika peserta : pesertas) {
            if (peserta instanceof CA_Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
