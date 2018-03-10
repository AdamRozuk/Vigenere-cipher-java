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
public class Cezar2 {

        
    public String code(String msg,int a, int b){
    char[] tablica = new char[msg.length()];
    String cipher = ""; 
    for (int i = 0; i < msg.length(); i++)
    {
        tablica[i]=msg.charAt(i);
    }
    
    for (int i = 0; i < msg.length(); i++){
            cipher += (char) ((((a * (tablica[i]-65) ) + b) % 26) + 65);
    }
    return cipher;
    }
    
    public String decode(String cipher ,int a,int b){
    String msg = "";
    int a_inv = 0;
    int flag = 0;
    char[] tablica2 = new char[cipher.length()];
    for (int i = 0; i < cipher.length(); i++)
        {
            tablica2[i]=cipher.charAt(i);
        }
    
    for (int i = 0; i < 26; i++)
        {
            flag = (a * i) % 26;
                if (flag == 1)
                    { 
                        a_inv = i;
                        //System.out.println(a_inv);
        }
    }
    
    for (int i = 0; i < cipher.length(); i++)
        {
                msg += (char) (((a_inv * ((tablica2[i]+65 - b)) % 26)) + 65);
        }
 
    return msg;
    }

}
