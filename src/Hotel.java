import java.util.Arrays;

public class Hotel implements Expenses {
    private PersonOfFamily[] persons;

    public Hotel(PersonOfFamily[] persons) {
        this.persons = persons;
    }

    public PersonOfFamily[] getPersons() {
        return persons;
    }

    public void setPersons(PersonOfFamily[] persons) {
        this.persons = persons;
    }

    @Override
    public String expenses() {
        return "com servises in a hotel one day 4000som";
    }

    @Override
    public String toString() {
        return "Home lives " + persons.length + "  there  are :" +
                Arrays.toString(getPersons()) + "and " + expenses();


    }
}
