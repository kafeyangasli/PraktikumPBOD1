/* Nama File     : MGaris.java
 * Deskripsi     : driver garis
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 26 Februari 2026
 */

public class MGaris {
   public static void main(String[] args) {

      System.out.println("Saat ini ada sebanyak " + Garis.getCounterGaris() +" garis.");

      Garis G1 = new Garis();

      System.out.println("Saat ini ada sebanyak " + Garis.getCounterGaris() +" garis.");

      Garis G2 = new Garis(new Titik(-2, 0), new Titik(0, 4));

      System.out.println("Saat ini ada sebanyak " + Garis.getCounterGaris() +" garis.");

      G1.printGaris();
      G2.printGaris();
      G1.setTitikAkhir(new Titik(5, 5));

      System.out.println("Gradien garis G1 adalah " + G1.gradient());
      System.out.println("Gradien garis G2 adalah " + G2.gradient());
      System.out.println("Apakah G1 sejajar dengan G2: " + (G1.sejajarGaris(G2) ? "Iya" : "Tidak"));
      G1.setTitikAkhir(new Titik(1, 2));
      System.out.println("Apakah G1 sejajar dengan G2: " + (G1.sejajarGaris(G2) ? "Iya" : "Tidak"));
      System.out.println("Apakah G1 tegak lurus terhadap G2: " + (G1.tegakLurus(G2) ? "Iya" : "Tidak"));
      G1.setTitikAwal(new Titik(0, 2));
      G1.setTitikAkhir(new Titik(1, 1.5));
      System.out.println("Apakah G1 tegak lurus terhadap G2: " + (G1.tegakLurus(G2) ? "Iya" : "Tidak"));

      G1.printPersamaanGaris();
      G2.printPersamaanGaris();
   }
}