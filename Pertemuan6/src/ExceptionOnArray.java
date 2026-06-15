/* Nama File     : ExceptionOnArray.java
 * Deskripsi     : eksepsi array gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 23 Maret 2026
 */

public class ExceptionOnArray {

   public static void main(String[] args) {
      Integer[] arrayInteger = new Integer[4];

      try {
         arrayInteger[2] = 11;
         arrayInteger[4] = 10;
      } catch (ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
      } finally {
         System.out.println("Cleaning up...");
      }
   }

}
