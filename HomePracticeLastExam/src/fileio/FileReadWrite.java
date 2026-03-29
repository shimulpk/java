/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class FileReadWrite {
    public static void main(String[] args) {
        File file=new File("hello.dat");
        
        try {
            FileOutputStream output=new FileOutputStream(file);
            for(int i=1;i<=10;i++){
            output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input=new FileInputStream(file);
            int value;
            while((value=input.read())!=-1){
                System.out.println(value+"");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
                
    }
}
