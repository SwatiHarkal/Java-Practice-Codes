package Array;

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

    //9.Write a Java Program to insert an element(specific position) into an array
    static void InsertElement(int arr4[]){
        arr4[6] = 5;

        for(int i = 0;i<arr4.length;i++){
            System.out.print(arr4[i] + " ");
        }
    }

    //10.Write a Java Program to find the maximum and minimum value of an aray of integer values
    //28.Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.
    //29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.
    static void FindMaxMinArray(int arr1[]){
        int diff = 0;
        System.out.println("Find Max and min in an array");
        int max = arr1[0];
        int min = arr1[0];
        float avg=0 , sum=0;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
            if(arr1[i]<min){
                min = arr1[i];
            }
        }
        for(int i = 0; i<arr1.length;i++){
            if((arr1[i]!=max)&& arr1[i]!=min){
                sum +=arr1[i];
            }
        }

        System.out.println("Max element is: "+max);
        System.out.println("Min element is: "+min);
        diff = max-min;
        avg = sum/(arr1.length-2);
        System.out.println("Difference between max and min values: "+diff);
        System.out.println("Average excluding max and min: "+avg);

    }

    //11.Write a Java Program to reverse an arrayy of integer values
    static void ReverseArray(int arr[]){
        System.out.println("Reverse an Integer Array");

        for(int i = arr.length-1;i>0;i--){
            System.out.print(arr[i] + " ");
        }
    }

    //12. Write a Java Program to find duplicate values in an array of interger values
    static void DuplicateIntArray(int arr3[]){
        System.out.println("Find Duplicate in Interger Array ");
        for(int i=0;i<arr3.length;i++){
            for(int j=i+1;j<arr3.length;j++){
                if(arr3[i] == arr3[j]){
                    System.out.print(arr3[i] + " ");
                    break;
                }
            }
        }
    }

    //14. Write a Java Program to find common elements between two arrays
    static void FindCommonElements(int arr1[], int arr2[]){
        System.out.println("Common elements Between 2 arrays");

        System.out.print("Common elements are");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {3,6,4,1,9,7,5,8,2};
        int arr1[] = {1,3,6,8,9};
        int arr2[] = {5,6,8,3,1,7};
        int arr3[] = {1,2,4,3,5,2,4};
        int arr4[] = {2,3,4,5,6,7,8};
        SortArray(arr);
        System.out.println("\n===========================");
        AddArray(arr);
        System.out.println("\n============================");
        GridDash();
        System.out.println("\n============================");
        FindSpecificValue(arr);
        System.out.println("\n============================");
        PrintIndex(arr);
        System.out.println("\n============================");
        FindCommonElements(arr1,arr2);
        System.out.println("\n============================");
        DuplicateIntArray(arr3);
        System.out.println("\n============================");
        ReverseArray(arr);
        System.out.println("\n============================");
        FindMaxMinArray(arr1);
        System.out.println("\n============================");
        InsertElement(arr4);
    }
}
