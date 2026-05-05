public class Data<G> {
    /* Atribut */
    private G[] ruang = (G[]) new Object[100];
    private int efektif = 0;

    /* Method */
    // Getter
    public G getIsi(int idx) {
        return this.ruang[idx];
    }

    public int getSize() {
        return this.efektif;
    }

    // Setter
    public void setIsi(int idx, G isi) {
        if (idx <= this.efektif) {
            this.ruang[idx] = isi;
            if (idx == this.efektif) {
                this.efektif++;
            }
        }
    }

    // Printer
    public void printData() {
        /* Kamus Lokal */
        int i;
        G place;

        /* Algoritma */
        System.out.printf("[ ");
        for (i = 0; i < this.efektif; i++) {
            place = this.ruang[i];
            System.out.printf("%s ", place.getClass().getSimpleName());
        }
        System.out.printf("]\n");
    }

    // Aplikasi Main
    public static void main(String args[]) {
        /* Kamus */
        Data<Anabul> D;
        Anabul A;

        /* Algoritma */
        D = new Data<>();
        D.printData();
        A = new Kucing("Tom");
        System.out.println("Ukuran Data: " + D.getSize());

        D.setIsi(1, A);
        D.printData(); // Tom belum masuk, karena idx = 1 belum efektif.
        System.out.println("Ukuran Data: " + D.getSize());

        D.setIsi(0, A);
        D.printData();
        System.out.println("Ukuran Data: " + D.getSize());
        
        A = new Kembangtelon();
        D.setIsi(1, A);

        A = new Anjing();
        D.setIsi(2, A);
        
        D.printData();
        System.out.println("Ukuran Data: " + D.getSize());
    }
}