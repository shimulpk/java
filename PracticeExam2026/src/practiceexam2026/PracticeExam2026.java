/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiceexam2026;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PracticeExam2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("Input First Number");
            int n1=s.nextInt();
            System.out.println("Input Second Number");
            int n2=s.nextInt();
            double result=n1/n2;
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: Cannot devide by zero");
        } finally {
            System.out.println("Program finished");
        }
        
        
       
    }
    
}
