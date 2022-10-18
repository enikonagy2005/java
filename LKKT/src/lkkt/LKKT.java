/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kérjünkbe be 2 pozitív egész számot
        //Stámoljuk ki a legkisebb közös többszörösüket
        int x;
        int y;
        Scanner bill=new Scanner(System.in);
        System.out.println("Add meg az egyik számot:");
        x=bill.nextInt();
        System.out.println("Add meg a másik számot:");
        y=bill.nextInt();
        
        
        int a=x;
        int b=y;
        while(a!=b){
            if (a>b){
                a=a=b;
            }
            else b=b=a;
        }
        int LNKO=a;
        System.out.println(LNKO);
        System.out.println("LKTT: " +x*y/LNKO);
        //keresett karakter(ek) pozicíója
        String szoveg;
        szoveg = "Ez egy tetszőleges szöveg";
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.isEmpty());
        String szoveg2="";
        System.out.println(szoveg2.isEmpty());
        //lecseréli a szövegben a megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        
          //Kérjünk be egy diák teljes nevét fullName vátozóba!
          String fullName = "Nagy Enikő";
        System.out.println(fullName);
        //Szedjük szét a nevet firstName és Lastname vátozókba
        String Firstname= "Enikő";
        String Lastname= "Nagy";
        System.out.println(Firstname);
        System.out.println(Lastname);
        
        
        


          
    }
    
}
