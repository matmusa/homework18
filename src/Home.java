import java.util.Arrays;

public class Home  implements Expenses{

 private    PersonOfFamily[]person;

    public PersonOfFamily[] getPerson() {
        return person;
    }

    public void setPerson(PersonOfFamily[] person) {
        this.person = person;
    }

    public Home(PersonOfFamily[] person) {
        this.person = person;
    }

    @Override
    public String expenses() {
        return " family pay for com services 1500 som";
    }

    @Override
    public String toString() {
        return "Home lives " +person.length+ "  there  are :"+
                  Arrays.toString(getPerson()) +"and " +expenses()
                ;
    }
}


