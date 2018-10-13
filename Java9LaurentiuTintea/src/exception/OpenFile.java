/*
 * Tru to open a file
 */
package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Laurentiu
 */
public class OpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader r; 
        try {
            r = new BufferedReader(new FileReader("C:\\Users\\Laurentiu\\Desktop\\text.txt"));
            try { 
              String firstLine = r.readLine();
              System.out.println("Am citit din fisier: "+ firstLine);
            } catch (IOException ex) {
                //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Exceptia contine mesajul: "+ex.getMessage());
            } finally { 
                try { 
                    r.close();
                } catch (IOException ex) {
                    //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Exceptia a dat mesajul: "+ ex.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exceptia are mesajul:"+ex.getMessage());
        }
        

    }
    
}