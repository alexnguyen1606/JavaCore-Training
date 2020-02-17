/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort;

/**
 *
 * @author User
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1,3,7,6,5,4};
        int[] array1 = {1,3,7,6,5,4};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
        int n = array.length;
        quickSort(array, 0,n-1);
         System.out.println("");
             for(int i:array){
            System.out.print(i+" ");
        }
            
       
        
    }
    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
    }
  
   
  public static  int partition (int arr[], int low, int high)
{
    int left = low;
    int right = high-1;
    int pivot = arr[high];
    while(true){
        while(left<=right && arr[left] > pivot)
            left++;
        while(left<= right && arr[right] <pivot)
            right--;
        if(left >= right)
            break;
        swap(arr, left, right);
        left++;
        right--;
    }
    swap(arr, left, right);
    return left;
}
   public static  void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
       
    }
}
