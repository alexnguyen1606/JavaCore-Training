/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai19 extends BaseArray{//loại bỏ hàng và cột có tổng lớn nhất
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i=0;i<=test;i++){
            int n =in.nextInt();
            int m= in.nextInt();
            int[][] array = new int[n][m];
            add(array, n, m, in);
            int[][] newArray = remove(array, n, m);
            show(newArray,n-1,m-1,i);
        }

    }
     public static int findRowMax(int[][] array,int n,int m){//tìm kiếm hàng lớn nhất
        int checkIndex=0;//vị trí hàng cần tìm
        int[] arrayCheck = new int[n];//tạo mảng chứ các tổng giá trị từng hàng
        for(int i=0;i<n;i++){
            int value=0;
            for(int j=0;j<m;j++){
                value+=array[i][j];
            }
            arrayCheck[i] = value;
        }
       
        for(int i=0;i<arrayCheck.length;i++){//tìm kiếm hàng lớn nhất
            if(arrayCheck[i] > arrayCheck[checkIndex])
                checkIndex=i;
        }
        return checkIndex;
    }
     public static int findColumnMax(int[][] array,int n,int m){//tìm kiếm cột lớn nhất
         int checkIndex=0;
         int[] arrayCheck = new int[m];
         for(int i=0;i<m;i++){
             int value=0;
             for(int j=0;j<n;j++){
                 value+=array[j][i];
             }
             arrayCheck[i] = value;
         }
        // show(arrayCheck);
         for(int i=0;i<arrayCheck.length;i++){
            if(arrayCheck[i] > arrayCheck[checkIndex])
                checkIndex=i;
        }
         return checkIndex;
     }
     public static int[][] remove(int[][] array,int n,int m){
         int[][] newArray = new int[n][m-1];
         int column = findColumnMax(array, n, m);
         int row = findRowMax(array, n, m);
         newArray = removeColumn(array, n, m, column);
         int[][] arrayB = new int[n-1][m-1];
         arrayB = removeRow(newArray, n, m-1, row);
         return arrayB;
     }
    public static int[][] removeColumn(int[][] array,int n,int m,int column){//loại bỏ hàng
        int[][] newArray = new int[n][m-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<column){
                    newArray[i][j] = array[i][j];
                }else if(j>column){
                    newArray[i][j-1] = array[i][j];
                }
            }
        }
        return newArray;
    }
   
    public static int[][] removeRow(int[][] array,int n,int m,int row){//loại bỏ cột
        int[][] newArray = new int[n-1][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i<row){
                    newArray[i][j] = array[i][j];
                }else if(i>row){
                    newArray[i-1][j] = array[i][j];
                }
            }
        }
        return newArray;
    }
     
}
