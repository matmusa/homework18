public abstract class Person {

    private String fullName;
    private String who;
    private int age;

    public Person(String fullName, String who, int age) {
        this.fullName = fullName;
        this.who = who;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                " \n fullName : " + fullName +
                " \n who :" + who +
                " \n  age : " + age
                ;
    }
}
