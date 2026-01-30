package Constructor;

class GrandParent {
    public GrandParent() {
        System.out.println("No-args GrandParent constructor in multilevel");
    }

    public GrandParent(int a){
        System.out.println("1 args GrandParent constructor in multilevel");
    }
}

class Parent extends GrandParent {
    public Parent() {
        System.out.println("No-args Parent constructor in multilevel");
    }

    public Parent(int a,int b){
        System.out.println("1 args Parent constructor in multilevel");
    }
}

public class ConstructorWithMultilevel extends Parent {
    public static void main(String[] args) {
        ConstructorWithMultilevel obj = new ConstructorWithMultilevel();
        Parent obj1 = new Parent(10,20);
    }
}
