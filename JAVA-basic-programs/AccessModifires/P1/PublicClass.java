package AccessModifires.P1;

class Person {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class PublicClass {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Swati");
        System.out.println(person.name);
    }
}
