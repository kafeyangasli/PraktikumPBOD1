/* Nama File     : MataKuliah.java
 * Deskripsi     : class matkul gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 3 Maret 2026
*/

public class MataKuliah {

   /***************ATRIBUT*****************/
   private String idMatkul;
   private String namaMatkul;
   private int SKS;

   /***************METHOD******************/
   // Konstruktor MataKuliah tanpa parameter (kosongan)
   public MataKuliah() {
      this.idMatkul = "XXX1624999";
      this.namaMatkul = "Pemrograman Berorientasi Feeling";
      this.SKS = 4;
   }
   
   // Konstruktor MataKuliah dengan parameter
   public MataKuliah(String idMatkul, String namaMatkul, int SKS) {
      this.idMatkul = idMatkul;
      this.namaMatkul = namaMatkul;
      this.SKS = SKS;
   }

   /* SELEKTOR */
   // Selektor ID Matkul
   public String getIDMatkul() {
      return this.idMatkul;
   }

   // Selektor Nama Matkul
   public String getNamaMatkul() {
      return this.namaMatkul;
   }

   // Selektor SKS Matkul
   public int getSKS() {
      return this.SKS;
   }

   /* MUTATOR */
   // Mutator ID Matkul
   public void setIDMatkul(String idMatkul) {
      this.idMatkul = idMatkul;
   }

   // Mutator Nama Matkul
   public void setNamaMatkul(String namaMatkul) {
      this.namaMatkul = namaMatkul;
   }

   // Mutator SKS Matkul
   public void setSKS(int SKS) {
      this.SKS = SKS;
   }

   // Print MataKuliah
   public void printMatkul() {
      System.out.println("---------- DATA MATAKULIAH ---------");
      System.out.println("KODE\t\t: " + this.idMatkul);
      System.out.println("NAMA\t\t: " + this.namaMatkul);
      System.out.println("JUMLAH SKS\t: " + this.SKS + " SKS");
      System.out.println("------------------------------------");
   }

}