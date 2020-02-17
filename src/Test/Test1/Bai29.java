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
public class Bai29 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test-- >=0){
            String a = in.nextLine();
            System.out.println(convertString(a));
        }
    }
    public static String convertString(String a){
        StringBuilder str = new StringBuilder("");
        String[] arrayString = standardized(a).split(" ");
        int n = arrayString.length;
        for(int i=1;i<n;i++){
            if(i==n-1){
                str.append(arrayString[i]+", ");
            }else{
                str.append(arrayString[i]+" ");
            }
        }
        str.append(arrayString[0]);
        return str.toString();
    }
    public static String standardized(String a){
        StringBuilder str = new StringBuilder("");
        boolean checkNext=true;
        for(Character item : a.toCharArray()){
            if(checkNext && Character.isSpaceChar(item))
            {
                break;
            }else if(Character.isSpaceChar(item)){
                checkNext = true;
            }
            else if(checkNext){
                item = Character.toUpperCase(item);
                checkNext=false;
            }else{
                item = Character.toLowerCase(item);
            }
             str.append(item);
        }
        return str.toString();
    }
}
