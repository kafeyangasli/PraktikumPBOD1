/*
    File        : Kucing.java
    Deskripsi   : Polimorfisme universal tipe Generic
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 29 April 2026
*/

public class Kucing extends Anabul {
    /* Atribut */
    private int bobot;

    /* Methods */
    
    // Konstruktor tak berparameter
    Kucing() {
        super();
        this.bobot = 0;
    }
    
    // Konstruktor berparameter
    Kucing(String Nama) {
        super(Nama);
        this.bobot = 0;
    }

    // Konstruktor berparameter + bobot
    Kucing(String Nama, int bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    // Getter
    public int getBobot() {
        return this.bobot;
    }

    // Setter
    public void setBobot(int B) {
        this.bobot = B;
    }
    
    // Gerak
    @Override
    public void Gerak() {
        System.out.println("Kucing " + (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
