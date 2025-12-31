//1.Write a Java program to sort a numeric array.
public class ArrayPrograms {
	static void SortArray(int[] arr) {

        for(int i = 0; i<arr.length-1;i++){
		  for(int j= i+1; j<arr.length; j++){
		    if(arr[i]>arr[j]){
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
			}
		  }
		}
		System.out.println("Java program to sort a numeric array.");
		for(int i =0; i<arr.length;i++){
		  System.out.print(" "+arr[i]);
		}
	}
	
		
	//2.Write a Java program to sum values of an array.
	//4.Write a Java program to calculate the average value of array elements.

	static void AddArray(int[] arr) {
		int sum = 0;
		int avg = 0;

		System.out.println("Java program to sum values of an array.");
		for(int i =0; i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("Addition: "+sum);
		avg = sum/arr.length;
		System.out.println("Average: "+avg);

	}
	
	//3.Print a 10x10 grid of dashes
	static void GridDash() {

		System.out.println("Print a 10x10 grid of dashes.");
		for(int i =0; i<10;i++){
			for(int j=0; j<10; j++){
				if(j==0){
					System.out.print(". ");
				}
				else {
					System.out.print("_ ");
				}
			}				
			System.out.println();
		}
	}
	
	//5.Write a Java program to test if an array contains a specific value.
	static void FindSpecificValue(int arr[]){
		System.out.println("Check arrayy contains a specific value");
		int key = 8;
		
		switch(key) {
			case 1: System.out.println("Array containes key value "+key);
			break;
			case 2: System.out.println("Array containes key value "+key);
			break;
			case 3: System.out.println("Array containes key value "+key);
			break;
			case 4: System.out.println("Array containes key value "+key);
			break;
			case 5: System.out.println("Array containes key value "+key);
			break;
			case 6: System.out.println("Array containes key value "+key);
			break;
			case 7: System.out.println("Array containes key value "+key);
			break;
			case 8: System.out.println("Array containes key value "+key);
			break;
			case 9: System.out.println("Array containes key value "+key);
			break;
			default: System.out.println("Array don't have key value");
			break;
		}

	}
	//6.Write a Java program to find the index of an array element.
	static void PrintIndex(int[] arr){
		System.out.println("Find index of an element in array");
		for(int i = 0;i<arr.length;i++){
			System.out.println("index " +i+ " value "+arr[i]);
		}
	}
	
		public static void main(String[] args){
	    int[] arr = {3,6,4,1,9,7,5,8,2};
		SortArray(arr);
		System.out.println("\n===========================");
		AddArray(arr);
		System.out.println("\n============================");
		GridDash();
		System.out.println("\n============================");
		FindSpecificValue(arr);
		System.out.println("\n============================");
		PrintIndex(arr);
	}
}