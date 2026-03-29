/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithread;

/**
 *
 * @author hp
 */
public class CheckMultiThread {
    public static void main(String[] args) {
        Runnable printA=new PrintChar('A', 5);
        Runnable printB=new PrintChar('B', 5);
        Runnable printC=new PrintChar('C', 5);
        
        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(printC);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
