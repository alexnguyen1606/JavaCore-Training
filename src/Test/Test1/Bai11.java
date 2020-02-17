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
public class Bai11 extends BaseArray{//đếm só phần tử lớn hơn phần tử đứng trước
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        
        while(test-- >0){
            int[] array = new int[in.nextInt()] ;
            add(array, in);
            System.out.println(countElement(array));
        }
        
    }
    public static int countElement(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){//duyện mảng
            int value = array[i];
            boolean check = false;
            for(int j=i;j>0;j--){//kiểm tra vị trí thứ i có lớn hơn phần tử phí sau hay k 
                if(value>=array[j]){
                    check=true;
                }else check=false;
            }
            if(check){//đếm 
                count+=1;
            }
        }
        return count;
    }
}
