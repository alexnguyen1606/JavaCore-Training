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
public class BaseArray {
    public static void show(int[][] array,int n,int m,int test){
        System.out.println("Test "+test+":");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==m-1){
                    System.out.print(array[i][j]+"\n");
                }else
                    System.out.print(array[i][j]+"\t");    
        }
    }
    }
    public static void show(int[][] array,int n,int m){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==m-1){
                    System.out.print(array[i][j]+"\n");
                }else
                    System.out.print(array[i][j]+"\t");    
        }
    }
    }
    public static void add(int[][] array,int n,int m,Scanner in){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = in.nextInt(); 
            }
        }
    }
      public static void show(int[] array){
       
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+ " ");
            }
        }
    }
    public static void add(int[] array,Scanner in){
        for(int i=0;i<array.length;i++){
            array[i] =in.nextInt();
        }
    } 
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
    public static int[][] multiMatrix(int[][] array,int n,int m){
        int[][] newMatrix = new int[n][n];
        int[][] matrixTranspose= transposeMatrix(array, n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int[] arrayI = getArrayRow(array, m, i);
                int[] arrayJ = getArrayColumn(matrixTranspose, m, j);
                newMatrix[i][j] = mulArray(arrayI, arrayJ);
            }
        }
        return newMatrix;
    }
    
    public static int mulArray(int[] arrayA,int[] arrayB){
        int result=0;
        for(int i=0;i<arrayA.length;i++){
            result+=arrayA[i]*arrayB[i];
        }
        return result;
    }
    public static int[] getArrayColumn(int[][] array,int length,int position){
        int[] newArray = new int[length];
        for(int i = 0 ;i<length;i++){
            newArray[i] = array[i][position];
        }
        return newArray;
    }
     public static int[] getArrayRow(int[][] array,int length,int position){
        int[] newArray = new int[length];
         for(int i = 0 ;i<length;i++){
            newArray[i] = array[position][i];
        }
        return newArray;
    } 
}
