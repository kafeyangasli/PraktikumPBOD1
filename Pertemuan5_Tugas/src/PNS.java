/* Nama File     : PNS.java
 * Deskripsi     : kelas PNS gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 20 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia {
   /* -- Atribut -- */
   private String NIP;
   private static int counterPNS = 0; 

   /* -- Method --- */
   /* \/ Konstruktor \/ */
   // Konstruktor dengan parameter
   public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String NIP) {
      super(nama, tgl_mulai_kerja, alamat, pendapatan);
      this.NIP = NIP;
      counterPNS++;
   }

   /* \/ Selektor \/ */
   // Selektor NIP
   public String getNIP() {
      return this.NIP;
   }

   // Selektor Static Counter
   public static int getCounterPNS() {
      return counterPNS;
   }

   /* \/ Mutator \/ */
   // Mutator NIP
   public void setNIP(String NIP) {
      this.NIP = NIP;
   }

   /* Implementasi Interface */
   // Menghitung Masa Kerja
   public int hitungMasaKerja() {
      return (int)this.tgl_mulai_kerja.datesUntil(LocalDate.now()).count() + 3;
   }

   // Menghitung Pajak
   public double hitungPajak() {
      return 0.1 * this.hitungMasaKerja();
   };

}
