/* Nama File     : Tanggal.java
 * Deskripsi     : class tanggal tambahan gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 13 Maret 2026
 */

import java.time.LocalDate;

public class Tanggal {

   /***************ATRIBUT*****************/
   private int tahun;
   private int bulan;
   private int hari;

   /***************METHOD******************/
   // KONSTRUKTOR
   // Konstruktor berparameter
   public Tanggal(int hari, int bulan, int tahun) {
      this.hari = hari;
      this.bulan = bulan;
      this.tahun = tahun;
   }

   // SELEKTOR
   // Selektor Hari
   public int getDOM() {
      return this.hari;
   }

   // Selektor Bulan
   public int getMonth() {
      return this.bulan;
   }

   // Selektor Tahun
   public int getYear() {
      return this.tahun;
   }

   // Selektor Bulan Nama
   public String getMonthName() {
      switch (this.bulan) {
         case 1:
            return "Januari";
         case 2:
            return "Februari";
         case 3:
            return "Maret";
         case 4:
            return "April";
         case 5:
            return "Mei";
         case 6:
            return "Juni";
         case 7:
            return "Juli";
         case 8:
            return "Agustus";
         case 9:
            return "September";
         case 10:
            return "Oktober";
         case 11:
            return "November";
         case 12:
            return "Desember";
         default:
            return "ERR";
      }
   }

   // Selektor Tanggal Lengkap
   public String getFullDate() {
      return this.hari + " " + getMonthName() + " " + this.tahun;
   }

   // Selektor Bulan Selanjutnya
   public int getNextMonth() {
      if (bulan >= 12) {
         return 1;
      } else {
         return bulan + 1;
      }
   }

   // Selektor Tanggal Sekarang
   public static Tanggal getToday() {
      LocalDate now = LocalDate.now();
      return new Tanggal(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
   }

   // Copy
   public Tanggal copy() {
      return new Tanggal(this.hari, this.bulan, this.tahun);
   }

   // MUTATOR
   // Mutator Hari
   public void setHari(int hari) {
      this.hari = hari;
   }

   // Mutator Bulan
   public void setBulan(int bulan) {
      this.bulan = bulan;
   }

   // Mutator Tahun
   public void setTahun(int tahun) {
      this.tahun = tahun;
   }

   // Selektor Bulan Selanjutnya
   public void setNextMonth() {
      this.hari = 1;
      if (bulan >= 12) {
         this.bulan = 1;
         this.tahun++;
      } else {
         this.bulan += 1;
      }
   }

   // Selisih Bulan Tahun
   public String selisih(Tanggal tanggal) {
      int sel_tahun;
      int sel_bulan;

      if (this.tahun < tanggal.getYear() || (this.tahun == tanggal.getYear() && this.bulan < tanggal.getMonth())) {
         sel_tahun = tanggal.getYear() - this.tahun;
         sel_bulan = tanggal.getMonth() - this.bulan;
     } else {
         sel_tahun = this.tahun - tanggal.getYear();
         sel_bulan = this.bulan - tanggal.getMonth();
     }
      

      if (sel_bulan < 0) {
         sel_bulan += 12;
         sel_tahun--;
      }

      return sel_tahun + " tahun " + sel_bulan + " bulan";
   }

}