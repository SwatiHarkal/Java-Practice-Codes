public class Demo {
  public static void main(String[] args){
    ///int a = 20;
    //int b = 10;

    //System.out.println(a++);//20
    ////System.out.println(+a);//21
   // System.out.println(++a);//22

   // System.out.println(b--);//10
    //System.out.println(+b);//9
    //System.out.println(--b);//8
	
	
	
	/*int[] arr = {5,3,7,4,9,2,8,1,6};
	int evenadd=0;
	int oddadd=0;
	int total=0;
	int arradd=0;
	
	//Print even numbers and addition of even array elements
	System.out.println("Even numbers:");
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			System.out.println(arr[i]);
			evenadd+=arr[i];
		}
	}
	
	//Print odd numbers and addition of odd array elements
	System.out.println("Odd numbers:");
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2!=0){
			System.out.println(arr[i]);
			oddadd+=arr[i];
		}
	}
	
	//addition of array elements using separate loop 
	for(int i=0;i<arr.length;i++){
			arradd+=arr[i];
		}
	System.out.println("addition of even array elements: "+evenadd);
	System.out.println("addition of odd array elements: "+oddadd);	
	//addition of array elements adding evenadd and oddadd 
	total = evenadd+oddadd;
	System.out.println("addition of all array elements: "+total);
	System.out.println("addition of all array elements with separate loop: "+arradd);*/ 
	
	int[] arr = {1,2,3,4};
	
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			for(int k = i; k<=j;k++){
				System.out.print(arr[k]);
			}
			System.out.println();
		}
	}
	
  }
}
