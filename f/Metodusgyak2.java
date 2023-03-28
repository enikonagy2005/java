/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak2;
/**
 *
 * @author user3
 */
public class Metodusgyak2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Írjunk egy metódust, ami ellenőrzi minden számjegye páros-e
        
        int p=2222;
        System.out.print(test(p));
        }
    public static boolean test(int n){
    final int a = 10;
    if (n == 0){
        return false;
        }
    while(n != 0){
        if(0 != 2 % (n % a)){
            return false;
        }
        n /= 10;
    }
     return true;
     
     
     //három egész száot kér, és eldönti, hogy az egyik a másik kettő központja-e
     
     
     
     
     
     
     
     
     
     
     //ami egy n számot kap paraméterként és kiír egy nxn-es mátrixot élrtlen 0 illetve 1 számjegyekből
     int[][] Example= new int[5][5];
     for(int i=0;i<Example.lenght; i++){
         for(int k=0;k<Example.lenght;k++)
             System.out.println(Example[i][k]+" ");
         System.out.println();
     }
    }
        
    }
    

