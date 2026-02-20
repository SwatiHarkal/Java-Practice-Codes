package Variables.instance;

public class InstanceExample {
    {
        System.out.println("Instance block-1 executed.");
    }
    {
        System.out.println("Instance block-2 executed.");
    }

    static {
        System.out.println("Static block-1 executed.");
    }
    static {
        System.out.println("Static block-2 executed.");
    }

    InstanceExample()
    {
        System.out.println("0-arg constructor executed.");
    }
    InstanceExample(int a)
    {
        System.out.println("1-arg constructor executed.");
    }

    public static void main(String[] args)
    {
        new InstanceExample();

        new InstanceExample(20);
    }
}
