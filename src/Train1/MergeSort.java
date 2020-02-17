/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train1;

/**
 *
 * @author User
 */
public class MergeSort extends BubbleSort{
    public static void main(String[] args) {
         int[] array = {1,0,2,7};
         show(array);
         int n = array.length;
         mergeSort(array, 0, n-1);
         show(array);
    }
    public static void mergeSort(int[] array,int left,int right){
        if(left<right){
            int mid = left + (right - left)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }
    public static void merge(int[] array,int left,int mid,int right){
        int i,j,k;
        int n1 = mid - left+1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for( i = 0;i<n1;i++){
            L[i] = array[left+i];
        }
        for( j = 0;j<n2;j++){
            R[j] = array[mid +left+ j];
        }
         i=0;//chỉ số mảng phụ 1
         j=0;//mảng phụ 2
         k = left;//chỉ số mảng chính
        while(i<n1 && j<n1){
            if(L[i] < R[j]){
               array[k] = R[j];
               j++;
            }else {
                array[k] = L[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
