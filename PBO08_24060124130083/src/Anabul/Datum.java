/*
    File        : Datum.java
    Deskripsi   : Polimorfisme universal tipe Generic
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 29 April 2026
*/

public class Datum<G> {
    /* Atribut */
    private G isi;

    /* Methods */
    
    // Konstruktor tak berparameter
    Datum() {    
        this.isi = null;
    }
    
    // Konstruktor berparameter
    Datum(G isi) {
        this.isi = isi;
    }

    // Getter Isi
    public G getIsi() {
        return this.isi;
    }

    // Setter Isi
    public void setIsi(G isibaru) {
        this.isi = isibaru;
    }

    // Main
    public static void main(String args[]) {
        /* Kamus */
        Anabul a;
        Kucing k;
        Datum<Anabul> DA;
        Datum<Kucing> DK;

        /* Algoritma */
        a = new Anjing("Scooby Doo");
        k = new Kucing("Meowl");
        a.Gerak(); a.Bersuara();
        k.Gerak(); k.Bersuara();

        DA = new Datum<>();
        DA.setIsi(a);
        DA.getIsi().Gerak(); DA.getIsi().Bersuara();
        
        DK = new Datum<>(k);
        DK.getIsi().Gerak(); DK.getIsi().Bersuara();
        
        DK.setIsi(new Anggora("Angola"));
        DK.getIsi().Gerak(); DK.getIsi().Bersuara();
        
        k = new Kembangtelon("Kutus-kutus");
        DK.setIsi(k);
        DK.getIsi().Gerak(); DK.getIsi().Bersuara();

        // DK.setIsi(new Anjing("Hachiko"));
        /* ^Akan gagal karena Anjing bukan subclass dari Kucing,
            sehingga Inclusion tidak dapat dilakukan.*/

        DA.setIsi(k);
        DA.getIsi().Gerak(); DA.getIsi().Bersuara();
        
    }
}
