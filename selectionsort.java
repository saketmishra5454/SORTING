import java.util.*;
public class selectionsort{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       
       // Read array elements
       for (int i = 0 ; i<n; i++){
       arr[i] = sc.nextInt();
    }
    // call the selection sort method
    selectsort(arr);
    // for(int i = 0; i<n ; i++){
    //     System.out.print("This is the Selection Sort of above array: " + arr[i] + " ");
    // }
    System.out.println("This is the Selection Sort of the given above Element: "+Arrays.toString(arr));
    }
    static void selectsort(int[] arr){
        int m = arr.length;
        for(int i = 0; i<m ; i++){
            int min_ind = i;
            for(int j = i+1;j<m;j++){
                if(arr[j]<arr[min_ind])
                min_ind = j;
            }
            int temp = arr[min_ind];
        arr[min_ind] = arr[i];
        arr[i] = temp;
        }
         }
}
