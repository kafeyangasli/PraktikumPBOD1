/*
    File        : Anabul.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 23 April 2026
*/

public class Anabul {
    /* Atribut */
    private String Nama;

    /* Methods */

    // Konstruktor tak berparameter
    Anabul() {
        this.Nama = "";
    }
    
    // Konstruktor berparameter
    Anabul(String Nama) {
        this.Nama = Nama;
    }

    // Getter Nama
    public String getNama() {
        return this.Nama;
    }

    // Setter Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Gerak
    public void Gerak() {
        System.out.println("Anabul " + (this.getNama() == "" ? "" : this.getNama() + " ") + "bergerak.");
    }

    // Bersuara
    public void Bersuara() {
        System.out.println("Anabul bersuara.");
    }

}
