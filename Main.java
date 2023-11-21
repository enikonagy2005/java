import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> feltoltes = new ArrayList<>();
        RandomAccessFile raf;
        String sor;
        try {
            raf = new RandomAccessFile("godor.txt", "r");
            sor = raf.readLine();
            while (sor != null) {
                Gödör obj = new Gödör(sor.split(" "));
                feltoltes.add();
                sor = raf.readLine();
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adja meg a távolságot:");
            double tavolsag = scanner.nextDouble();
            double melyseg = 2 * tavolsag;
            System.out.println("A gödör alja" + melyseg + "Mélységben van az adott helyen");

            System.out.println("Adja meg a felszín területét: ");
            double felszinterulet = sc.nextDouble();
            double erintettTerulet= sc.nextDouble();
            double erintetlenTerulet=felszinterulet-erintettTerulet;
            double erintetlenSzazalek=(erintetlenTerulet/felszinterulet)*100;
            System.out.printf("Az érintetlen terület aránya: ", erintetlenSzazalek);


    } catch (IOException e) {
            {
                System.err.println("ERROR");
            }
        }
        }

    }