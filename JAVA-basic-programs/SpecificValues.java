public class SpecificValues {
    public static void main(String args[]){
        int[] arr = {11,22,33,44,55,65,77,88};
        boolean found65 = false;
        boolean found77 = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 65){
                found65 = true;
            }
            else if(arr[i] == 77){
                found77 = true;
            }
            if(found65 && found77){
                break;
            }
        }
        if(found65 && found77){
            System.out.println("Array containes values 65 and 77");
        }
        else{
            System.out.println("Not Found values");
        }
    }
}
