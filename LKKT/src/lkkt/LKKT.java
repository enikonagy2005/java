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
    public static void main(String[] args, Scanner Scanner) {
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
        szoveg = "Ez egy tetszõleges szöveg";
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.isEmpty());
        String szoveg2="";
        System.out.println(szoveg2.isEmpty());
        //lecseréli a szövegben a megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("tetszõleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        
          //Kérjünk be egy diák teljes nevét fullName vátozóba!
        String fullName, firstName, lastName;
        int szokozhely;
        Scanner= bill;
        bill = new Scanner(System.in);
        System.out.println("Add meg a diák nevét:");
        fullName=bill.nextLine();
        //Szedjük szét a nevet firstName és Lastname vátozókba
        lastName=fullName.split(" ")[0];
        System.out.println(firstName);
        System.out.println(lastName);
        //Kérjük be egy osztály azonosítóját a classId változóba pl: 2022ea vagy 2018ce stb
        String classId;
        System.out.println("Add meg a diák osztályát:");
        
        
        
        


          
    }
    
}
