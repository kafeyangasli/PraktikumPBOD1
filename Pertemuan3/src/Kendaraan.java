/* Nama File     : Kendaraan.java
 * Deskripsi     : class kendaraan gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 3 Maret 2026
 */

public class Kendaraan {

   /***************ATRIBUT*****************/
   private String noPlat;
   private String jenis;

   /***************METHOD******************/
   // Konstruktor Kendaraan tanpa parameter (kosongan)
   public Kendaraan() {
      this.noPlat = "X 6767 SXS";
      this.jenis = "-";
   }
   
   // Konstruktor Kendaraan dengan parameter
   public Kendaraan(String noPlat, String jenis) {
      this.noPlat = noPlat;
      this.jenis = jenis;
   }

   /* SELEKTOR */
   // Selektor Plat Kendaraan
   public String getPlat() {
      return this.noPlat;
   }

   // Selektor Jenis Kendaraan
   public String getJenis() {
      return this.jenis;
   }

   /* MUTATOR */
   // Mutator Plat Kendaraan
   public void setPlat(String noPlat) {
      this.noPlat = noPlat;
   }

   // Mutator Jenis Kendaraan
   public void setJenis(String jenis) {
      this.jenis = jenis;
   }

   // Print Kendaraan
   public void printKendaraan() {
      System.out.println("---------- DATA KENDARAAN ----------");
      System.out.println("NOMOR PLAT\t: " + this.noPlat);
      System.out.println("JENIS KENDARAAN\t: " + this.jenis);
      System.out.println("------------------------------------");
   }

}