package AccessModifires.P1;

class Person2 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class PrivateClass {
    public static void main(String[] args) {
        Person2 person = new Person2();

        person.setName("Swati");
        System.out.println(person.getName());
    }
}
