/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas3;
import java.io.*;

/**
 *
 * @author user3
 */
public class FajlBeolvasas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                RandomAccessFile raf;
        String sor;
        String[] nevek= new String[5];
        try {
            int db = 0;
            raf = new RandomAccessFile ("nevek.txt", "r");
                        raf.readLine();
                        sor = raf.readLine();
            while (sor != null) {
                nevek[db] = sor;
                db++;
                sor = raf.readLine();
            }
        }
        catch ( IOException e ) {
            
        }
            for(int i=0; i<nevek.length; i++){
        System.out.println(nevek[i]);
    }
    }
    
}
