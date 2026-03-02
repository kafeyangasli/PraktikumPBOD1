/* Nama File     : Garis.java
 * Deskripsi     : class garis gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 26 Februari 2026
 */

public class Garis {

   /***************ATRIBUT*****************/
   Titik awal;
   Titik akhir;
   static int counterGaris = 0;

   /***************METHOD******************/
   // Konstruktor untuk membuat garis dengan awal (0,0) dan akhir (1,1)
   public Garis(){
      this(new Titik(), new Titik(1,1));
      counterGaris++;
   }

   // Konstruktor untuk membuat garis berdasarkan parameter
   public Garis(Titik awal, Titik akhir) {
      this.awal = awal;
      this.akhir = akhir;
      counterGaris++;
   }
   
   // Mengembalikan titik awal
   public Titik getTitikAwal() {
      return this.awal;
   }
   
   // Mengembalikan titik akhir
   public Titik getTitikAkhir() {
      return this.akhir;
   }

   // Mengembalikan counter garis / banyaknya garis yang telah terbuat
   public static int getCounterGaris() {
      return counterGaris;
   }

   // Mengatur titik awal
   public void setTitikAwal(Titik awal) {
      this.awal = awal;
   }

   // Mengatur titik akhir
   public void setTitikAkhir(Titik akhir) {
      this.akhir = akhir;
   }

   // Mengembalikan panjang dari garis 
   public double length() {
      return this.awal.jarakTitik(this.akhir);
   }

   // Mengembalikan gradien / tingkat kemiringan dari garis
   public double gradient() {
      return (this.akhir.getOrdinat() - this.awal.getOrdinat()) / (this.akhir.getAbsis() - this.awal.getAbsis());
   }

   // Mengembalikan titik tengah dari garis
   public Titik titikTengah() {
      double mid_absis = (this.awal.getAbsis() + this.akhir.getAbsis()) / 2;
      double mid_ordinat = (this.awal.getOrdinat() + this.akhir.getOrdinat()) / 2;
      return new Titik(mid_absis, mid_ordinat);
   }

   // Mengembalikan true jika garis sejajar dengan garis G
   public boolean sejajarGaris(Garis G) {
      return this.gradient() == G.gradient();
   }

   // Mengembalikan true jika garis tegak lurus dengan garis G
   public boolean tegakLurus(Garis G) {
      return G.gradient() == (-1 / this.gradient());
   }

   // Mencetak garis
   public void printGaris() {
      System.out.println("Garis((" + this.awal.getAbsis() + "," + this.awal.getOrdinat() + "), (" + this.akhir.getAbsis() + "," + this.akhir.getOrdinat() + ")");
   }

   // Mencetak persamaan garis yang terbentuk
   public void printPersamaanGaris() {
      double grad = this.gradient();
      double constant = this.awal.getOrdinat() - grad * this.awal.getAbsis();
      System.out.println("Persamaan Garis yang terbentuk adalah y = " + grad + "x + " + constant);
   }
}
