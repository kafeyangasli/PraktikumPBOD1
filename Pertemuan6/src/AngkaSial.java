/* Nama File     : AngkaSial.java
 * Deskripsi     : tes eksepsi angka sial gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 23 Maret 2026
 */

public class AngkaSial {
   
   public void cobaAngka(int angka) throws AngkaSialException {
      if (angka == 13) {
         throw new AngkaSialException();
      }
      System.out.println(angka + " bukan angka sial.");
   }

   public static void main(String[] args) {
      AngkaSial as = new AngkaSial();
      try {
         as.cobaAngka(10);
         as.cobaAngka(13);
         as.cobaAngka(12);
      } catch (AngkaSialException ase) {
         System.out.println(ase.getMessage());
         System.out.println("Hati-hati masukin angka!");
      }
   }

   /*
      Q: Apakah baris 12 (13 di file ini) dieksekusi?
      A: Tidak! Karena throw pada baris 11 sudah berperan sebagai 'return', yang berarti
         semua kode dibawahnya tidak akan dijalankan ketika terjadi Exception, dan alih-alih
         mengembalikan suatu nilai ke pemanggil fungsi, justru akan mengembalikan objek Exception.

      Q: Apakah baris 21 dieksekusi?
      A: Tidak juga! Karena pada baris 20, terjadi sebuah Exception yang mengakibatkan
         seluruh kode pada body 'try' setelah baris 20 tidak akan dijalankan lagi. Ketika
         terjadi Exception, maka program akan langsung menuju body 'catch' untuk menangani
         Exception yang terjadi.
   */

}
