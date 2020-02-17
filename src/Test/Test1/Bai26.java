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
public class Bai26 {//số đẹp
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            String a = in.next();
            if(checkNumber(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean checkNumber(String a){
        int[] array = getArrayNumber(a);
        int n = array.length;
        int value=0;
        for(int i=0;i<n;i++){
            value+=array[i];
        }
        if(array[0]!=array[n-1] || array[0]!=8 || value%10!=0 ){
                return false;
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
