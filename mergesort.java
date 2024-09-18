class mergesort{
    public static void sort(int arr[], int n){
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j);
                }
            }
        }
    }
    public static void swap(int arr[], int j ){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1]= temp;
    }
    public static void main(String []args){
        int arr[] = {5,3,1,7,2};
        sort(arr,arr.length);
        for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
    }
}