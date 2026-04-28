/*
    File        : CA_Dosen.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion (subclass)
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 25 April 2026
*/

public class CA_Dosen extends CivitasAkademika {
    /* Atribut */
    private String NIP;

    /* Method */

    // Konstruktor
    CA_Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }
    
    // Getter Nomor (NIP)
    public String getNomor() {
        return this.NIP;
    }
}
