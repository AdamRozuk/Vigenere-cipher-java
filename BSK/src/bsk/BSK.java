/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class BSK {

    /**ALA_MA_KOTA_I_DWA_PSY
     * AOALKTW_A_ADP_A__SMIY
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALA_MA_KOTAFCBDG
        System.out.println("wybierz: ");
        Scanner skaner = new Scanner(System.in);
        int l = skaner.nextInt();
            switch (l) {
                case 1: {
                    System.out.println("NAPIS: ");
                    String  napis = skaner.next();
                    System.out.println("DEEP: ");
                    int d = skaner.nextInt();
        RailFence rail = new RailFence(napis);
        System.out.println(rail.getSzyfr());
        System.out.println(rail.getLenght(rail.getSzyfr()));
        rail.seeArray(rail.createArray(rail.getSzyfr()));
        //rail.getLetter(rail.createArray(rail.getSzyfr()),1);
        System.out.println("enter xd");
        rail.seeArrayZakodowany(rail.zakodujSlowo(rail.createArray(rail.getSzyfr()),d));
        //rail.seeTable(rail.odkodujListe(rail.zakodujSlowo(rail.createArray(rail.getSzyfr()),4)));//good
        //System.out.println(rail.Decryption("ABCDEFGHIJKLMNOUPRSTWXYZ", 4));
        //AGMSBFHLNRTZCEIKOPWYDJUX
            System.out.println("NAPIS: ");
                    String  napis2 = skaner.next();
                    System.out.println("DEEP: ");
                    int d2 = skaner.nextInt();
        rail.odkodujSlowo(napis2, d2);
        break;
                }
                case 2:{
                    System.out.println("NAPIS: ");
        String  napis = skaner.next();
        System.out.println("key1: ");
        int a = skaner.nextInt();
        System.out.println("key2: ");
        int b = skaner.nextInt();
        System.out.println();
        System.out.println();
        Cezar2 cez = new Cezar2();//CRYPTOGRAPHY
        System.out.println(cez.code(napis,a,b));
        System.out.println("NAPIS: ");
        String  napis2 = skaner.next();
         System.out.println("key1: ");
        int a2 = skaner.nextInt();
        System.out.println("key2: ");
        int b2 = skaner.nextInt();
        System.out.println(cez.decode(napis2,a2,b2));
        break;
                }
                case 3:{
        Vigenere vig = new Vigenere();
        System.out.println("NAPIS: ");
        String  napis = skaner.next();
        System.out.println("NAPIS: ");
        String  napis2 = skaner.next();
        vig.Zakoduj(napis,napis2);
        System.out.println("NAPIS: ");
        String  napis3 = skaner.next();
        System.out.println("NAPIS: ");
        String  napis4 = skaner.next();//DICPDPXVAZIP
        vig.Decode(napis3,napis4);
        break;
                }
   

    }
    }
    
}
