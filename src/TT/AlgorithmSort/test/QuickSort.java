/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort.test;

/**
 *
 * @author User
 */
public class QuickSort extends SortBase implements Sort{
    public static void main(String[] args) {
         int[] array = {1,3,7,6,5,4};
         QuickSort sort = new QuickSort();
         sort.show(array);
         sort.sort(array, array.length);
         System.out.println("Sorted:");
         sort.show(array);
    }
    
    @Override
    public void sort(int[] array, int n) {
        int low =0;
        int high = n-1;
        quickSort(array, low, high);
    }
    private void quickSort(int[] array,int low,int high){
        if(low<high){
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
    }
    private  int partition(int[] array ,int low,int high){
        int pivot = array[high];
        int left = low;
        int right = high-1;
        while(true){
            while(left<=right && pivot>array[left])
                left++;
            while(left<=right && pivot <array[right])
                right--;
            if(left>=right)
                break;
            swap(array, left, right);
            left++;
            right--;
        }
        swap(array, left, right);
        return left;
    }
}
