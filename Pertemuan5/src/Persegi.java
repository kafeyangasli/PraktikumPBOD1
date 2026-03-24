/* Nama File     : Persegi.java
 * Deskripsi     : class persegi extend gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 10 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {

   /***************ATRIBUT*****************/
   private double sisi;

   /***************METHOD******************/
   // Konstruktor Persegi kosongan
   public Persegi() {
      this.setJmlSisi(4);
   }

   // Konstruktor Persegi dengan parameter (tanpa super)
   /*
   public Persegi(double sisi, String warna, String border) {
      this.sisi = sisi;
         this.setWarna(warna);
         this.setBorder(border);
         this.setJmlSisi(4);
   }
   */

   // Konstruktor Persegi dengan parameter ketika atribut superclass adalah protected
   /*
   public Persegi(double sisi, String warna, String border){
      this.jmlSisi = 4;
      this.warna = warna;
      this.border = border;
      this.sisi = sisi;
   }
   */

   // Konstruktor Sisi saja
   public Persegi(double sisi) {
      this.sisi = sisi;
   }

   // Konstruktor Persegi dengan parameter (dengan super)
   public Persegi(double sisi, String warna, String border) {
      super(4, warna, border);
      this.sisi = sisi;
   }

   /* SELEKTOR */
   // Selektor Sisi
   public double getSisi() {
      return sisi;
   }

   /* MUTATOR */
   // Mutator Sisi
   public void setSisi(double sisi) {
      this.sisi = sisi;
   }

   // Mengembalikan luas persegi
   public double getLuas() {
      return this.sisi * this.sisi;
   }

   // Mengembalikan keliling persegi
   public double getKeliling() {
      return 4 * this.sisi;
   }

   // Mengembalikan panjang diagonal
   public double getDiagonal() {
      return this.sisi * 1.414214;
   }

   // Mengoverride method printInfo superclass (tanpa super)
   /*
   @Override
   public void printInfo() {
      System.out.println("Jumlah sisi:\t" + this.getJmlSisi());
      System.out.println("Warna:\t" + this.getWarna());
      System.out.println("Border:\t" + this.getBorder());
      System.out.println("Sisi:\t " + this.sisi);
   }
   */
   
   // Mengoverride method printInfo superclass (dengan super)
   @Override
   public void printInfo() {
      super.printInfo();
      System.out.println("Sisi\t\t: " + sisi);
   }

   // Mengoverride method printCounter
   /* GAGAL DIJALANKAN
   @Override
   public void printCounter() {
      
   }
   */

   /* Implementasi Interface */
   // Menambahkan ukuran menjadi 10% lebih besar
   public void zoomIn() {
      sisi *= 1.1;
   }

   // Menambahkan ukuran menjadi 10% lebih besar
   public void zoomOut() {
      sisi *= 0.9;
   }

   // Menyesuaikan ukuran objek sebesar n%
   public void zoom(int percent) {
      sisi *= (percent / 100);
   }

}
