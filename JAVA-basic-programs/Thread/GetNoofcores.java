package Thread;

public class GetNoofcores extends Thread {
    public static void main(String[] args) {
//        int cores = Runtime.getRuntime().availableProcessors();
//        System.out.println("Available cores: " + cores);

        GetNoofcores thread = new GetNoofcores();
        Thread th = new Thread(thread);

        System.out.println("Thread state: " +thread.getState());
    }
}
