/* Nama File     : Manusia.java
 * Deskripsi     : kelas abstrak manusia
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 20 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
   /* -- Atribut -- */
   protected String nama;
   protected LocalDate tgl_mulai_kerja;
   protected String alamat;
   protected double pendapatan;
   protected static int counterMns = 0;   

   /* -- Method --- */
   /* \/ Konstruktor \/ */
   // Konstruktor dengan parameter
   public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
      this.nama = nama;
      this.tgl_mulai_kerja = tgl_mulai_kerja;
      this.alamat = alamat;
      this.pendapatan = pendapatan;
      counterMns++;
   }

   /* \/ Selektor \/ */
   // Selektor Nama
   public String getNama() {
      return this.nama;
   }

   // Selektor Tanggal Mulai Kerja
   public LocalDate getMulaiKerja() {
      return this.tgl_mulai_kerja;
   }

   // Selektor Alamat
   public String getAlamat() {
      return this.alamat;
   }

   // Selektor Pendapatan
   public double getPendapatan() {
      return this.pendapatan;
   }

   // Selektor Static Counter
   public static int getCounterMns() {
      return counterMns;
   }

   /* \/ Mutator \/ */
   // Mutator Nama
   public void setNama(String nama) {
      this.nama = nama;
   }

   // Mutator Tanggal Mulai Kerja
   public void setMulaiKerja(LocalDate tgl_mulai_kerja) {
      this.tgl_mulai_kerja = tgl_mulai_kerja;
   }  

   // Mutator Alamat
   public void setAlamat(String alamat) {
      this.alamat = alamat;
   }

   // Mutator Pendapatan
   public void setPendapatan(double pendapatan) {
      this.pendapatan = pendapatan;
   }

   // Mencetak informasi dari Manusia
   public void cetakInfo() {
      System.out.println("---------- DETAIL MANUSIA ----------");
      System.out.println("NAMA\t\t\t: " + this.nama);
      System.out.println("TANGGAL MULAI KERJA\t: " + this.tgl_mulai_kerja.toString());
      System.out.println("ALAMAT\t\t\t: " + this.alamat);
      System.out.println("PENDAPATAN\t\t: Rp " + this.pendapatan);
      System.out.println("------------------------------------");
   }


}
