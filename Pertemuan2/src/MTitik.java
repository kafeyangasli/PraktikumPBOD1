/* Nama File     : MTitik.java
 * Deskripsi     : driver
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 24 Februari 2026
 */

public class MTitik {
   public static void main(String[] args) {

      System.out.println("Saat ini ada sebanyak "+Titik.getCounterTitik()+" titik.");

      Titik T1 = new Titik();   // Membuat objek titik T1 (0,0)
      T1.setAbsis(3);           // Mengubah absis T1 dengan nilai 3
      T1.setOrdinat(4);         // Mengubah ordinat T1 dengan nilai 4
      T1.printTitik();          // Mencetak koordinat T1 ke layar

      System.out.println("Saat ini ada sebanyak "+Titik.getCounterTitik()+" titik.");

      T1.geser(3,4);            // Menggeser T1 sejauh (3,4)
      T1.printTitik();          // Menampilkan koordinat T1 setelah digeser

      Titik T2 = T1;
      T2.printTitik();
      T1.setAbsis(10);
      T1.setOrdinat(10);
      T2.printTitik();

      System.out.println("Saat ini ada sebanyak "+Titik.getCounterTitik()+" titik.");
      // Akan tetap 2 karena T2 adalah object reference ke T1

      Titik T3 = new Titik(2, 4);
      T3.printTitik();

      System.out.println("Saat ini ada sebanyak "+Titik.getCounterTitik()+" titik.");
   }
}