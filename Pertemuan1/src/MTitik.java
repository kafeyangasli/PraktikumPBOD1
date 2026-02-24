/* Nama File     : MTitik.java
 * Deskripsi     : driver
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 20 Februari 2026
 */

public class MTitik {
   public static void main(String[] args) {

      Titik T1 = new Titik();   // Membuat objek titik T1 (0,0)
      T1.setAbsis(3);           // Mengubah absis T1 dengan nilai 3
      T1.setOrdinat(4);         // Mengubah ordinat T1 dengan nilai 4
      T1.printTitik();          // Mencetak koordinat T1 ke layar
      
   }
}