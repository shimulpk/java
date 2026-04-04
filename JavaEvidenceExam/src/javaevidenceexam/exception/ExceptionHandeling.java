/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaevidenceexam.exception;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Give first number");
            int n1=input.nextInt();
            System.out.println("Give Second number");
            int n2=input.nextInt();
            double result=n1/n2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Program finished");
        }
    }
}
