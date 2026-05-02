package String;

class Mutable {
    private String address;

    public Mutable(String address) {
        this.address = address;
    }
}

public final class ImmuatableClass {
    private String name;
    private int age;
    private Mutable abc;

    public ImmuatableClass(String name, int age, Mutable abc) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    }
}
