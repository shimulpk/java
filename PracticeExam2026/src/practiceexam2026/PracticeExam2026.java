/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiceexam2026;

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
            int k=10/0;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Error:divide by zero not allowed");
        } finally {
            System.out.println("Progrramme finished");
        }

        
        
       
    }
    
}
