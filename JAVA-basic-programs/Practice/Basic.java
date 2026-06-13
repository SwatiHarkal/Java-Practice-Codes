package Practice;

//class Basic {
//    //Print Hello World
//    public static void main(String[] args){
//        System.out.println("Hello World");
//    }
//}
class Basic{
    int i = 2;
    float f = 2.5f;
    byte b = 0;
    boolean isGreen = false;
    char c = 'S';
    double d = 1.11111111f;
    long l = 222222222;
    short s = 1;

    void add(int a,int b){
        int c= a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Basic test = new Basic();
        test.add(10,20);
    }
}
