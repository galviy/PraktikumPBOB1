package mysql;
import java.sql.*;

import person.*;



public class MySQLPersonDAO implements PersonDAO{

    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_pbo", "root", "");
        String query = "INSERT INTO person(name) VALUES('"+ name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.execute(query);
        con.close();

    }
}
