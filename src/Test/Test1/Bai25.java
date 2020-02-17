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
public class Bai25 extends BaseArray{//số đẹp 
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    while(test-- >0){
        String n = in.next();
        if(checkNumber(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
            
            
    }
    }
    public static boolean checkNumber(String a){
        int[] array = getArrayNumber(a);
        int n = array.length;
        for(int i=0;i<n/2;i++){
            if(array[i]!=array[n-i-1] || array[i]%2!=0 || array[n-i-1]%2!=0){
                return false;
            }
        }
        return true;
    }
    public static int[] getArrayNumber(String n){
        String[] arrayString = n.trim().split("");
        int[] array = new int[n.length()];
        for(int i=0;i<arrayString.length;i++){
            array[i] = Integer.parseInt(arrayString[i]);
        }
        return array;
    }
}
