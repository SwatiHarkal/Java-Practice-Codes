package InterviewPrograms;
import java.util.logging.Logger;

class ExampleOfOverridingMethods {
    //final Logger logger = Logger.getLogger(ExampleOfOverridingMethods.class.getName());
    public void add(int a, int b){
        int sum = a+b;
        //logger.info("Adding: " + sum);
        System.out.println("sum is "+sum);
    }
    void add(int a) {
        //logger.info("value of a from parent: "+a);
        System.out.println("value of a from parent: " +a);
    }
}

public class OverridingMethods extends ExampleOfOverridingMethods {
    @Override
    void add(int a) {
        //logger.info("value of a from child: "+a);
        System.out.println("value of a from child: " +a);
    }

    public static void main(String[] args) {
        //final Logger logger = Logger.getLogger(ExampleOfOverridingMethods.class.getName());
        //logger.info("overriding method");
        OverridingMethods obj = new OverridingMethods();
        obj.add(10);
        ExampleOfOverridingMethods obj1 =  new ExampleOfOverridingMethods();
        obj1.add(10);

    }
}
