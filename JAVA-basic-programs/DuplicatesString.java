public class DuplicatesString{
    public static void main(String args[]){
        String[] str1 = {"abc","xyz","cde", "abc", "cde"};

        for(int i=0;i<str1.length;i++){
            for(int j=i+1;j<str1.length;j++){
                if(str1[i]==str1[j]){
                    System.out.print(str1[i]+ " ");
                }
            }
        }
    }
}