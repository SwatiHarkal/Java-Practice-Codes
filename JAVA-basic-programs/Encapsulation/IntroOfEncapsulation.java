package Encapsulation;

public class IntroOfEncapsulation {
    private String name;

    public IntroOfEncapsulation(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name){
         this.name = name;
    }

    public static void main(String[] args) {
        IntroOfEncapsulation obj = new IntroOfEncapsulation("swati");
        //obj.setname("abc");
        System.out.println(obj.getname());
    }
}
