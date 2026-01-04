public class CommonStringArray {
    public static void main(String args[]){
        String[] str1 = {"abc","xyz","cde"};
        String[] str2 = {"xyz","cde"};

        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str1[i]==str2[j]){
                    System.out.print(str1[i]+ " ");
                }
            }
        }
    }
}