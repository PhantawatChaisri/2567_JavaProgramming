
public class PersonalInfo {
	
	private Person name;
    private Date bDate;
    private int personId;
    
    PersonalInfo(){
        this(null,null,0,0,0,0);

    }
    PersonalInfo(String first,String last,int month,int day,int year,int ID)
    {
        name = new Person(first,last);
        bDate = new Date(month,day,year);
        personId = ID;

    }
    public void setPersonalInfo (String first,String last,int month,int day,int year,int ID)
    {
        name = new Person(first,last);
        bDate = new Date(month,day,year);
        personId = ID;

    }

    public String toString(){
        return "Name: " + name +"\nDate of birth: " + bDate +"\nPersonal ID: " + personId;
    }

}
