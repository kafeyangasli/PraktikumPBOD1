/*
    File        : Person.java
    Deskripsi   : Class Person untuk objek Basis Data
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 12 Mei 2026
*/

public class Person {
    /* Atribut */
    private int id;
    private String name;

    /* Method */
    
    // Konstruktor satu parameter
    Person(String n) {
        this.name = n;
    }

    // Konstruktor dua parameter
    Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    // Getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}