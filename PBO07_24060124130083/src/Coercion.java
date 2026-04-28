/*
    File        : Coercion.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Coercion
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 23 April 2026
*/

public class Coercion { 
    /* Atribut */ 

    /* Method */
    public static void main(String args[]) {
        // Point A
        System.out.println("============ POINT A ============");
        
        int x = 65;
        
        System.out.println("X bentuk integer: " + x);
        System.out.println("X bentuk char: " + (char)x);
        System.out.println("X bentuk real: " + (double)x);

        // Point B
        System.out.println("============ POINT B ============");
        
        double x_real = (double)x;
        System.out.println("X konversi ke real: " + x_real);
        x = (int)x_real;
        System.out.println("X kembali ke int: " + x);
        
        // Point C
        System.out.println("============ POINT C ============");
        String X = "1234";
        String Y = "5678";
        
        System.out.println("String X: " + X);
        System.out.println("String Y: " + Y);
        
        String S = X + Y;
        System.out.println("String S hasil konkatenasi X dan Y: " + S);
        
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Integer Z hasil penjumlahan X dan Y: " + Z);

        // Point D
        System.out.println("============ POINT D ============");
        String P = "12.34";
        String Q = "56.78";
        
        System.out.println("String P: " + P);
        System.out.println("String Q: " + Q);
        
        String R = P + Q;
        System.out.println("String R hasil konkatenasi P dan Q: " + R);
        
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Double D hasil penjumlahan P dan Q: " + D);
        
        // Point E
        System.out.println("============ POINT E ============");
        Integer A = Integer.parseInt(S);

        System.out.println("Integer A hasil konversi S: " + A);

        // Point F
        System.out.println("============ POINT F ============");
        String T = A.toString();

        System.out.println("String T hasil konversi A: " + T);
    }
}
