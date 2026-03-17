/* Nama File     : DosenTamu.java
 * Deskripsi     : class dosen tamu gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 13 Maret 2026
 */

public class DosenTamu extends Dosen {
   
   /***************ATRIBUT*****************/
   private String NIDK;
   private Tanggal kontrak;

   /***************METHOD******************/
   // KONSTRUKTOR
   // Konstruktor tanpa parameter
   public DosenTamu() {
      super();
      this.NIDK = "XXXXXXXXXX";
      this.kontrak = new Tanggal(30, 9, 1965);
   }

   // Konstruktor dengan parameter
   public DosenTamu(String NIP, String NIDK, String nama, Tanggal tanggal_lahir, Tanggal TMT, String fakultas, double gajiPokok, Tanggal kontrak) {
      super(NIP, nama, tanggal_lahir, TMT, fakultas, gajiPokok, 2.0f);
      this.NIDK = NIDK;
      this.kontrak = kontrak;
   }

   // SELEKTOR
   // Selektor NIDK 
   public String getNIDK() {
      return this.NIDK;
   }

   // MUTATOR
   // Mutator NIDK
   public void setNIDK(String NIDK) {
      this.NIDK = NIDK;
   }

   // Print Informasi Dosen Tetap
   @Override
   public void printInfo() {
      double tunjangan = (this.getTunjangan() / 100) * this.getGajiPokok();

      super.printInfo();
      System.out.println("NIDK\t\t: " + this.NIDK);
      System.out.println("Sisa Masa Kerja\t: " + this.kontrak.selisih(this.getTMT()));
      System.out.println("Tanggal Selesai\t: " + this.kontrak.getFullDate());
      System.out.println("Tunjangan\t: " + this.getTunjangan() + "% * Rp." + this.getGajiPokok() + " = Rp." + tunjangan);
   }

}
