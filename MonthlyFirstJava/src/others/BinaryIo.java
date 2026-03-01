
package others;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryIo {
    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("C:\\Users\\hp\\Desktop\\pk.dat");
            for(int i=1;i<=50;i++){
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\hp\\Desktop\\pk.dat");
            int value;
            while((value=input.read())!=-1){
                System.out.println(value +"");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
