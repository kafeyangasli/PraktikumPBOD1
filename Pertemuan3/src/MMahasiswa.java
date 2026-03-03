/* Nama File     : MMahasiswa.java
 * Deskripsi     : driver mahasiswa dkk
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 3 Maret 2026
 */
public class MMahasiswa {
    public static void main(String[] args) {
        Dosen wali_test = new Dosen("197007051997021001", "Priyo Sidik Sasongko", "Informatika");
        wali_test.printDosen();

        Kendaraan kendaraan = new Kendaraan("H 2606 UC", "Motor");
        kendaraan.printKendaraan();

        MataKuliah jarkom = new MataKuliah("MIK1624401", "Jaringan Komputer", 3);
        jarkom.printMatkul();

        MataKuliah pbo = new MataKuliah("MIK1624402", "Pemrograman Berorientasi Objek", 3);
        pbo.printMatkul();

        MataKuliah mbd = new MataKuliah("MIK1624403", "Manajemen Basis Data", 3);
        mbd.printMatkul();
        
        MataKuliah asa = new MataKuliah("MIK1624404", "Analisis dan Strategi Algoritma", 3);
        asa.printMatkul();

        MataKuliah ai = new MataKuliah("MIK1624405", "Kecerdasan Buatan", 3);
        ai.printMatkul();

        MataKuliah gti = new MataKuliah("MIK1624406", "Grafik dan Teknik Interaktif", 3);
        gti.printMatkul();
        
        Mahasiswa mhs = new Mahasiswa("24060124130083", "Maulana Ghazzam Adil Al Faiq", "Informatika", wali_test, kendaraan);

        mhs.addMatkul(jarkom);
        mhs.addMatkul(pbo);
        mhs.addMatkul(mbd);
        mhs.addMatkul(asa);
        mhs.addMatkul(ai);
        mhs.addMatkul(gti);

        mhs.printMhs();
        mhs.printDetailMhs();
    }
}
