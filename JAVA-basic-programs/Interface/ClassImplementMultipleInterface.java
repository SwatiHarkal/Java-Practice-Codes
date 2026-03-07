package Interface;

interface Playable {
    void play();
}

interface Eatable {
    void eat();
}

public class ClassImplementMultipleInterface implements Playable,Eatable {
    public void play(){
        System.out.println("play");
    }

    public void eat(){
        System.out.println("eat");
    }
    public static void main(String[] args) {
        ClassImplementMultipleInterface obj = new ClassImplementMultipleInterface();
        obj.play();
        obj.eat();

    }
}
