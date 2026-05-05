/*
    File        : OperatorGenerik.java
    Deskripsi   : Polimorfisme Universal tipe Generik (Operator)
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 29 April 2026
*/

public class OperatorGenerik {
    /* Atribut */
    
    /* Methods */

    // Procedure Generik menukar dua variabel
    public <G> void tukar(Datum<G> a, Datum<G> b) {
        /* Kamus Lokal */
        G temp;

        /* Algoritma */
        temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // Fungsi Generik
    public <G extends Kucing> int bobot2(Datum<G> k1, Datum<G> k2) {
        return k1.getIsi().getBobot() + k2.getIsi().getBobot();
    }

    // Main
    public static void main(String args[]) {
        /* Kamus */
        OperatorGenerik og;
        Datum<Integer> a, b;
        Datum<Anabul> a1, a2;
        Datum<String> S1, S2;
        Datum<Kucing> k1, k2;
        /* Algoritma */
        // Inisialisasi Objek
        og = new OperatorGenerik();
        
        a = new Datum<>();
        a.setIsi(6);
        b = new Datum<>();
        b.setIsi(7);

        a1 = new Datum<>(new Anjing("Scooby Doo"));
        a2 = new Datum<>(new Kucing("Meowl"));

        // Tukar integer dan kucing (Point A)
        System.out.printf("Bilangan bulat A = %d dan bilangan bulat B = %d\n", a.getIsi(), b.getIsi());
        og.tukar(a, b);
        System.out.printf("Bilangan bulat A = %d dan bilangan bulat B = %d\n", a.getIsi(), b.getIsi());

        System.out.printf("A1 adalah %s dan A2 adalah %s.\n", a1.getIsi().getNama(), a2.getIsi().getNama());
        og.tukar(a1, a2);
        System.out.printf("A1 adalah %s dan A2 adalah %s.\n", a1.getIsi().getNama(), a2.getIsi().getNama());
        
        // Tukar sesama integer (Point B)
        System.out.printf("Bilangan bulat A = %d dan bilangan bulat B = %d\n", a.getIsi(), b.getIsi());
        og.tukar(a, b);
        System.out.printf("Bilangan bulat A = %d dan bilangan bulat B = %d\n", a.getIsi(), b.getIsi());

        // Tukar sesama string
        S1 = new Datum<>();
        S1.setIsi("Halo");
        S2 = new Datum<>();
        S2.setIsi("World");
        System.out.printf("String A: %s, String B: %s\n", S1.getIsi(), S2.getIsi());
        og.tukar(S1, S2);
        System.out.printf("String A: %s, String B: %s\n", S1.getIsi(), S2.getIsi());

        // Aplikasi fungsi generik (Point C)
        k1 = new Datum<>();
        k1.setIsi(new Anggora("Andorra", 67));
        System.out.printf("Anggora Andorra bobotnya adalah %d kg\n", k1.getIsi().getBobot());

        k2 = new Datum<>();
        k2.setIsi(new Kembangtelon("Kutus", 69));
        System.out.printf("Kembangtelon Kutus bobotnya adalah %d kg\n", k2.getIsi().getBobot());

        System.out.printf("Total berat: %d\n", og.bobot2(k1, k2));
        
    }
}
