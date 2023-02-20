package Sn.edu.ucao.domain;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Tableau {
    public static void main(String[]arg){
         Scanner scanner = new Scanner(System.in );
        System.out.println("Saisissez la marque de la voiture " );
        String marque = scanner.next();
        System.out.println("Saisissez le modéle " );
        String model = scanner.next();
        System.out.println("Saisissez le type de transmission " );
        String TypeTransmission = scanner.next();
        System.out.println("Saisissez le Kilometrage " );
        int Kilometrage = scanner.nextInt(); // la fonction nextInt permet de convertir la valeur en un entier

        System.out.println("-------------------------------------------------------------------" );
        System.out.println("Marque: "+marque);
        System.out.println("Modele: "+model);
        System.out.println("Type de transmission: "+TypeTransmission);
        System.out.println("Kilometrage: "+Kilometrage);
        float moyenne =17.5F ;
        int moyenneEntiere = (int) moyenne ;
        System.out.println("Valeur initiale: "+moyenne);
        System.out.println("Nouvelle valeur: "+moyenneEntiere);
        if (marque.toLowerCase().equals("mercedes")){
            System.out.println("Vous avez une bonne voiture");
        } else
            System.out.println("Chercher une Mercedes");
        }
    }



