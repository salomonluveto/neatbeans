/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author salomon luveto
 */
import java.util.*;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  try{      
  Scanner lv = new Scanner(System.in);
  String c = new String();
  String a = new String();
  String b = new String();
  int d;
  d = lv.nextInt();
 Book li = new Book(a,b,d,c);
 li.auteur="kin";
 
 
        List <Integer> mylist = new ArrayList <Integer>();
        mylist.add(7);
        mylist.add(5);
        mylist.add(1,8);
        mylist.set(1, 4);
        mylist.remove(2);
        System.out.println(mylist.size());
        for(int i = 0;i<mylist.size();i++){
           System.out.println(mylist.get(i)); 
        }
            
          Set<String> fruit = new HashSet<String>();
          fruit.add("mangue");
          fruit.add("avocat");
          fruit.add("banane");
          fruit.add("orange");
          fruit.add("mangusta");
          fruit.remove("mangusta");
          
        System.out.println(fruit);
    System.out.println(mylist);
    Map<Integer,String> mymap = new HashMap<Integer,String>();
    mymap.put(0,"king");
    mymap.put(1,"pascy");
    mymap.put(2,"simon");
    mymap.put(3,"salomon");
    
    
    for (int k = 0;k<mymap.size();k++){
        System.out.println(mymap.get(k));
        
    }
   d = sum(2,3);
        System.out.println(d);
       }
  catch(ArrayIndexOutOfBoundsException t){
      System.out.println("l'erreur "+ t );
  }
    }
    public static int sum(int a, int b){
      int calc = a+b ;
        return calc;
    }
    }
   
 class Book {
     String title;
     String auteur;
     int num;
     String publisher;
     Book(String title, String auteur, int num, String publisher){
         this.title=title;
         this.auteur=auteur;
         this.num=num;
         this.publisher=publisher;
     }
     
    
}

class Animal{
    void deplacer(){
        System.out.println("je me deplace");
    }
}
class Chien extends Animal{
    void deplacer(){
        System.out.println("je marche");
    }
}
class Oiseau extends Animal{
    void deplacer(){
        System.out.println("je vole");
    }
}
class Pigeon extends Oiseau{
    void deplacer(){
        System.out.println("je vole en ville ");
    }
}