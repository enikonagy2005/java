/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyeniko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class NagyEniko {
 static boolean isCorrectEmailcim(String emailcim);
    static ArrayList<String> correctFormats = new ArrayList<>(Arrays.asList(""));
    public static boolean main(String[] args) { 
        
//Kérje be a program a felhasználótól az email címét addig, amíg formailag nem megfelelő címet ad meg
//Az ellenőrzéshez készíts egy saját metódust, ami visszaadja, hogy helyes vagy nem helyes a formátum
//A formátum akkor helyes, ha van benne @ jel
        Scanner bill = new Scanner(System.in);
        String emailcim;
        
        do{
            System.out.println("Kérem írja be az emailcimet: ");
            emailcim = bill.nextLine();
        } while(!isCorrectEmailcim(emailcim));
        
     
     @SuppressWarnings("ResultOfMethodCallIgnored")
        String format = "";
        
        for (int i = 0; i < emailcim.length(); i++){
            if (Character.isDigit(emailcim.charAt(i))){
         System.out.println(emailcim.contains("@"));
            }
            else {
                format = format.concat("Emailcím elfogadva");
            }
     return correctFormats.contains(format);
    }
    
   
//Hozz létre egy 5 elemű tömböt vagy ArrayList-et. Töltsd fel random egész szám adatokkal 10 és 20 között
//hány olyan szám van a tömbben vagy listában, melyet egy tőle nagyobb szám követ?
//Vizsgáld meg, hogy a tömb elemei növekvő sorrendben állnak-e
        int i;
        ArrayList<Integer> szamok = new ArrayList<>();

        for (i = 0; i < 10; i++) {
            szamok.add((int) (Math.random() * 11) + 10);
        }
         for (i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
        System.out.println("");
        
}
        
        


    
    

