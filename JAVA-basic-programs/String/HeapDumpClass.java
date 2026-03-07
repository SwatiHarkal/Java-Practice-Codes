package String;

public class HeapDumpClass {
    public static void main(String[] args)
    {
        String s = new String("SachinTendulkar");
        s.substring(5);
        System.out.println(s);

        String s2 = s.substring(6, 15);
        System.out.println(s2);

        String s3 = s2.substring(3);
        System.out.println(s3);

        try {
            Thread.sleep(600000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}