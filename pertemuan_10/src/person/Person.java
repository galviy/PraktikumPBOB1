package person;


public class Person {

    private int id;
    private String name;

    public Person(String n){
        this.name = n;
    }

    public Person(int i,String n){
        this.id = i;
        this.name = n;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
