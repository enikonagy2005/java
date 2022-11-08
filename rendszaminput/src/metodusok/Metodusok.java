/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Metodusok {

   public static double atlag(int szam1, int szam2) {
        double atl = (szam1 + szam2) / 2.0;

        return atl;
    }

    public static void feladat() {
        System.out.println("*************");
        System.out.println("*   Feladat   *");
        System.out.println("*************");
    }
    public static void tartomany(int szam3, int szam4){
        int tartomanyAlja;
        int tartomanyTeteje;
        if(szam3<szam4) {
            tartomanyAlja = szam3;
            tartomanyTeteje = szam4;
        }
        else{
            tartomanyAlja = szam4;
            tartomanyTeteje = szam3;
        }
        System.out.println("A tartomány alja:"+tartomanyAlja);
        System.out.println("A tartomány teteje:"+tartomanyTeteje);
    }
    public static int veletlen(int also, int felso) {
        Random rand = new Random();
        int randomSzam = rand.nextInt(felso - also + 1) + also;
        return randomSzam;
    }

    public static double main(String[] args, double atl) {
        feladat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot (átlag-1):");
        int szam1 = scanner.nextInt();
        System.out.println("Adj meg egy másik számot (átlag-2):");
        int szam2 = scanner.nextInt();
        System.out.println("ÁTLAG:");
        System.out.println(atlag(szam1, szam2));
        System.out.println("Adjon meg egy 3. számot:");
        int szam3 = scanner.nextInt();
        System.out.println("Adjon meg egy 4. számot:");
        int szam4 = scanner.nextInt();
        tartomany(szam3, szam4);
        //Random szám generálása bekért tartományból
        System.out.print("Adj meg egy egész számot: ");
        int a = scanner.nextInt();
        System.out.print("Adj meg még egy egész számot: ");
        int b = scanner.nextInt();
       
        int alsoHatar;
        int felsoHatar;
        if (a<b){
            alsoHatar = a;
            felsoHatar = b;
        }
        else {
            felsoHatar = a;
            alsoHatar = b;
        }
        //TÖMB feltöltése random számokkal
        int i;
        int[] tomb = new int[20];
        for (i = 0; i<20; i++) {
            tomb[i] = veletlen(alsoHatar, felsoHatar);
        }
        for (i = 0; i<20; i++) {
            System.out.println(tomb[i]+ "\t");
            
            //Készítsünk egy metódust, ami kiszámolja egy négyzet alapú gúla tárfogatát
            //Bemenő adatként az alap oldalának hosszát és a magasságot adjuk meg
            System.out.println("Add meg a gula alapjának hosszát:");
            int alap= scanner.nextInt();
            System.out.println("Add meg a magasságát a gulának");
            int magassag= scanner.nextInt();
            System.out.println(gula(alap,magassag));
                double terfogat=(alap*magassag)/3;
                return terfogat;
                return atl= (szam1+szam2)/2.0;
               
            }
 
       

        
    }


    

