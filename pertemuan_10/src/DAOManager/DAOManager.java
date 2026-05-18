package DAOManager;
import person.PersonDAO;

public class DAOManager {

    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        this.personDAO = person;

    }
     public PersonDAO getPersonDao(){
            return this.personDAO;
    }
}
