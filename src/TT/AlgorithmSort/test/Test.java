/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.AlgorithmSort.test;

import TT.AlgorithmSort.BinarySearch;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {23,22,24,25,100,212,32,30};
        BubbleSort sort = new BubbleSort();
        sort.sort(array, array.length);
        sort.show(array);
        int n = array.length;
        BinarySearch search = new BinarySearch();
        int result = search.binarySearch(array, 0, n-1, 22);
        System.out.println("Find 22:"+result);
        }
}
