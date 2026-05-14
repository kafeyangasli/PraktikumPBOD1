/*
    File        : MainDAO.java
    Deskripsi   : La main thingy
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 12 Mei 2026
*/

public class MainDAO {
    /* Atribut */

    /* Method */
    public static void main(String args[]) {
        /* Kamus */
        Person person;
        DAOManager m;

        /* Algoritma */
        person = new Person("Izzat");
        m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}