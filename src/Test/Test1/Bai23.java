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
public class Bai23 extends BaseArray{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int test = in.nextInt();
        for(int i=1;i<=test;i++){
            int n= in.nextInt();
            int[][] matrix = getMatrixSpiral(n);
            show(matrix, n, n, i);
        }
    }
    public static int[][] getMatrixSpiral(int n){
        int[][] matrix = new int[n][n];
        int[] arrayPrime = getArrayPrime(n);
        int count=0;
        int i,j,k,t;
        int m=n;
        int x=0;
        while(count<arrayPrime.length){
            //điền từ trái sang phải
            for(i=x;i<m;i++){
                matrix[x][i] = arrayPrime[count];
                count++;
            }
            //điền từ trên xuống dưới
            for(j=x+1;j<m;j++){
                matrix[j][i-1] = arrayPrime[count];
                count++;
            }
            //điền từ phải sang trái
            for(k=m-2;k>=x;k--){
                matrix[m-1][k] = arrayPrime[count];
                count++;
            }
           
            //điền từ dưới lên trên
            for(t=m-2;t>=x+1;t--)
            {
                matrix[t][k+1]=arrayPrime[count];
                count++;
            }
            m--;
            x++;
        }
        return matrix;
    }
    public static int[] getArrayPrime(int n){
        int array[] = new int[n*n];
        array[0] = 2;
        for(int i=1;i<array.length;i++){
            int value = array[i-1]+1;
            while(value>0){
                if(isPrime(value)){
                    array[i] = value;
                    break;
                }
                value++;
            }
        }
        return array;
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
