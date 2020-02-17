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
public class Bai20 extends BaseArray{//nhân ma trận chuyển vị
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i=1;i<=test;i++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] array = new int[n][m];
            add(array, n, m, in);
            int[][] result = multiMatrix(array, n, m);
            show(result, n, n, i);
        }
    
    }
    

}
