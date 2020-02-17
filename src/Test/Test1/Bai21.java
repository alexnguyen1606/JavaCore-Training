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
public class Bai21 extends BaseArray{//nhân ma trận chuyển vị
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i=1;i<=test;i++){
        int n=in.nextInt();
        int[][] matrix = generateMatrix(n);
        int[][] resultMatrix = multiMatrix(matrix, n, n);
        show(resultMatrix, n, n,i);    
        }
        
        
    }
    public static int[][] generateMatrix(int n){//tạo ma trận vuông cấp n
        int[][] matrix = new int[n][n];
        int check ;
        for(int i=0;i<n;i++){
            check=i+1;
            int s=1;
            for(int j=0;j<n;j++){
                if(s<=check){
                matrix[i][j] = s;
                s++;
                }
            }
            check++;
        }
        
        return matrix;
    }
}

