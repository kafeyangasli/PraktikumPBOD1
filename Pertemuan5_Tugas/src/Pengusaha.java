/* Nama File     : Pengusaha.java
 * Deskripsi     : kelas Pengusaha gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 20 Maret 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements IPajak {
   /* -- Atribut -- */
   private String NPWP;
   private static int counterPengusaha = 0; 

   /* -- Method --- */
   /* \/ Konstruktor \/ */
   // Konstruktor dengan parameter
   public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String NPWP) {
      super(nama, tgl_mulai_kerja, alamat, pendapatan);
      this.NPWP = NPWP;
      counterPengusaha++;
   }

   /* \/ Selektor \/ */
   // Selektor NPWP
   public String getNPWP() {
      return this.NPWP;
   }

   // Selektor Static Counter
   public static int getCounterPengusaha() {
      return counterPengusaha;
   }

   /* \/ Mutator \/ */
   // Mutator NPWP
   public void setNPWP(String NPWP) {
      this.NPWP = NPWP;
   }

   /* Implementasi Interface */
   // Menghitung Masa Kerja
   public int hitungMasaKerja() {
      return (int)this.tgl_mulai_kerja.datesUntil(LocalDate.now()).count() + 8;
   }

   // Menghitung Pajak
   public double hitungPajak() {
      return 0.15 * this.hitungMasaKerja();
   };

}
