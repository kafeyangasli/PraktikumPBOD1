/* Nama File     : Asersi1.java
 * Deskripsi     : asersi gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 23 Maret 2026
 */

public class Asersi1 {

    public static void main(String[] args) {
      int x = 0;
      if (x > 0) {
         System.out.println("X bilangan positif!");
      } else {
         assert(x < 0);
         System.out.println("X bilangan negatif!");
      }
    }
 
 }
 