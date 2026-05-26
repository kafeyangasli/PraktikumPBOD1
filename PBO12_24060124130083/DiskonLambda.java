package PBO12_24060124130083;

public class DiskonLambda {
    interface IDiskon {
        public double hitungDiskon(int harga);
    }
    
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // dengan lambda tapi blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        int harga = 45000;
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(harga));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(harga));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(harga));
    }
}
