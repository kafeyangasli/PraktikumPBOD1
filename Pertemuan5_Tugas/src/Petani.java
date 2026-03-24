/* Nama File     : Petani.java
 * Deskripsi     : kelas Petani gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 20 Maret 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia {
   /* -- Atribut -- */
   private String asal_kota;
   private static int counterPetani = 0; 

   /* -- Method --- */
   /* \/ Konstruktor \/ */
   // Konstruktor dengan parameter
   public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
      super(nama, tgl_mulai_kerja, alamat, pendapatan);
      this.asal_kota = asal_kota;
      counterPetani++;
   }

   /* \/ Selektor \/ */
   // Selektor asal_kota
   public String getAsalKota() {
      return this.asal_kota;
   }

   // Selektor Static Counter
   public static int getCounterPetani() {
      return counterPetani;
   }

   /* \/ Mutator \/ */
   // Mutator asal_kota
   public void setAsalKota(String asal_kota) {
      this.asal_kota = asal_kota;
   }

   /* Implementasi Interface */
   // Menghitung Masa Kerja
   public int hitungMasaKerja() {
      return (int)this.tgl_mulai_kerja.datesUntil(LocalDate.now()).count() + 0;
   }

   // Menghitung Pajak
   public double hitungPajak() {
      return 0;
   };

}
