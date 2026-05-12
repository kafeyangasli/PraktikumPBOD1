/*
    File        : Piaraan.java
    Deskripsi   : Koleksi Generik Bentukan
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 5 Mei 2026
*/

public class Piaraan {
    /* Atribut */
    private int NbElm = 0;
    private Anabul[] Lanabul;
    private final int max;

    /* Method */

    // Konstruktor tanpa parameter
    Piaraan() {
        this.max = 15;
        this.Lanabul = new Anabul[15];
    }

    // Konstruktor berparameter
    Piaraan(int S) {
        this.max = S;
        this.Lanabul = new Anabul[S];
    }

    // Getter
    public int getNbElm() {
        return this.NbElm;
    }

    public void enqueueAnabul(Anabul anabul) {
        if (this.NbElm < max) {
            this.Lanabul[NbElm] = anabul;
            NbElm++;
        }
    }

    // Mengembalikan elemen terdepan dari Antrian
    public Anabul getAnabul() {
        return this.Lanabul[0];
    }

    // Mengembalikan dan menghapus elemen terdepan dari Antrian
    public Anabul dequeueAnabul() {
        /* Kamus Lokal */
        Anabul exit;
        
        /* Algoritma */
        exit = null; // Inisialiasi awal
        if (this.NbElm != 0) {
            exit = this.Lanabul[0];
            for (int i = 0; i < (this.NbElm) - 1; i++) {
                this.Lanabul[i] = this.Lanabul[i + 1];
            }
            this.NbElm--;
            this.Lanabul[this.NbElm] = null;
        }

        return exit;
    }

    // Count Anabul yang merupakan Kucing
    public int countKucing() {
        /* Kamus Lokal */
        int count;

        /* Algoritma */
        count = 0;

        for (int i = 0; i < this.NbElm; i++) {
            if (this.Lanabul[i] instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // Count Bobot Anabul yang merupakan Kucing
    public int bobotKucing() {
        /* Kamus Lokal */
        int BT;

        /* Algoritma */
        BT = 0;

        for (int i = 0; i < this.NbElm; i++) {
            if (this.Lanabul[i] instanceof Kucing) {
                BT += ((Kucing)this.Lanabul[i]).getBobot();
            }
        }

        return BT;
    }

    // Printer
    public void showJenisAnabul() {
        System.out.printf("[ ");
        for (int i = 0; i < this.NbElm; i++) {
            Anabul placeholder = this.Lanabul[i];
            System.out.printf("%s (%s) ", placeholder.getNama(), placeholder.getClass().getSimpleName());
        }
        System.out.printf("]\n");
    }

    // Method Main
    public static void main(String args[]) {
        /* Kamus */
        Piaraan P;
        Anabul dequeued;

        /* Algoritma */
        P = new Piaraan();
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Kucing("Garfield", 67));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Anjing("Hachi"));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Anggora("Andorra", 34));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Burung("AngryBirds"));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Kembangtelon("Kutus", 23));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Anjing("Blacky"));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.showJenisAnabul();
        System.out.println("Ada " + P.countKucing() + " kucing dengan total bobot " + P.bobotKucing() + " kg");
        
        dequeued = P.dequeueAnabul();
        P.showJenisAnabul();
        System.out.println("Diambil " + dequeued.getClass().getSimpleName() + " " + dequeued.getNama() + " dari koleksi.");
        System.out.println("Anabul pada depan antrian saat ini adalah " + P.getAnabul().getNama());
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());
    }
}