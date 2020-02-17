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
public class Bai22 extends BaseArray{
    public static void main(String[] args) {//tạo ma trận xoắn ốc ngược
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i=1;i<=test;i++){
        int n =in.nextInt();
        int[][] matrix = generateSpiralMatrix(n);
        show(matrix, n, n,i);
        }
       
    }
    public static int[][] generateSpiralMatrix(int n){//tạo ma trận xoắn ốc
        int[][] matrix = new int[n][n];
        int count=n*n;
        int i,j,k,t;
        int m=n;
        int x=0;
        while(count>0){
            //điền từ trái sang phải
            for(i=x;i<m;i++){
                matrix[x][i] = count;
                count--;
            }
            //điền từ trên xuống dưới
            for(j=x+1;j<m;j++){
                matrix[j][i-1] = count;
                count--;
            }
            //điền từ phải sang trái
            for(k=m-2;k>=x;k--){
                matrix[m-1][k] = count;
                count--;
            }
           
            //điền từ dưới lên trên
            for(t=m-2;t>=x+1;t--)
            {
                matrix[t][k+1]=count;
                count--;
            }
            m--;
            x++;
        }
        return matrix;
    }
}
