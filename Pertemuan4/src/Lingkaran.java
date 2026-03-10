/* Nama File     : Lingkaran.java
 * Deskripsi     : class Lingkaran extend gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 10 Maret 2026
 */

public class Lingkaran extends BangunDatar {

   /***************ATRIBUT*****************/
   private double jari;

   /***************METHOD******************/
   // Konstruktor Lingkaran kosongan
   public Lingkaran() {
      this.setJmlSisi(1);
   }

   // Konstruktor Lingkaran dengan parameter (tanpa super)
   /*
   public Lingkaran(double diameter, String warna, String border) {
      this.jari = diameter / 2;
      this.setWarna(warna);
      this.setBorder(border);
      setJmlSisi(1):
   }
   */

   // Konstruktor Lingkaran dengan parameter (dengan super)
   public Lingkaran(double diameter, String warna, String border) {
      super(1, warna, border);
      this.jari = diameter / 2;
   }

   /* SELEKTOR */
   // Selektor Jari
   public double getJari() {
      return jari;
   }

   /* MUTATOR */
   // Mutator Jari
   public void setJari(double jari) {
      this.jari = jari;
   }

   // Mengembalikan luas Lingkaran
   public double getLuas() {
      return 3.14159 * this.jari * this.jari;
   }

   // Mengembalikan keliling Lingkaran
   public double getKeliling() {
      return 2 * 3.14159 * this.jari;
   }

   // Mengoverride method printInfo superclass (tanpa super)
   /*
   @Override
   public void printInfo() {
      System.out.println("Jumlah sisi:\t" + this.getJmlSisi());
      System.out.println("Warna:\t" + this.getWarna());
      System.out.println("Border:\t" + this.getBorder());
      System.out.println("Jari:\t " + this.jari);
   }
   */
   
   // Mengoverride method printInfo superclass (dengan super)
   @Override
   public void printInfo() {
      super.printInfo();
      System.out.println("Jari\t\t: " + jari);
   }

}
