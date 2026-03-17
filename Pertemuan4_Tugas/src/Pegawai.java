/* Nama File     : Pegawai.java
 * Deskripsi     : class pegawai gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 13 Maret 2026
 */

public class Pegawai {

   /***************ATRIBUT*****************/
   private String NIP;
   private String nama;
   private Tanggal tanggal_lahir;
   private Tanggal TMT;
   private double gajiPokok;

   /***************METHOD******************/
   // KONSTRUKTOR
   // Konstruktor tanpa parameter
   public Pegawai() {
      this.NIP = "XXXXXXXXXXXXXXXXXX";
      this.nama = "Ohim";
      this.tanggal_lahir = new Tanggal(30, 9, 1965);
      this.TMT = new Tanggal(15, 5, 1998);
      this.gajiPokok = 2500000;
   }

   // Konstruktor dengan parameter
   public Pegawai(String NIP, String nama, Tanggal tanggal_lahir, Tanggal TMT, double gajiPokok) {
      this.NIP = NIP;
      this.nama = nama;
      this.tanggal_lahir = tanggal_lahir;
      this.TMT = TMT;
      this.gajiPokok = gajiPokok;
   }

   // SELEKTOR
   // Selektor NIP
   public String getNIP() {
      return this.NIP;
   }

   // Selektor Nama
   public String getNama() {
      return this.nama;
   }

   // Selektor Tanggal Lahir
   public Tanggal getTglLahir() {
      return this.tanggal_lahir;
   }

   // Selektor TMT
   public Tanggal getTMT() {
      return this.TMT;
   }

   // Selektor Gaji
   public double getGajiPokok() {
      return this.gajiPokok;
   }

   // MUTATOR
   // Mutator NIP
   public void setNIP(String NIP) {
      this.NIP = NIP;
   }

   // Mutator Nama
   public void setNama(String nama) {
      this.nama = nama;
   }

   // Mutator Tanggal Lahir
   public void setTglLahir(Tanggal tanggal_lahir) {
      this.tanggal_lahir = tanggal_lahir;
   }

   // Mutator TMT
   public void setTMT(Tanggal TMT) {
      this.TMT = TMT;
   }

   // Mutator Gaji
   public void setGajiPokok(double gajiPokok) {
      this.gajiPokok = gajiPokok;
   }

   // Print Informasi Pegawai
   public void printInfo() {
      System.out.println("NIP\t\t: " + this.NIP);
      System.out.println("Nama\t\t: " + this.nama);
      System.out.println("Tanggal Lahir\t: " + this.tanggal_lahir.getFullDate());
      System.out.println("TMT\t\t: " + this.TMT.getFullDate());
      System.out.println("Gaji Pokok\t: " + this.gajiPokok);
   }

}