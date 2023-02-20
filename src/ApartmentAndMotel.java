import java.util.Arrays;

public class ApartmentAndMotel implements Expenses {

  private   PersonOfFamily[] person3s;

    public ApartmentAndMotel(PersonOfFamily[] person3s) {
        this.person3s = person3s;
    }

    public PersonOfFamily[] getPerson3s() {
        return person3s;
    }

    public void setPerson3s(PersonOfFamily[] person3s) {
        this.person3s = person3s;
    }


    @Override
    public String expenses() {
        return " for apartmant and  com servises  there pay 14000 som";
    }

    @Override
    public String toString() {
        return " In a apartment live  " + person3s.length + " person and there are : " +
                Arrays.toString(getPerson3s()) + "and " + expenses();

    }


}
