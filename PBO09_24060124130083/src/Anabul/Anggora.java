/*
    File        : Anggora.java
    Deskripsi   : Polimorfisme universal tipe Generic
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 29 April 2026
*/

public class Anggora extends Kucing {
    /* Atribut */
    /* - */

    /* Methods */
    
    // Konstruktor tak berparameter
    Anggora() {
        super();
    }
    
    // Konstruktor berparameter
    Anggora(String Nama) {
        super(Nama);
    }

    // Konstruktor berparameter + bobot
    Anggora(String Nama, int bobot) {
        super(Nama, bobot);
    }

    // Gerak
    @Override
    public void Gerak() {
        System.out.println("Anggora "+ (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
