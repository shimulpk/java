/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceexam2026.twodimentionalarray;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class TwoDimentionalArray {
    public static void main(String[] args) {
        int [][]numbers={
            {0,10,9,9,11},
            {3,23,21,5,20},
            {13,4,45,66,33},
            {11,0,1,20,56}
        };
        for(int []item:numbers){
        for(int i=0;i<item.length-1;i++){
        for(int j=0;j<item.length-1-i;j++){
        if(item[j]>item[j+1]){
        int temp=item[j];
        item[j]=item[j+1];
        item[j+1]=temp;
        }
        }
        }
        }
        for(int []item:numbers){
            System.out.println(Arrays.toString(item));
        }
    }
}
