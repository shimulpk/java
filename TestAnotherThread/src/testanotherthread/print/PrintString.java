/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testanotherthread.print;

/**
 *
 * @author hp
 */
public class PrintString implements Runnable{
//    private String stringToPrint;
//    private int times;
//
//    public PrintString() {
//    }
//
//    public PrintString(String stringToPrint, int times) {
//        this.stringToPrint = stringToPrint;
//        this.times = times;
//    }
//    
//    
//    
//
//    @Override
//    public void run() {
//        for(int i=0;i<times;i++){
//            System.out.println(stringToPrint+"");
//        }
//    }
    
    private char charToPrint;
    private int times;

    public PrintString() {
    }

    public PrintString(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for(int i=0;i<times;i++){
            System.out.println(charToPrint+"");
        }
    }
    
    
            
            
    
}
