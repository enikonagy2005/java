/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvas2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class Fajlbeolvas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(Integer[] args) {
        // Olvassuk be a számokat
        RandomAccessFile raf;
        String sor;
        Integer[] szamok= new Integer[6];
 try
        {
            raf= new RandomAccessFile("adat1.txt", "r");
            int db=0;
            sor= raf.readLine();    
            {
             while( sor != null)  
            {
                }
                String i= sor;
                db++;    
                sor= raf.readLine();    
            }    
            raf.close();
        }
    catch(IOException e)
    {
        System.err.println("HIBA");
    }
    for(int i=0; i<szamok.length; i++){
        System.out.println(szamok[i]);
                        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
    
