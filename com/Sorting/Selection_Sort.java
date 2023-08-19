package com.Sorting;

class Selection_Sort{
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int mini = i;
            for(int j=i +1; j<n; j++){
                if(arr[mini] >arr[j]){
                    mini = j;
                }
            }
            //Swap code
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        //Print sorted list
        for(int data: arr){
            System.out.print(data + " " );
        }
    }
    public static void main(String[] args) {
        int[] arr = {20,12,10,15,2};
        sort(arr);
    }
}