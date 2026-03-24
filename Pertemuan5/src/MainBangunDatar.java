/* Nama File     : MainBangunDatar.java
 * Deskripsi     : driver bangundatar and its kids
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 17 Maret 2026
 */

public class MainBangunDatar {
    public static void main(String[] args) throws Exception {
        
        // BangunDatar B1 = new BangunDatar(); 
        
        /*  Jawaban NO.3:
            Ada! Error: Cannot instantiate the type BangunDatar
            Ini karena BangunDatar merupakan sebuah kelas abstract, sehingga
            harus diturunkan ke sebuah kelas non-abstract dan tidak dapat
            diinstansikan secara langsung.
        */
        
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran (14);

        System.out.println("Apakah luas persegi P1 dan P2 sama: " + (P1.isEqualLuas(P2) ? "Ya" : "Tidak"));

        P2.setSisi(10);

        System.out.println("Apakah luas persegi P1 dan P2 sama: " + (P1.isEqualLuas(P2) ? "Ya" : "Tidak"));

        System.out.println("Apakah luas lingkaran L1 dan L2 sama: " + (L1.isEqualLuas(L2) ? "Ya" : "Tidak"));

        L2.setJari(14);

        System.out.println("Apakah luas lingkaran L1 dan L2 sama: " + (L1.isEqualLuas(L2) ? "Ya" : "Tidak"));

        System.out.println("Apakah luas lingkaran L1 dan L2 sama: " + (L1.isEqualLuas(L2) ? "Ya" : "Tidak"));

        System.out.println("===== TES METHOD BANGUNDATAR =====");
        System.out.println ("Apakah luas bangundatar P1 dan L1 sama: " + (P1.isEqualLuas(L1) ? "Ya" : "Tidak"));

        /*  Jawaban NO.5

            Q:  Apakah method yang dibuat pada langkah nomor 4 dapat digunakan 
                untuk membandingkan objek bangun datar yang berbeda?

            A:  Ya! Method yang dibuat pada kelas abstract BangunDatar dapat digunakan
                di kelas non-abstract berbeda yang merupakan turunan dari BangunDatar.

            Q:  Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda 
                membuat method isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa?

            A:  Secara pemrograman, bisa; dengan syarat method getLuas dan getKeliling harus memiliki 
                body function terlebih dahulu untuk kemudian dioverride oleh turunannya. Namun secara logis,
                tidak; karena BangunDatar adalah suatu generalisasi dari berbagai bentuk geometri yang ada, 
                seperti lingkaran, persegi, persegi panjang, segitiga, dan sebagainya. Tidak ada rumus umum 
                yang dapat menghitung luas maupun keliling suatu bangun datar secara pasti, karena masing-masing 
                bangun datar memiliki cara perhitungan luas/keliling yang berbeda.
                
            Q:  Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?

            A:  Kelebihan utama menjadikan BangunDatar sebagai kelas abstract adalah karena semua objek turunan
                memiliki method yang sama tetapi dengan implementasi yang berbeda, hal tersebut membuat kode lebih rapi,
                terstruktur, dan mengurangi kemungkinan error akibat method yang belum diimplementasikan ke turunannya.
                Sehingga, penerapan konsep polimorfisme pada kode sumber lebih rapi.
            
        */

        /*  Jawaban Bagian 2 

                Interface memungkinkan behaviour yang sama digunakan oleh banyak class berbeda tanpa harus memiliki 
                hubungan pewarisan, tidak seperti jika dijadikan kelas abstrak yang dimana behaviournya hanya dapat
                dimiliki oleh turunannya. Selain itu, suatu kelas dapat mengimplementasikan banyak interface sekaligus, 
                sedangkan hanya dapat mewarisi satu abstract class. Hal ini membuat penggunaan interface lebih mendukung 
                konsep modularitas dalam pemrograman berorientasi objek.
        */

    }
}
