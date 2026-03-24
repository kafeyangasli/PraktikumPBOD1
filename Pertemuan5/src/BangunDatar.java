/* Nama File     : BangunDatar.java
 * Deskripsi     : class bangundatar gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 17 Maret 2026
 */

public abstract class BangunDatar {

   /***************ATRIBUT*****************/
   protected int jmlSisi;
   protected String warna;
   protected String border;
   protected static int counterBangunDatar = 0;

   /***************METHOD******************/
   // Konstruktor BangunDatar kosongan
   public BangunDatar() {
      counterBangunDatar++;
   }

   // Konstruktor BangunDatar dengan parameter 
   public BangunDatar(int jmlSisi, String warna, String border) {
      this.jmlSisi = jmlSisi;
      this.warna = warna;
      this.border = border;
      counterBangunDatar++;
   }

   // Abstract Methods
   public abstract double getLuas();
   public abstract double getKeliling();

   /* SELEKTOR */
   // Selektor Jumlah Sisi
   public int getJmlSisi() {
      return jmlSisi;
   }

   // Selektor Warna
   public String getWarna() {
      return warna;
   }

   // Selektor Border
   public String getBorder() {
      return border;
   }

   // Selektor Statis Counter
   public static int getCounterBangunDatar() {
      return counterBangunDatar;
   }

   /* MUTATOR */
   // Mutator Jumlah Sisi
   public void setJmlSisi(int jmlSisi) {
      this.jmlSisi = jmlSisi;
   }
   
   // Mutator Warna
   public void setWarna(String warna) {
      this.warna = warna;
   }

   // Mutator Border
   public void setBorder(String border) {
      this.border = border;
   }

   // Menampilkan banyaknya objek BangunDatar yang terbuat
   public static void printCounter() {
      System.out.println("Ada " + counterBangunDatar + " objek BangunDatar yang telah terbangun.");
   }

   // Cek ekivalen luas
   public boolean isEqualLuas(BangunDatar X){
      return this.getLuas() == X.getLuas();
   }

   // Cek ekivalen keliling
   public boolean isKeliling(BangunDatar X){
      return this.getKeliling() == X.getKeliling();
   }

   // Menampilkan informasi objek BangunDatar
   public void printInfo() {
      System.out.println("Jumlah sisi\t:  " + this.jmlSisi);
      System.out.println("Warna\t\t: " + this.warna);
      System.out.println("Border\t\t: " + this.border);
   }
}
