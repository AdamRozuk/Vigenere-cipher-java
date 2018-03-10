/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsk;

/**
 *
 * @author dell
 */
public class Vigenere{
    Integer lenght = 26;
    char[][] tablica=new char[lenght][lenght];
    
    
    public void Zakoduj(String msg,String key){
        int val =65; //A
        System.out.println();
        System.out.println();
        
        for(int i=0;i<lenght;i++){
            for(int k=0;k<lenght;k++){
                tablica[i][k]=(char)(val++);
                System.out.print(tablica[i][k]);
                    if(val > 90){
                        val =65;
                    }  
            }
            val++;
            System.out.println();
        }
        String key2="";
        int j=0;
        for(int i=0;i<msg.length();i++){
            key2+=key.charAt(j);
            j++;
                if(j>key.length()-1){
                    j=0;
                }   
        }
        System.out.println();
        System.out.println("key2 : "+ key2);
        
        int p=0;
        String output="";
        for(int x =0; x< msg.length();x++){
        for(int i=0;i<lenght;i++){
            for(int k=0;k<lenght;k++){
                if(((int)(msg.charAt(x)-65))==i && (int)(key2.charAt(x)-65)==k){
                output+=tablica[i][k];
                //System.out.println(tablica[i][k]);
                }
            }
        }
        }
         System.out.print("EK(M): "+ output +"\n");

    }
    
    public void Decode(String msg,String key){
        Integer lenght = 26;
        char[][] tablica=new char[lenght][lenght];
        String key2="";
        int j=0;
        for(int i=0;i<msg.length();i++){
            key2+=key.charAt(j);
            j++;
                if(j>key.length()-1){
                    j=0;
                }   
        }
        System.out.println();
        System.out.println("key2 : "+ key2);
        
        int val =65; //A
 
        String output="";
        for(int x =0; x< msg.length();x++){
            output += (char)((msg.charAt(x)-key2.charAt(x)+26)%26 + 65); 
        }
        System.out.println("EK(M): " + output);
        
        
        /*if(((int)(msg.charAt(x)-65))==i && (int)(key2.charAt(0)-65)==k){
        if(((int)(tablica[i][k])-((int)(key2.charAt(x))))>90-26-65){
        output+=(char)tablica[i][k]-(char)key2.charAt(x)+65;
        }
        else output+=(char)tablica[i][k]-(char)key2.charAt(x)+26+65;
        System.out.println(tablica[i][k]);
        }*/
        
    }
    
}
