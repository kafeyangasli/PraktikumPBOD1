/* Nama File     : MTitik.java
 * Deskripsi     : driver
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 24 Februari 2026
 */

public class MTitik {
   public static void main(String[] args) {

      System.out.println("Saat ini ada sebanyak " + Titik.getCounterTitik() +" titik.");

      Titik T1 = new Titik();   // Membuat objek titik T1 (0,0)
      T1.setAbsis(3);           // Mengubah absis T1 dengan nilai 3
      T1.setOrdinat(4);         // Mengubah ordinat T1 dengan nilai 4
      T1.printTitik();          // Mencetak koordinat T1 ke layar

      System.out.println("Saat ini ada sebanyak " + Titik.getCounterTitik() + " titik.");

      T1.geser(3,4);            // Menggeser T1 sejauh (3,4)
      T1.printTitik();          // Menampilkan koordinat T1 setelah digeser

      Titik T2 = T1;
      T2.printTitik();
      T1.setAbsis(10);
      T1.setOrdinat(10);
      T2.printTitik();

      System.out.println("Saat ini ada sebanyak " + Titik.getCounterTitik() + " titik.");
      // Akan tetap 2 karena T2 adalah object reference ke T1

      Titik T3 = new Titik(3, 5);
      T3.printTitik();
      System.out.println("Jarak titik ("+T3.getAbsis()+","+T3.getOrdinat()+") dari titik pusat adalah " + T3.jarakPusat());
      System.out.println("Jarak titik ("+T3.getAbsis()+","+T3.getOrdinat()+") dari titik ("+T1.getAbsis()+","+T1.getOrdinat()+") adalah " + T3.jarakTitik(T1));
      T3.geser(3, 2);
      System.out.println("Titik T3 setelah digeser ke kanan sebanyak 3 dan atas sebanyak 2 adalah:");
      T3.printTitik();
      T3.refleksiX();
      System.out.println("Titik T3 setelah refleksi terhadap X adalah:");
      T3.printTitik();
      T3.refleksiY();
      System.out.println("Titik T3 setelah refleksi terhadap Y adalah:");
      T3.printTitik();
      T2 = T3.getRefleksiX();
      T2.printTitik();
      T2 = T3.getRefleksiY();
      T3.printTitik();

      System.out.println("Saat ini ada sebanyak "+Titik.getCounterTitik()+" titik.");
   }
}