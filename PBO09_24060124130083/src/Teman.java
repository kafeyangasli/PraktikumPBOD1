/*
    File        : Teman.java
    Deskripsi   : Koleksi Generik
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 5 Mei 2026
*/

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /* Atribut */
    private int NbElm = 0;
    private List<String> Lnama;

    /* Method */

    // Konstruktor tanpa parameter
    Teman() {
        this.Lnama = new ArrayList<>();
    }

    // Getter
    public int getNbElm() {
        return this.NbElm;
    }

    public String getNama(int idx) {
        if (idx < this.NbElm) {
            return this.Lnama.get(idx);
        } else {
            return "-";
        }
    }

    // Setter
    public void setNama(int idx, String teman) {
        if (idx < this.NbElm) {
            this.Lnama.set(idx, teman);
        }
    }

    public void addNama(String teman) {
        this.Lnama.add(teman);
        this.NbElm++;
    }

    public void delNama(String teman) {
        /* Kamus Lokal */
        int idx;

        /* Algoritma */
        idx = this.Lnama.indexOf(teman);
        if (idx != -1) {
            this.Lnama.remove(idx);
            this.NbElm--;
        }
    }

    // Predikat
    public boolean isMember(String nama) {
        return this.Lnama.indexOf(nama) != -1;
    }

    // Ganti Nama
    public void gantiNama(String nama, String baru) {
        /* Kamus Lokal */
        int idx;

        /* Algoritma */
        idx = this.Lnama.indexOf(nama);
        if (idx != -1) {
            this.Lnama.set(idx, baru);
        } else {
            System.out.println("Tidak ada teman " + nama);
        }
    }

    // Count Nama
    public int countNama(String nama) {
        /* Kamus Lokal */
        int i;

        /* Algoritma */
        i = 0;

        for (String teman : this.Lnama) {
            if (teman == nama) {
                i++;
            }
        }

        return i;
    }

    // Printer
    public void showTeman() {
        System.out.printf("[ ");
        for (String teman : this.Lnama) {
            System.out.printf("%s ", teman);
        }
        System.out.printf("]\n");
    }

    // Method Main
    public static void main(String args[]) {
        /* Kamus */
        Teman T;
        String key;

        /* Algoritma */
        T = new Teman();
        T.showTeman();

        T.addNama("Ikrar");
        System.out.println("Elemen pertama: " + T.getNama(0));
        T.showTeman();

        T.setNama(0, "Mahes");
        System.out.println("Elemen pertama: " + T.getNama(0));
        T.showTeman();

        T.addNama("Jordan");
        T.addNama("Haydar");
        System.out.println("Ditambahkan teman Jordan dan Haydar");
        T.showTeman();

        T.addNama("teddy");
        T.addNama("wobarpo");
        System.out.println("Ditambahkan teman teddy dan wobarpo");
        T.showTeman();
        T.delNama("teddy");
        System.out.println("Dihapus teman teddy.");
        T.showTeman();
        // wobarpo geser ke kiri
        T.delNama("wobarpo");
        System.out.println("Dihapus teman wobarpo.");
        T.showTeman();

        T.gantiNama("Mahes", "Mahess");
        System.out.println("Mahes berganti jadi Mahess.");
        T.showTeman();

        T.gantiNama("Hydar", "Haydar");
        T.addNama("Mahes");
        T.gantiNama("Mahess", "Mahes");
        key = "Mahes";
        System.out.printf("Ada %d teman yang bernama %s.\n", T.countNama(key), key);
        T.showTeman();
    }
}