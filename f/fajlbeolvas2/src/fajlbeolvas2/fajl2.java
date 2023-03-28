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
public class fajl2 {
     public static void main(String[] args) {
   RandomAccessFile raf;
        String sor;
        Integer[] szam= new Integer[5];
         try
        {
            raf= new RandomAccessFile("fajl2.txt", "r");
            int db=0;
            sor= raf.readLine();
            while    
            {
                szam[db]=sor; 
                db++;     
                sor= raf.readLine();
            }    
            raf.close();
        }
    catch(IOException e)
    {
        System.err.println("HIBA");
    }
    for(int i=0; i<szam.length; i++){
        System.out.println(szam[i]);
    }
    
    }
}
       

     
