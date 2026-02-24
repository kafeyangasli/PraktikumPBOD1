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
        this(0,0);
        counterTitik++;
    }

    // Konstruktor overloading untuk membuat titik (x,y)
    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    } 

    // Mengembalikan nilai absis
    double getAbsis(){
        return this.absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    // Mengembalikan banyaknya titik yang telah terbuat
    static int getCounterTitik(){
        return counterTitik;
    }

    // Mengatur absis titik dengan nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    // Mengatur ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    // Mencari kuadran
    int getKuadran(){
        if (this.absis == 0 || this.ordinat == 0) {
            return 0;
        } else if (this.absis > 0) {
            if (this.ordinat > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (this.ordinat > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    // Jarak dari pusat
    double jarakPusat() {
        return Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));
    }

    // Jarak dari titik T
    double jarakTitik(Titik T) {
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return Math.sqrt((dx*dx) + (dy*dy));
    }

    // Refleksi terhadap sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Refleksi terhadap sumbu Y
    void refleksiY() {
        this.absis = -this.absis;
    }

    // Mengembalikan titik refleksi terhadap sumbu X
    Titik getRefleksiX() {
        Titik baru = new Titik(this.absis, this.ordinat);
        baru.refleksiX();
        return baru;
    }

    // Mengembalikan titik refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        Titik baru = new Titik(this.absis, this.ordinat);
        baru.refleksiY();
        return baru;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    }

    // Mencetak banyaknya titik
    void printCounterTitik(){
        System.out.println(counterTitik);
    }
}