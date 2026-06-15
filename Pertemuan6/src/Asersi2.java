/* Nama File     : Asersi2.java
 * Deskripsi     : asersi 2 gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 23 Maret 2026
 */

class Lingkaran {
   private double jari;
   public Lingkaran(double jari) {
      this.jari = jari;
   }
   public double hitungKeliling() {
      double keliling = 2 * Math.PI * this.jari;
      return keliling;
   }
}

public class Asersi2 {

   public static void main(String[] args) {
     double jari = 0;
     assert(jari > 0); // no no NEGATIF/NOL!
     Lingkaran l = new Lingkaran(jari);
     double keliling = l.hitungKeliling();
     System.out.println("Keliling lingkaran: " + keliling);

     /*
      Secara konsep, assertion tidak tepat digunakan untuk memvalidasi suatu input 
      karena assertion hanya dapat dijalankan menggunakan flag -ea pada Java dan
      umumnya diperuntukkan para pengembang dalam mengetes kebenaran kode. Seharusnya, jika
      ingin memvalidasi nilai jari-jari yang tidak boleh nol atau negatif, lebih tepat menggunakan 
      exception seperti IllegalArgumentException.
     */
   }

}
