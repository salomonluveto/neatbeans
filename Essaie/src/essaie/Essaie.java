/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaie;

/**
 *
 * @author salomon luveto
 */
import java.util.*;
public class Essaie {
    String nom;
    String prenom;
    int age;
    char sexe;
    public Essaie(String nom,String prenom,int age,char sexe){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        
    }
      public  void  SetNom(String nom){
        this.nom = nom;
    }
      public String Getnom(){
          return this.nom;
      }
      protected void manger(String repas){
          System.out.println(this.Getnom() +" mange "+ repas);
      }
      public static class Employe extends Essaie{
       double salaire;
       public  Employe(String nom, String prenom,int age,char sexe,double salaire){
           super(nom, prenom, age,sexe);
           this.salaire = salaire;
       }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereanne
        Scanner lv = new Scanner(System.in);
        String a = new String();
        String b = new String();
        String c = new String();
        char t;
        int d;
        double e;
       
        Essaie pers1 = new Essaie("luveto","dialungana",21,'m');
       pers1.SetNom("salomon");
        pers1.manger("pain");
        
        Employe h = new Employe("luveto","dialungana",21,'m',2000);
        h.SetNom("king");
        h.manger("fufu");
        System.out.println(h.nom +" "+h.prenom+" "+h.age+" "+ h.sexe+" "+h.salaire);
    }
       
}
