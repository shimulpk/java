/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaryclasscheck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryClassCheck {

    
    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("C:\\Users\\Admin\\Desktop\\pk.dat");
            for(int i=1;i<=20;i++){
            output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\Admin\\Desktop\\pk.dat");
            int value;
            while((value=input.read()) !=-1){
                System.out.println(value+ " ");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
