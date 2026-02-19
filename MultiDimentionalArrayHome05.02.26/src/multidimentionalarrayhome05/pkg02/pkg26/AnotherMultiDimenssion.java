
package multidimentionalarrayhome05.pkg02.pkg26;

import java.util.Arrays;


public class AnotherMultiDimenssion {
    public static void main(String[] args) {
        int [][]numbers=new int[5][5];
        numbers[0][0]=1;
        numbers[0][1]=99;
        numbers[0][2]=91;
        numbers[0][3]=11;
        numbers[0][4]=44;
        
        numbers[1][0]=0;
        numbers[1][1]=10;
        numbers[1][2]=9;
        numbers[1][3]=9;
        numbers[1][4]=11;
        
        numbers[2][0]=3;
        numbers[2][1]=23;
        numbers[2][2]=21;
        numbers[2][3]=5;
        numbers[2][4]=20;
        
        numbers[3][0]=13;
        numbers[3][1]=4;
        numbers[3][2]=45;
        numbers[3][3]=66;
        numbers[3][4]=33;
        
        numbers[4][0]=11;
        numbers[4][1]=0;
        numbers[4][2]=1;
        numbers[4][3]=20;
        numbers[4][4]=56;
        
        
        
        for(int[]row:numbers){
        for(int val:row){
            System.out.println(val+ "");
        }
        }
        
        
    }
    
    
}
