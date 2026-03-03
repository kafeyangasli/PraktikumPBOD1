/* Nama File     : Dosen.java
 * Deskripsi     : class dosen gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 3 Maret 2026
 */

public class Dosen {

   /***************ATRIBUT*****************/
   private String nip;
   private String nama;
   private String program_studi;

   /***************METHOD******************/
   // Konstruktor Dosen tanpa parameter (kosongan)
   public Dosen() {
      this.nip = "XXXXXXXXXXXXXXXXXX";
      this.nama = "Paidjo";
      this.program_studi = "Manajemen";
   }
   
   // Konstruktor Dosen dengan parameter
   public Dosen(String nip, String nama, String program_studi) {
      this.nip = nip;
      this.nama = nama;
      this.program_studi = program_studi;
   }

   /* SELEKTOR */
   // Selektor NIP
   public String getNIP() {
      return this.nip;
   }

   // Selektor Nama
   public String getNama() {
      return this.nama;
   }

   // Selektor Program Studi
   public String getProdi() {
      return this.program_studi;
   }

   /* MUTATOR */
   // Mutator NIP
   public void setNIP(String nip) {
      this.nip = nip;
   }

   // Mutator Nama
   public void setNama(String nama) {
      this.nama = nama;
   }

   // Mutator Program Studi
   public void setProdi(String program_studi) {
      this.program_studi = program_studi;
   }

   // Print Dosen
   public void printDosen() {
      System.out.println("------------ DATA DOSEN ------------");
      System.out.println("NIP\t\t: " + this.nip);
      System.out.println("NAMA\t\t: " + this.nama);
      System.out.println("PROGRAM STUDI\t: " + this.program_studi);
      System.out.println("------------------------------------");
   }

}