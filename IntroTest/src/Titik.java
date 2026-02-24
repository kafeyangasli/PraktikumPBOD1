/* Nama File     : Titik.java
 * Deskripsi     : class titik gokil
 * Pembuat       : Maulana Ghazzam Adil Al Faiq - 24060124130083
 * Tanggal       : 20 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        T1.geser(3,4);
        T1.printTitik();
    }
}

public class Titik {
    /*ATRIBUT*/
    double absis;
    double ordinat;

    /*METHOD*/
    // Konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // Selektor
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    // Mutator
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }

    // Operator
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}