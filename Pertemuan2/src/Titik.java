/* Nama File     : Titik.java
 * Deskripsi     : class titik gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 24 Februari 2026
 */

public class Titik {

    /***************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD******************/
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor overloading untuk membuat titik (x,y)
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    } 

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengembalikan banyaknya titik yang telah terbuat
    static int getCounterTitik(){
        return counterTitik;
    }

    // Mengatur absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // Mengatur ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}