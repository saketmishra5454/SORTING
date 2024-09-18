class bubbleSort{
    public static void sort(int arr[], int n){
        //n =5;
        for(int i = 0; i< n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr , j);
                }
            }
        }
    }
    static void swap(int arr[],int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1]=temp;
    }

    public static void main(String args[]){
        int arr[] = {1,3,5,4,2};

       // sort(arr, n);
        // System.out.println(sort(arr, n));
        sort(arr, arr.length);
        for(int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i]);
        
        }
    }
    }
