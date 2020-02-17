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
public class Bai18 {
    public static void main(String[] args) {//loại bổ hàng và cột đầu tiên của matrix
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i=1;i<=test;i++){
            int n = in.nextInt();
            int m= in.nextInt();
            int[][] array = new int[n][m];
            add(array, n, m, in);
            show(removeLine(array, n, m), n-1, m-1,i);
        }
    }
    public static int[][] removeLine(int[][] array,int n,int m){
        int[][] newMatrix = new int[n-1][m-1];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                newMatrix[i-1][j-1] = array[i][j];
            }
        }
        return newMatrix;
    }
    public static void add(int[][] array,int n,int m,Scanner in){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = in.nextInt(); 
            }
        }
    }
    public static void show(int[][] array,int n,int m,int test){
        System.out.println("Test "+test+":");
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
