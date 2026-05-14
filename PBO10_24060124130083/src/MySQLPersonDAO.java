/*
    File        : MySQLPersonDAO.java
    Deskripsi   : Implementasi PersonDAO pada MySQL
    Nama/NIM    : Maulana Ghazzam Adil Al Faiq / 24060124130083
    Tanggal     : 12 Mei 2026
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
  public void savePerson(Person person) throws Exception {
    String name = person.getName();
    
    // Start Connection
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "root");

    // Initiate Query
    String query = String.format("INSERT INTO person (name) VALUES ('%s')", name);
    System.out.println(query);
    Statement s = con.createStatement();
    s.executeUpdate(query);

    // Close Connection
    con.close();
  }
}