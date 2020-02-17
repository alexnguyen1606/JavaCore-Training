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
public class Bai17 {
    public static void main(String[] args) {//tính ma trận chuyển vị
        int[][] a ;
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m=in.nextInt();
        a = new int[n][m];
        add(a, n, m,in);
        int[][] b = transposeMatrix(a, n, m);
        show(b,m,n);
    }
    public static int[][] transposeMatrix(int[][] array,int n,int m){
        int[][] transposeMatrix=new int[m][n];
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                transposeMatrix[j][i] = array[i][j];
            }
        }
        return transposeMatrix;
    }
    public static void add(int[][] array,int n,int m,Scanner in){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = in.nextInt(); 
            }
        }
    }
    public static void show(int[][] array,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==m-1){
                    System.out.print(array[i][j]+"\n");
                }else
                    System.out.print(array[i][j]+" ");    
        }
    }
    }
}
