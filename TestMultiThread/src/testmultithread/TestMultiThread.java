/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmultithread;

/**
 *
 * @author Admin
 */
public class TestMultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Runnable printA=new PrintChar('A', 20);
       Runnable printB=new PrintChar('B', 20);
       Runnable printC=new PrintChar('C', 20);
       
       Thread t1=new Thread(printA);
       Thread t2=new Thread(printB);
       Thread t3=new Thread(printC);
       
       t1.start();
       t2.start();
       t3.start();
    }
    
}
