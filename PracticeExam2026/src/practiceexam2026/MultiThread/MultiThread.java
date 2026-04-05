/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceexam2026.MultiThread;

/**
 *
 * @author hp
 */
public class MultiThread {
    public static void main(String[] args) {
        Runnable printX=new PrintChar('X', 20);
        Runnable printY=new PrintChar('Y', 20);
        Runnable printZ=new PrintChar('Z', 20);
        
        Thread t1=new Thread(printX);
        Thread t2=new Thread(printY);
        Thread t3=new Thread(printZ);
        
        t1.start();
        t2.start();
        t3.start();
        
        
    }
}
