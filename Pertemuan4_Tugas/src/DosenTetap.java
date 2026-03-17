/* Nama File     : DosenTetap.java
 * Deskripsi     : class dosen tetap gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 13 Maret 2026
 */

public class DosenTetap extends Dosen {
   
   /***************ATRIBUT*****************/
   private String NIDN;
   private static final int BUP = 65;

   /***************METHOD******************/
   // KONSTRUKTOR
   // Konstruktor tanpa parameter
   public DosenTetap() {
      super();
      this.NIDN = "XXXXXXXXXX";
   }

   // Konstruktor dengan parameter
   public DosenTetap(String NIP, String NIDN, String nama, Tanggal tanggal_lahir, Tanggal TMT, String fakultas, double gajiPokok) {
      super(NIP, nama, tanggal_lahir, TMT, fakultas, gajiPokok, 2.0f);
      this.NIDN = NIDN;
   }

   // SELEKTOR
   // Selektor NIDN 
   public String getNIDN() {
      return this.NIDN;
   }

   // MUTATOR
   // Mutator NIDN
   public void setNIDN(String NIDN) {
      this.NIDN = NIDN;
   }

   // Print Informasi Dosen Tetap
   @Override
   public void printInfo() {
      Tanggal pensiun = this.getTglLahir().copy();
      pensiun.setNextMonth();
      pensiun.setTahun(this.getTMT().getYear() + BUP);
      String masa_kerja = this.getTMT().selisih(Tanggal.getToday());
      String tahun_kerja = masa_kerja.split(" ")[0];
      double tunjangan = (this.getTunjangan() / 100) * Integer.parseInt(tahun_kerja) * this.getGajiPokok();

      super.printInfo();
      System.out.println("NIDN\t\t: " + this.NIDN);
      System.out.println("Masa Kerja\t: " + masa_kerja);
      System.out.println("Tanggal Pensiun\t: " + pensiun.getDOM() + " " + pensiun.getMonthName() + " " + pensiun.getYear());
      System.out.println("Tunjangan\t: " + this.getTunjangan() + "% * " + tahun_kerja + " * Rp." + this.getGajiPokok() + " = Rp." + tunjangan);
   }

}
