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
public class BinarySearch {
    public int binarySearch(int[] array,int left,int right,int valueSearch){
        if(right>=left){
            int mid = left +(right-left)/2;
            if(array[mid] == valueSearch)
                return mid;
            if(array[mid]>valueSearch)
                return binarySearch(array, mid+1, right, valueSearch);
            return binarySearch(array, left, mid-1, valueSearch);
        }
        return -1;
    }
}
