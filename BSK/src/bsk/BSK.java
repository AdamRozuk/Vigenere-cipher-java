/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsk;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class BSK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALA_MA_KOTAFCBDG
        RailFence rail = new RailFence("ABCDEFGHIJKLMNOUPRSTWQXYZ");
        System.out.println(rail.getSzyfr());
        System.out.println(rail.getLenght(rail.getSzyfr()));
        rail.seeArray(rail.createArray(rail.getSzyfr()));
        //rail.getLetter(rail.createArray(rail.getSzyfr()),1);
        System.out.println("enter xd");
        //rail.seeArrayZakodowany(rail.zakodujSlowo(rail.createArray(rail.getSzyfr())));
        rail.seeTable(rail.odkodujListe(rail.zakodujSlowo(rail.createArray(rail.getSzyfr()))));
        
    }
    
}
