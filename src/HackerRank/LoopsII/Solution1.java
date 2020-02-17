/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.LoopsII;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Solution1 {
     public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] ar = new int[n];
            ar[0] = a + b;
            int check = 1;
            for(int j=1;j<n;j++){
                check = check*2;
                int value = ar[j-1] + b*check;
                ar[j] = value;
            }
            for(int j = 0;j<n;j++){
                System.out.print(ar[i]+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
