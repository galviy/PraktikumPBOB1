import DAOManager.DAOManager;
import mysql.MySQLPersonDAO;
import person.Person;

public class App {
    public static void main(String[] args) throws Exception {

        /*Mysql program disini */
        Person person = new Person("galvin ");
        System.out.println("Hello, World!");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDao().savePerson(person);

        } catch(Exception e){
            e.printStackTrace();
        }
        /*Persistent Object */
    }
}
