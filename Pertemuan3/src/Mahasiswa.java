/* Nama File     : Mahasiswa.java
 * Deskripsi     : class Mahasiswa gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 3 Maret 2026
 */

import java.util.ArrayList;
public class Mahasiswa {

   /***************ATRIBUT*****************/
   private String nim;
   private String nama;
   private String program_studi;
   private ArrayList<MataKuliah> listMatkul;
   private Dosen dosen_wali;
   private Kendaraan kendaraan;

   /***************METHOD******************/
   // Konstruktor Mahasiswa tanpa parameter (kosongan)
   public Mahasiswa() {
      this.nim = "XXXXXXXXXXXXXX";
      this.nama = "Bigmo";
      this.program_studi = "Ilmu Kriminologi";
      this.listMatkul = new ArrayList<MataKuliah>();
      this.dosen_wali = new Dosen();
      this.kendaraan = new Kendaraan();
   }
   
   // Konstruktor Mahasiswa dengan parameter
   public Mahasiswa(String nim, String nama, String program_studi, Dosen dosen_wali, Kendaraan kendaraan) {
      this.nim = nim;
      this.nama = nama;
      this.program_studi = program_studi;
      this.listMatkul = new ArrayList<MataKuliah>();
      this.dosen_wali = dosen_wali;
      this.kendaraan = kendaraan;
   }

   /* SELEKTOR */
   // Selektor NIM
   public String getNIM() {
      return this.nim;
   }

   // Selektor Nama
   public String getNama() {
      return this.nama;
   }

   // Selektor Program Studi
   public String getProdi() {
      return this.program_studi;
   }

   // Selektor List Matkul
   public ArrayList<MataKuliah> getListMatkul() {
      return this.listMatkul;
   }

   // Selektor Dosen Wali
   public Dosen getDosenWali() {
      return this.dosen_wali;
   }

   // Selektor Kendaraan
   public Kendaraan getKendaraan() {
      return this.kendaraan;
   }

   /* MUTATOR */
   // Mutator NIM
   public void setNIM(String nim) {
      this.nim = nim;
   }

   // Mutator Nama
   public void setNama(String nama) {
      this.nama = nama;
   }

   // Mutator Program Studi
   public void setProdi(String program_studi) {
      this.program_studi = program_studi;
   }

   // Menambahkan Mata Kuliah
   public void addMatkul(MataKuliah matkul) {
      if (this.listMatkul.size() < 50) { // Maks 50 saja
         listMatkul.add(matkul);
      }
   }

   // Mutator Dosen Wali
   public void setDosenWali(Dosen dosen_wali) {
      this.dosen_wali = dosen_wali;
   }

   // Mutator Kendaraan
   public void setKendaraan(Kendaraan kendaraan) {
      this.kendaraan = kendaraan;
   }

   // Mengembalikan jumlah SKS yang diambil Mahasiswa
   public int jumlahSKS() {
      int sum_sks = 0;
      for (MataKuliah matkul : this.listMatkul) {
         sum_sks += matkul.getSKS();
      }

      return sum_sks;
   }

   // Mengembalikan jumlah Mata Kuliah yang diambil Mahasiswa
   public int jumlahMatkul() {
      return this.listMatkul.size();
   }

   // Print MHS
   public void printMhs() {
      System.out.println("---------- DATA MAHASISWA ----------");
      System.out.println("NAMA\t\t: " + this.nama);
      System.out.println("NIM\t\t: " + this.nim);
      System.out.println("PROGRAM STUDI\t: " + this.program_studi);
      System.out.println("------------------------------------");
   }

   // Print MHS secara rinci
   public void printDetailMhs() {
      System.out.println("--------- DETAIL MAHASISWA ---------");
      System.out.println("NAMA\t\t: " + this.nama);
      System.out.println("NIM\t\t: " + this.nim);
      System.out.println("PROGRAM STUDI\t: " + this.program_studi);
      System.out.println("LIST MATAKULIAH\t:");
      for (MataKuliah matkul : this.listMatkul) {
         System.out.println("   [" + matkul.getIDMatkul() + "] " + matkul.getNamaMatkul());
      }
      this.dosen_wali.printDosen();
      this.kendaraan.printKendaraan();
      System.out.println("------------------------------------");
   }
}