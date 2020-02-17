/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Test1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class CountWord {
    public static void main(String[] args) {
        int[][] a = {{1,2},{2,1},{3,4}};
       String b ="Xin chào Xin chào tôi là A";
        countString(b);
    }
    public static void countString(String a){
      
       
      
        Map<String,Integer> mapString = new HashMap<String,Integer>();
      
        String[] arrayString = a.trim().split(" ");
        for(String item : arrayString){
            if(mapString.containsKey(item)){
                mapString.replace(item, mapString.get(item)+1);
            }else
                mapString.put(item, 1);
        }
        
        for(String item : mapString.keySet()){
            System.out.println(item+" xuat hien "+mapString.get(item));
        }
    }
}
