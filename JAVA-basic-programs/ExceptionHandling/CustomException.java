package ExceptionHandling;

class NewException extends Exception {
    NewException(String str){
        super(str);
    }
}


public class CustomException {
    public static void main(String[] args) {
        try {
            NewException obj = new NewException("Creating custom Exception");
            throw obj;
        }
        catch(NewException ne){
            System.out.println("caught NewException");
        }
    }
}
