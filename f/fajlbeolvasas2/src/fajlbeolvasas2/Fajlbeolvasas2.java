/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class Fajlbeolvasas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek= new String[6];
        
    try
        {
            raf= new RandomAccessFile("nevek.txt", "r");
            int db=0;//Számlálót indítok
            sor= raf.readLine();    //beolvasom az első sort
            while( sor != null)     //addig fusson,amíg a sor nem null
            {
                nevek[db]=sor;   //A neveket tartalmazó tömbbe teszi a kiolvasott adatot
                db++;       //számláló növelése(A WHILE NEM NÖVELI)
                sor= raf.readLine();    //beolvasom a következő sort
            }    
            raf.close();
        }
    catch(IOException e)
    {
        System.err.println("HIBA");
    }
    for(int i=0; i<nevek.length; i++){
        System.out.println(nevek[i]);
    }
    
    }
}
        
        
    