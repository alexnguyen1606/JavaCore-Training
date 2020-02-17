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
public class Bai30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test-- >=0){
            String str = in.nextLine();
            System.out.println(convertToEmailName(str));
        }
    }
    public static String convertToEmailName(String a){
        StringBuilder stringBuilder = new StringBuilder("");
        String[] arrayString=standardized(a).trim().split(" ");
        stringBuilder.append(arrayString[arrayString.length-1]);
        for(int i=0;i<arrayString.length-1;i++){
            stringBuilder.append(arrayString[i].charAt(0));
        }
        stringBuilder.append("@gmail.com");
        return stringBuilder.toString();
    }
    public static String standardized(String a){
        StringBuilder stringBuilder = new StringBuilder("");
        boolean check = true;
        for(Character item : a.toCharArray()){
            if(Character.isSpaceChar(item) && check){
                break;
            }
            if(Character.isSpaceChar(item)){
                check = true;
            }else{
                check = false;
            }
            item = Character.toLowerCase(item);
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }
  
    
}
