/* Nama File     : MainBangunDatar.java
 * Deskripsi     : driver bangundatar and its kids
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 10 Maret 2026
 */

public class MainBangunDatar {
    public static void main(String[] args) throws Exception {
        
        // Persegi
        Persegi p1 = new Persegi(6.7, "Biru Don't Care", "Putih");
        p1.printInfo();
        System.out.println("Persegi P1 memiliki luas " + p1.getLuas() + "m^2 dan keliling " + p1.getKeliling() + "m dengan diagonal sepanjang " + p1.getDiagonal() + "m");

        p1.setSisi(67.0);
        p1.printInfo();
        System.out.println("Persegi P1 memiliki luas " + p1.getLuas() + "m^2 dan keliling " + p1.getKeliling() + "m dengan diagonal sepanjang " + p1.getDiagonal() + "m");

        p1.setWarna("Hijau Sawit");
        p1.setBorder("Hitam");
        p1.printInfo();

        // Lingkaran
        Lingkaran l1 = new Lingkaran(6, "Hijau Sawit", "Hitam");
        l1.printInfo();
        System.out.println("Lingkaran L1 memiliki luas " + l1.getLuas() + "m^2 dan keliling " + l1.getKeliling() + "m");

        l1.setJari(7);
        l1.printInfo();
        System.out.println("Lingkaran L1 memiliki luas " + l1.getLuas() + "m^2 dan keliling " + l1.getKeliling() + "m");

        l1.setWarna("Biru Don't Care");
        l1.setBorder("Putih");
        l1.printInfo();

        BangunDatar.printCounter();

        /*
        JAWABAN BAGIAN 1
        -------------------
        Konstruktor Persegi berparameter tidak sah atau akan mengembalikan error karena attribut warna,
        border, dan jumlah sisi memiliki modifier private pada superclass, sehingga tidak dapat diakses secara
        langsung oleh subclassnya dan harus memanggil method yang disediakan. Jika memaksakan, akan muncul error:

        The field BangunDatar.jmlSisi is not visible.

        JAWABAN BAGIAN 3
        -------------------
        Hasil dari upaya mengoverride method static adalah error:

        This instance method cannot override the static method from BangunDatar.
        
        Ini berarti suatu method static pada superclass tidak dapat dioverride oleh subclass.

        JAWABAN BAGIAN 4
        -------------------
        Ketika modifier atribut pada BangunDatar diubah menjadi protected, pengaksesan langsung oleh subclass
        pada konstruktor subclass Persegi berhasil dan program dapat dijalankan dengan normal. Hal ini karena
        dengan modifier protected, atribut superclass dapat diturunkan dan diakses oleh subclass secara langsung
        tanpa memerlukan method selektor khusus.

        JAWABAN BAGIAN 5
        -------------------
        Dengan ditambahkannya keyword final, maka suatu class tidak dapat diturunkan kembali, sehingga akan
        memunculkan error berikut pada class Persegi dan Lingkaran yang merupakan subclass dari superclass BangunDatar:

        The type Persegi cannot subclass the final class BangunDatar
        The type Lingkaran cannot subclass the final class BangunDatar

        Ketika ditambahkan pada method printInfo, hal yang sama akan terjadi; method tidak dapat dioverride subclassnya. 
        Sehingga, upaya untuk mengoverride printInfo pada subclass akan gagal dan memunculkan error:

        Cannot override the final method from BangunDatar

        */
    }
}
