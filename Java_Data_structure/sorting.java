package Java_Data_structure;

import java.util.ArrayList;
import java.util.Locale;

public class sorting {

    /* Array Printing */
    public static void print(final int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    /* Bubble Sorting */
    public static void Bubble_sort(int arr[]){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /* Merge Sort with Merge method */
    public static void MERGE(int arr[],int s,int mid,int e){
        ArrayList<Integer> a = new ArrayList<>(); //
        int i = s;
        int j = mid+1;


        while(i <= mid && j <= e){
            if(arr[i] <= arr[j]){
                a.add(arr[i++]);
            }else{
                a.add(arr[j++]);
            }
        }
        while(i <= mid)a.add(arr[i++]);
        while(j <= e)a.add(arr[j++]);

        for(i = s ; i <= e ; i++){
            arr[i] = a.get(i-s); // (i-s) start indexing from 0 to .. n
        }
    }

    public static void merge_sort(int arr[],int s,int e){
            if(s >= e)return;
            int mid = (s+e)/2;
            merge_sort(arr,s,mid);
            merge_sort(arr,mid+1,e);
            MERGE(arr,s,mid,e);

    }

    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1,6};
        int n = arr.length;

        // bubble sort
//          Bubble_sort(arr);
//          print(arr);
        // merge sort
          merge_sort(arr,0,n-1);
          print(arr);

    }
}
