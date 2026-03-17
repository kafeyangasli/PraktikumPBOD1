/* Nama File     : Tendik.java
 * Deskripsi     : class tenaga kependidikan gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 13 Maret 2026
 */

public class Tendik extends Pegawai {
   
   /***************ATRIBUT*****************/
   private static double tunjangan = 1.0;
   private static int BUP = 55;
   private String bidang;

   /***************METHOD******************/
   // KONSTRUKTOR
   // Konstruktor tanpa parameter
   public Tendik() {
      super();
      this.bidang = "Akademik";
   }

   // Konstruktor dengan parameter
   public Tendik(String NIP, String nama, Tanggal tanggal_lahir, Tanggal TMT, String bidang, double gajiPokok) {
      super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
      this.bidang = bidang;
   }

   // SELEKTOR
   // Selektor Bidang
   public String getBidang() {
      return this.bidang;
   }

   // MUTATOR
   // Mutator Bidang
   public void setBidang(String Bidang) {
      this.bidang = Bidang;
   }

   // Print Info Tendik
   @Override
   public void printInfo() {
      Tanggal pensiun = this.getTglLahir().copy();
      pensiun.setNextMonth();
      pensiun.setTahun(this.getTMT().getYear() + BUP);
      String masa_kerja = this.getTMT().selisih(Tanggal.getToday());
      String tahun_kerja = masa_kerja.split(" ")[0];
      double tunjangan_final = (tunjangan / 100) * Integer.parseInt(tahun_kerja) * this.getGajiPokok();

      super.printInfo();
      System.out.println("Bidang\t\t: " + this.bidang);
      System.out.println("Masa Kerja\t: " + masa_kerja);
      System.out.println("Tanggal Pensiun\t: " + pensiun.getDOM() + " " + pensiun.getMonthName() + " " + pensiun.getYear());
      System.out.println("Tunjangan\t: " + tunjangan + "% * " + tahun_kerja + " * Rp." + this.getGajiPokok() + " = Rp." + tunjangan_final);
   }

}
