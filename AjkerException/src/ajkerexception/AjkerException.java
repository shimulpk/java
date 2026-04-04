/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajkerexception;

/**
 *
 * @author Admin
 */
public class AjkerException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int k=10/0;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Error: cannot divide by zero");
        } finally {
            System.out.println("Prograam complete");
        }
    }
    
}
