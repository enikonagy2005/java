/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stingmetgyakorlás;

/**
 *
 * @author user3
 */
public class Stingmetgyakorlás {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       String szoveg= "A Diak objektuma Vad Alma példányosítás után jön létre.";
            String[] szoveg2=szoveg.split(" ");
            String elsoszo=szoveg2[3];
            String masodikszo=szoveg2[4];
            String nev=elsoszo.toUpperCase()+" "+masodikszo.toUpperCase();
            System.out.println(nev);
            // irasd ki a vadalma hosszát
            System.out.println(nev.length());
            //alma szó kicserélése körtére
            System.out.println(nev.replace("Alma", "Körte"));
            //szóközöket pontra cserélje és az emailcímet fűzze hozzá
            String osztalyAzonosito="2022i";
            System.out.println(nev.toLowerCase().replace(" ", ".")+osztalyAzonosito+"@bankitatabanya.hu");
            String szovegd="Sok lúd disznót győz";
            System.out.println(szovegd.length());
            System.out.println(szovegd.charAt(1));
            System.out.println(szovegd.contains("lúd"));
            System.out.println(szovegd.indexOf("lúd"));
            System.out.println(szovegd.replace("lúd", "veréb"));
            
            
            
        }
    }
    

