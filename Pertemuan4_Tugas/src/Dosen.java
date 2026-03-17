/* Nama File     : Dosen.java
 * Deskripsi     : class dosen gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 13 Maret 2026
 */

public class Dosen extends Pegawai {
   
   /***************ATRIBUT*****************/
   private double tunjangan;
   private String fakultas;

   /***************METHOD******************/
   // KONSTRUKTOR
   // Konstruktor tanpa parameter
   public Dosen() {
      super();
      this.tunjangan = 0;
      this.fakultas = "FK";
   }

   // Konstruktor dengan parameter
   public Dosen(String NIP, String nama, Tanggal tanggal_lahir, Tanggal TMT, String fakultas, double gajiPokok, double tunjangan) {
      super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
      this.tunjangan = tunjangan;
      this.fakultas = fakultas;
   }

   // SELEKTOR
   // Selektor Persenan Tunjangan 
   public double getTunjangan() {
      return this.tunjangan;
   }
   
   // Selektor Fakultas
   public String getFakultas() {
      return this.fakultas;
   }

   // MUTATOR
   // Mutator NIP
   public void setTunjangan(float tunjangan) {
      this.tunjangan = tunjangan;
   }

   // Mutator Fakultas
   public void setFakultas(String fakultas) {
      this.fakultas = fakultas;
   }

   // Print Info Dosen
   @Override
   public void printInfo() {
      super.printInfo();
      System.out.println("Fakultas\t: " + this.fakultas);
   }

}
