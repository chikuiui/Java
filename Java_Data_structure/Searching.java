package Java_Data_structure;

public class Searching {
    /*  Linear Search */
    public static boolean linear_search(int arr[],int key){
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == key)return true;
        }
        return false;
    }

    /*  Binary Search (only works on sorted array)*/

    public static boolean binary_search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > key){
                end = mid - 1;
            }else if(arr[mid] < key){
                start = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int key = 100;

        /* Linear Search Checking */
        if(linear_search(arr,key) == true){
            System.out.println("Item is Present!");
        }else{
            System.out.println("Item is Not Present!");
        }

        /*  Binary Search Checking */
        if(binary_search(arr,key) == true){
            System.out.println("Item is Present!");
        }else{
            System.out.println("Item is Not Present!");
        }
    }


}
