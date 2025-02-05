
public class Person {
	
	private String firstName;
    private String lastName;
    
    Person(){
        this(null,null);
    }
    
    Person(String first,String last) {
        firstName = first;
        lastName = last;
    }

    public void setName(String first,String last) {
        firstName = first;
        lastName = last;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String toString() {
        return firstName +" " + lastName;
    }

}
