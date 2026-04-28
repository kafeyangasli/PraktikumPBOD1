public class Inclusion {
    /* Atribut */

    /* Method */
    public static void main(String args[]) {
        /* Kamus */
        Anabul A;

        /* Algoritma */
        A = new Anabul();
        A.Gerak(); A.Bersuara();

        A.setNama("Joe Mama");
        A.Gerak(); A.Bersuara();

        // Inclusion subclass Kucing
        A = new Kucing();
        A.Gerak(); A.Bersuara();

        A.setNama("Joe Mama");
        A.Gerak(); A.Bersuara();
        
        // Inclusion subclass Anjing
        A = new Anjing();
        A.Gerak(); A.Bersuara();

        A.setNama("Doe Gie");
        A.Gerak(); A.Bersuara();
    
        // Inclusion subclass Burung
        A = new Burung();
        A.Gerak(); A.Bersuara();

        A.setNama("Burr");
        A.Gerak(); A.Bersuara();
    }    
}
