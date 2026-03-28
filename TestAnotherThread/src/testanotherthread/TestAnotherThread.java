/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testanotherthread;

import testanotherthread.print.PrintString;

/**
 *
 * @author hp
 */
public class TestAnotherThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Runnable printA=new PrintString("shimul", 5);
//        Runnable printB=new PrintString("Abul", 5);
//        Runnable printC=new PrintString("Badrul", 5);
//        
//        Thread t1=new Thread(printA);
//        Thread t2=new Thread(printB);
//        Thread t3=new Thread(printC);
//        
//        t1.start();
//        t2.start();
//        t3.start();

Runnable printA=new PrintString('A', 10);
Runnable printB=new PrintString('B', 10);
Runnable printC=new PrintString('C', 10);

Thread t1=new Thread(printA);
Thread t2=new Thread(printB);
Thread t3=new Thread(printC);

t1.start();
t2.start();
t3.start();
        
                
    }
    
}
