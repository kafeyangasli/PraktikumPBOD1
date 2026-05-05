/*
    File        : Kembangtelon.java
    Deskripsi   : Polimorfisme universal tipe Generic
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 29 April 2026
*/

public class Kembangtelon extends Kucing {
    /* Atribut */
    /* - */

    /* Methods */
    
    // Konstruktor tak berparameter
    Kembangtelon() {
        super();
    }
    
    // Konstruktor berparameter
    Kembangtelon(String Nama) {
        super(Nama);
    }

    // Konstruktor berparameter + bobot
    Kembangtelon(String Nama, int bobot) {
        super(Nama, bobot);
    }

    // Gerak
    @Override
    public void Gerak() {
        System.out.println("Kembangtelon "+ (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
