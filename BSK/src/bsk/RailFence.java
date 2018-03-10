/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsk;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author dell
 */
public class RailFence {
    private final ArrayList<String> zakodowaneSlowoArr = new ArrayList<>();
    private final LinkedList<String> odkodowanaLista = new LinkedList<>();
    private String szyfr;
    private String dekodujSlowo;
    private char szyfrLetters;
    private String test;
    private final ArrayList<String> arrayOfStrings = new ArrayList<>();
    private final ArrayList<Integer> goodArray = new ArrayList<>();
    private final ArrayList<String> goodArray2 = new ArrayList<>();

    public RailFence(String szyfr) {
       zakodowaneSlowoArr.clear();
       arrayOfStrings.clear();
       this.szyfr = szyfr;
    }

    public String getSzyfr() {
        return szyfr;
    }

    public void setSzyfr(String szyfr) {
        this.szyfr = szyfr;
    }
    
    public int getLenght(String szyfr) {
        return this.szyfr.length();
    }
    
    public ArrayList createArray(String szyfr){
        arrayOfStrings.clear();
        for(int pos=0; pos < szyfr.length();pos++ ){
            szyfrLetters = szyfr.charAt(pos);
            String test = Character.toString(szyfrLetters);
            arrayOfStrings.add(test);
        }
        return arrayOfStrings;
    }
    
    public void seeArray(ArrayList<String> array){
        for( String str: array ){
            System.out.print(str);
        }
    }
    
    public void getLetter(ArrayList array,int i){
            System.out.println(array.get(i));     
    }
    
    public ArrayList zakodujSlowo(ArrayList array,int n){
        int i = 0;
        int k = 0;
        int iter =0;
        int j=0;
        System.out.println("arr of strings : " + arrayOfStrings.size());
        System.out.println("arr : " + array.size());
        
/////////////////////////////////////////////////////////
        if(n==2){
            i = 0;
            k = 0;
            iter =0;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                    zakodowaneSlowoArr.add(str);
                    k+=2;
                }
                i++;
            }
            
        i = 0;
        k = 1;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                }
                i++;
            }
            
        }
//////////////////////////////////////////////////////////
        else if(n==3){
            i = 0;
            k = 0;
            iter =0;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                    zakodowaneSlowoArr.add(str);
                    k+=2;
                }
                i++;
            }
            
            i = 0;
            k = 0;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))+1 || i == (k*(n - 1))-1){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                        iter++;
                        if(iter > 1){
                            k-=2; 
                            iter = 0;
                        }
                }
                i++;
            }
            i = 0;
            k = 1;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                }
                i++;
            }
            
        }
//////////////////////////////////////////////////////////
        else if(n==4){
            i = 0;
            k = 0;
            iter =0;
              for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                    zakodowaneSlowoArr.add(str);
                    k+=2;
                }
                i++;
            }
            
        i = 0;
        k = 0;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))+1 || i == (k*(n - 1))-1){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                        iter++;
                        if(iter > 1){
                            k-=2; 
                            iter = 0;
                        }
                }
                i++;
            }
            
        i = 0;
        k = 0;
        iter = 0;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))+2 || i == (k*(n - 1))-2){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                        iter++;
                        if(iter > 1){
                            k-=2;
                            iter = 0;
                        }
                }
                i++;
            }
            
        i = 0;
        k = 1;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                }
                i++;
            }
        }
