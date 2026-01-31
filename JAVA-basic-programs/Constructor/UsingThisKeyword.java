package Constructor;

class UsingThisKeyword {
    public UsingThisKeyword(){
        System.out.println("no-args Constructor");
    }

    public UsingThisKeyword(int a) {
        this();
        System.out.println("1 args Constructor");
    }

    public UsingThisKeyword(int a, boolean b) {
        this(10);
        System.out.println("2 args Constructor");
    }

    public static void main(String[] args) {
        UsingThisKeyword obj = new UsingThisKeyword(10,false);
    }
}
