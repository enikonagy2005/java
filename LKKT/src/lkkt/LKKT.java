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
        //K�rj�nkbe be 2 pozit�v eg�sz sz�mot
        //St�moljuk ki a legkisebb k�z�s t�bbsz�r�s�ket
        int x;
        int y;
        Scanner bill=new Scanner(System.in);
        System.out.println("Add meg az egyik sz�mot:");
        x=bill.nextInt();
        System.out.println("Add meg a m�sik sz�mot:");
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
        //keresett karakter(ek) pozic��ja
        String szoveg;
        szoveg = "Ez egy tetsz�leges sz�veg";
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.isEmpty());
        String szoveg2="";
        System.out.println(szoveg2.isEmpty());
        //lecser�li a sz�vegben a megadott karakter(ek)et m�s karakter(ek)re
        System.out.println(szoveg.replace("tetsz�leges", "ak�rmilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        
          //K�rj�nk be egy di�k teljes nev�t fullName v�toz�ba!
        String fullName, firstName, lastName;
        int szokozhely;
        Scanner= bill;
        bill = new Scanner(System.in);
        System.out.println("Add meg a di�k nev�t:");
        fullName=bill.nextLine();
        //Szedj�k sz�t a nevet firstName �s Lastname v�toz�kba
        lastName=fullName.split(" ")[0];
        System.out.println(firstName);
        System.out.println(lastName);
        //K�rj�k be egy oszt�ly azonos�t�j�t a classId v�ltoz�ba pl: 2022ea vagy 2018ce stb
        String classId;
        System.out.println("Add meg a di�k oszt�ly�t:");
        
        
        
        


          
    }
    
}