//////////////////////////////////////////////////////////////
        else if(n>=5){
            i = 0;
            k = 0;
            iter =0;
              for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                    zakodowaneSlowoArr.add(str);
                    k+=2;
                }
                i++;
            }
              for (j=1 ; j<n-1 ; j++){
                i = 0;
                k = 0;
                iter=0;
                for( String str: arrayOfStrings ){
                    if( i == (k*(n - 1))+j || i == (k*(n - 1))-j){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                        iter++;
                            if(iter > 1){
                                k-=2;
                                iter = 0;
                            }
                    }   
                i++;
                }
              }
              /*        j++;
              i = 0;
              k = 0;
              for( String str: arrayOfStrings ){
              if( i == (k*(n - 1))+j || i == (k*(n - 1))-j){
              zakodowaneSlowoArr.add(str);
              k+=2;
              iter++;
              if(iter > 1){
              k-=2;
              iter = 0;
              }
              }
              i++;
              }
              j++;
              i = 0;
              k = 0;
              iter = 0;
              for( String str: arrayOfStrings ){
              if( i == (k*(n - 1))+j || i == (k*(n - 1))-j){
              zakodowaneSlowoArr.add(str);
              k+=2;
              iter++;
              if(iter > 1){
              k-=2;
              iter = 0;
              }
              }
              i++;
              }
              j++;
              i = 0;
              k = 0;
              iter = 0;
              for( String str: arrayOfStrings ){
              if( i == (k*(n - 1))+j || i == (k*(n - 1))-j){
              zakodowaneSlowoArr.add(str);
              k+=2;
              iter++;
              if(iter > 1){
              k-=2;
              iter = 0;
              }
              }
              i++;
              }*/            
        i = 0;
        k = 1;
            for( String str: arrayOfStrings ){
                if( i == (k*(n - 1))){
                        zakodowaneSlowoArr.add(str);
                        k+=2;
                }
                i++;
            }
        }
        
          
            System.out.println("finall zakodowane" + zakodowaneSlowoArr.size());
                return zakodowaneSlowoArr;
        
    }
    
    public void seeArrayZakodowany(ArrayList<String> array){
        System.out.println("size zakodowany array : " +array.size());
        for( String str2: array){  //array a nie zakodowaneSlowoArr
            System.out.print(str2);
        }
    }
    
    public String[] odkodujListe(ArrayList<String> array){
        String[] tablica = new String[array.size()];
        String[] tablicaPom = new String[array.size()];
        int i =0;
        int n = 4;
        int wierz =0;
        int pom =0;
        int ile = 0;
        int pom2 = 0;
        int wiersz = 0;
        int iter=1;
        int ile_last =0;
        odkodowanaLista.clear();
        System.out.println("size: "+ array.size() );
        
        for( String kkk: array ){
            tablicaPom[i]=kkk;
            i++;
        }
        for( String kkk2: array ){
            System.out.print(kkk2);
        }
        
        
        i=0;
        for( String str: array ){
            if(wiersz == 0){
            if(i == 0){
                wierz = 0;
                //odkodowanaLista.add(wierz, str);
                tablica[i] = str;
                pom = n-2;
                pom = pom *2;
                pom +=2;
                wierz = pom;
                ile = (array.size()-1)/wierz;
                ile_last = (array.size()-2+n)/wierz;
                //System.out.println("ogon" +((array.size()-1)%n));
                tablica[i+1]=tablicaPom[ile+iter];
                tablica[i+2]=tablicaPom[((array.size()-1)/2)+1];
                tablica[n-1]=tablicaPom[array.size()-ile_last];
                iter++;
            }
            else if( i == 1 && ile >= i){
                pom = n-2;
                pom = pom *2;
                pom +=2;
                wierz = pom;
                System.out.println("Pom: " + pom + wierz);
                //odkodowanaLista.add(wierz, str);
                tablica[wierz] = str;
                tablica[wierz+1]=tablicaPom[ile+i+iter];
                System.out.println("czemu b" + i +" " + iter);
                tablica[wierz -1]=tablicaPom[ile+iter];
                tablica[wierz+2]=tablicaPom[(array.size()-1)/2+1+i+1];
                tablica[wierz-2]=tablicaPom[(array.size()-1)/2+1+i];
                tablica[wierz+3]=tablicaPom[array.size()-1-ile_last+iter];
                iter++;
            }
            else if( i == 2 && ile >= i){
                System.out.println("Pom2: " + pom + wierz);
                //pom = n-2;
                pom = pom *2;
                //pom +=2;
                wierz = pom;
                System.out.println("Pom2: " + pom + wierz);
                System.out.println("test: " + str);
                //odkodowanaLista.add(wierz, str);
                tablica[wierz] = str;
                tablica[wierz+1]=tablicaPom[ile+i+iter];
                tablica[wierz-1]=tablicaPom[ile+iter+i-1];
                tablica[wierz+2]=tablicaPom[(array.size()-1)/2+1+i+iter-1]; // nadal cos nie tak z tym +2 i -2
                tablica[wierz-2]=tablicaPom[(array.size()-1)/2+1+i+iter-2];
                tablica[wierz+3]=tablicaPom[array.size()-1-ile_last+iter];
                iter++;
            }
            else if( i > 2 && ile >= i ){
                pom2 = n-2;
                pom2 = pom2 *2;
                pom2 +=2;
                wierz = wierz + pom2;
                System.out.println(wierz);
                System.out.println("last" +tablicaPom[ile+iter+i-1]);
                System.out.println("ogonek" + array.size()%n);
                if(wierz <= array.size()){
                    tablica[wierz] = str;
                    if( (ile + i +iter) < array.size() && (wierz+1) < array.size()){
                    //System.out.println("tescik: " + wiersz +" "+ ile +" "+ i +" "+ iter);
                    tablica[wierz+1]=tablicaPom[ile+i+iter];
                    tablica[wierz-1]=tablicaPom[ile+iter+i-1];
                    tablica[wierz-2]=tablicaPom[(array.size()-1)/2+1+i+iter-2];
                    if(wierz+2<array.size()){
                        tablica[wierz+2]=tablicaPom[(array.size()-1)/2+1+i+iter-1];
                    }
                    if(i<ile_last){
                        tablica[wierz+3]=tablicaPom[array.size()-1-ile_last+iter];
                    }
                    
                    iter++;
                    }
                    else{
                        tablica[wierz-1]=tablicaPom[ile+iter+i-1];
                        tablica[wierz-2]=tablicaPom[((n-1)*ile)+i+iter-1];
                        iter++;
                    }
                    
                    
                }
            }
            if((array.size()-1)%n == 3 && i>=(array.size()-1)){
                System.out.println("halko?");
                tablica[array.size()-2]=tablicaPom[(array.size()-1)-ile_last];
                tablica[array.size()-1]=tablicaPom[(array.size()-1)/2];
            }

            /* else if((wierz+((n-2)*2)+1) == array.size()-1){
            System.out.println("dupa jakiej swiat nie widzial");
            iter--;
            tablica[wierz+((n-2)*2)+1]=tablicaPom[ile+i+iter];
            }*/
            
            i++;
            }
            
        }
        return tablica;
    }
    
    public void seeTable (String [] tab){
        for(String t : tab){
            System.out.println(t);
        }
    }
    
     
public char[][] odkodujSlowo(String zakodowaneSlowo,int n){
 
 boolean checkdown=false;
 int j=0;
 char[][] tablica=new char[n][zakodowaneSlowo.length()];
 
 for(int i=0; i<zakodowaneSlowo.length() ; i++){
    if(j==0||j==n-1){
        checkdown=!checkdown;
    }
  tablica[j][i]='*';
  if(checkdown==true){
      j++;
  }
  else{
      j--;
  }
 }

 int index=0;
 for(int i=0;i<n;i++){
  for(int k=0;k<zakodowaneSlowo.length();k++){
   if( tablica[i][k] == '*' && index < zakodowaneSlowo.length()){
        tablica[i][k]=zakodowaneSlowo.charAt(index++);
   }
  }
 }
 
 checkdown=false;
 String s="";
 j=0;
 for(int i=0;i<zakodowaneSlowo.length();i++)
    { 
        if( j==0||j==n-1){
            checkdown=!checkdown;
        }
            s+=tablica[j][i];
                if(checkdown==true){
                    j++;
                }
                else j--; 
 }
 System.out.println(s);
    return tablica; 
}
    
}
