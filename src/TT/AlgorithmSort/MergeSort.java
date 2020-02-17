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
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1,0,2,7};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
        int n = array.length;
        mergeSort(array, 0, n-1);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int[] array,int low,int high){//low,high lần lượt chỉ số nhỏ nhất và lớn nhất của mảng
         if(low<high){
            int mid = low +(high-low)/2;//xác đinh phần tử giữa
             mergeSort(array, low, mid);
             mergeSort(array, mid+1, high);
             merge(array, low, mid, high);
        }
    }
    public static void merge(int[] arr,int l,int m,int r){//trộn mảng
    int i, j, k;
    int n1 = m - l + 1;//xác định số lượng phần tử mảng trái
    int n2 =  r - m;//xác định số lượng phần tử mảng phải
 
    /* Tạo các mảng tạm */
    int[] L = new int[n1];
    int[] R = new int[n2];
 
    /* Copy dữ liệu sang các mảng tạm */
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1+ j];
 
    /* Gộp hai mảng tạm vừa rồi vào mảng arr*/
    i = 0; // Khởi tạo chỉ số bắt đầu của mảng con đầu tiên
    j = 0; // Khởi tạo chỉ số bắt đầu của mảng con thứ hai
    k = l; // IKhởi tạo chỉ số bắt đầu của mảng lưu kết quả
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
 
    /* Copy các phần tử còn lại của mảng L vào arr nếu có */
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }
 
    /* Copy các phần tử còn lại của mảng R vào arr nếu có */
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
    }
}
