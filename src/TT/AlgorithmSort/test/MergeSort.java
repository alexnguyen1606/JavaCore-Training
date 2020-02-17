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
public class MergeSort extends SortBase implements Sort{

    public static void main(String[] args) {
        int[] array = {1,3,7,6,5,4};
        MergeSort merge = new MergeSort();
        merge.show(array);
        merge.sort(array, array.length);
        System.out.println("Sorted");
        merge.show(array);
    }
    @Override
    public void sort(int[] array, int n) {
        int low = 0;
        int high = n-1;
        mergeSort(array, low, high);
    }
    private void mergeSort(int[] array,int low,int high){
        if(low<high){
            int mid = low +(high-low)/2;
            mergeSort(array, low, mid);
            mergeSort(array, mid+1, high);
            merge(array, low, mid, high);
        }
    }
    private void merge(int[] array,int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j;
        for(i=0;i<n1;i++){
            right[i] = array[i+low];
        }
        for(j=0;j<n2;j++){
            right[j] = right[mid + j + 1];
        }
        i=0;
        j=0;
        int k=1;//chỉ số cho array
        while(i<n1 && j< n2){
            if(left[i]>=right[j]){
                array[k] = array[j];
                j++;
            }else{
                array[k] = array[i];
                i++;
            }
            k++;    
        }
        while(i<n1){
            array[k] = array[i];
            k++;
            i++;
        }
        while(j<n2){
            array[k] = array[j];
            k++;
            j++;
        }
    }
    
}
