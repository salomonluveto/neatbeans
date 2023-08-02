/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author salomon luveto
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nom = new String();
        String postnom = new String();
        String prenom = new String();
        Scanner lv = new Scanner(System.in);
        System.out.println("veuillez inserer le nom svp");
        nom = lv.nextLine();
        System.out.println("veuillez inserer le postnom svp");
        postnom = lv.nextLine();
        System.out.println("veuillez inserer le prenom svp");
        prenom = lv.nextLine();
        Etudiant e = new Etudiant(nom,postnom,prenom);
        System.out.println("MENTION          :      "+e.mention);
        System.out.println("PROMOTION        :      "+e.promotion);
        System.out.println("ANNEE ACADEMIQUE :      "+e.academique);
        float[] cote = new float[11];
        float[] note = new float[11];
        String[] semestre1 = { "Calcus","Analyse infinitesimale","Structure Algebrique","Logique Mathématique","Statistique Descriptive","informatique générale","Algorithmique","Logique formelle , Expression orale et ecrit","Anglais","Electricité","Mecanique"};
        String[] semestre2 = {"Algèbre linéaire","géométrie affine","Logiciels d'application","Langage c","Analyse Math2","Théorie de Probabilité","Statistique Inferentielle","Interface Maths","Economie politique","Eucation à la citoyenneté","Psychologie"};
        int[] ponderation1 = {1,4,3,3,3,3,3,2,2,3,3};
        int[] ponderation2 = {4,4,3,3,3,4,4,1,2,1,1};
        int cre1,cre2,cre3,cre4,cre5,cre6;
        int cr1,cr2,cr3,cr4,cr5,cr6;
        System.out.println("Semestre 1");
        System.out.println();
        for(int i = 0; i<semestre1.length;i++){
            
            System.out.println(semestre1[i]);
            float a = lv.nextFloat();
            cote[i] = a;
        }
        System.out.println("le TOTAL est : ");
        float tot1 = (cote[0]*ponderation1[0])+ (cote[1]*ponderation1[1])+ (cote[2]*ponderation1[2])+ (cote[3]*ponderation1[3])+ (cote[4]*ponderation1[4])+ (cote[5]*ponderation1[5])+ (cote[6]*ponderation1[6])+(cote[7]*ponderation1[7])+ (cote[8]*ponderation1[8])+ (cote[9]*ponderation1[9])+ (cote[10]*ponderation1[10]);    
        System.out.println(tot1);
        float p = 0;
        System.out.println("la moyenne de la categorie A est : ");
        for(int j = 0;j<7;j++){
        float t = (cote[j]*ponderation1[j])/20;
        p = p+t;
        }
        System.out.println(p);
       System.out.println("la moyenne de la categorie B est : ");
      float b = 0;
       for(int k = 7;k<cote.length;k++){
           float f = (cote[k]* ponderation1[k])/10;
           b = b + f;
       }
        
     System.out.println(b);
     System.out.println("la moyenne de la semestre 1 est : ");
     float l = 0;
     for(int h =0;h<semestre1.length;h++){
         float m = (cote[h]* ponderation1[h])/30;
         l = l+m;
     }
        System.out.println(l);
        System.out.println("le nombre de credit captaliser est : ");
        float ue1 = ((cote[0]*ponderation1[0]) + (cote[1]*ponderation1[1]))/5;
        float ue2 = ((cote[2]*ponderation1[2]) + (cote[3]*ponderation1[3]))/6;
        float ue3 = cote[4];
        float ue4 = ((cote[5]*ponderation1[5])+(cote[6]*ponderation1[6]))/6;
        float ue5 = ((cote[7]*ponderation1[7])+(cote[8]*ponderation1[8]))/4;
        float ue6 = ((cote[9]*ponderation1[9])+(cote[10]*ponderation1[10]))/6;
        if(ue1 >= 10)
            cre1 = ponderation1[0] + ponderation1[1];
        else
            cre1 = 0;
        if(ue2 >= 10)
            cre2 = ponderation1[2] + ponderation1[3];
        else
            cre2= 0;
        if(ue3>=10)
            cre3 = ponderation1[4];
        else
            cre3 = 0;
        if(ue4>=10)
            cre4 = ponderation1[5] + ponderation1[6];
        else
            cre4 = 0;
        if (ue5>=10)
            cre5 = ponderation1[7] + ponderation1[8];
        else cre5 = 0;
        if(ue6>=10)
            cre6 = ponderation1[9] + ponderation1[10];
        else 
            cre6 = 0;
        if(p>=10){
            cre1 = 5;
            cre2 = 6;
            cre3 = 3;
            cre4 = 6;
        }
        if(b>=10){
            cre5 = 4;
            cre6 = 6;
        }
            
        int cre = cre1+cre2+cre3+cre4+cre5+cre6;
        System.out.println(cre);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Semestre 2");
        System.out.println();
        
     for(int i = 0; i<semestre2.length;i++){
            
            System.out.println(semestre2[i]);
            float a = lv.nextFloat();
            note[i] = a;
        }
     System.out.println("le TOTAL est : ");
     float tot2 = (note[0]*ponderation2[0])+ (note[1]*ponderation2[1])+ (note[2]*ponderation2[2])+ (note[3]*ponderation2[3])+ (note[4]*ponderation2[4])+ (note[5]*ponderation2[5])+ (note[6]*ponderation2[6])+(note[7]*ponderation2[7])+ (note[8]*ponderation2[8])+ (note[9]*ponderation2[9])+ (note[10]*ponderation2[10]);
     System.out.println(tot2);
        float z = 0;
        System.out.println("la moyenne de la categorie A est : ");
        for(int j = 0;j<7;j++){
        float x = (note[j]*ponderation2[j])/25;
        z = z+x;
        }
        System.out.println(z);
       System.out.println("la moyenne de la categorie B est : ");
      float v = 0;
       for(int k = 7;k<cote.length;k++){
           float d = (note[k]* ponderation2[k])/5;
           v = v + d;
       }
        
     System.out.println(v);
     System.out.println("la moyenne de la semestre 2 est : ");
     float y = 0;
     for(int h =0;h<semestre1.length;h++){
         float c = (note[h]* ponderation2[h])/30;
         y = y+c;
     }
        System.out.println(y);
        System.out.println("le nombre de credit captaliser est : ");
        float u1 = ((note[0]*ponderation2[0]) + (note[1]*ponderation2[1]))/8;
        float u2 = ((note[2]*ponderation2[2]) + (note[3]*ponderation2[3]))/6;
        float u3 = note[4];
        float u4 = ((note[5]*ponderation2[5])+(note[6]*ponderation2[6]))/8;
        float u5 = ((note[7]*ponderation2[7])+(note[8]*ponderation2[8]))/3;
        float u6 = ((note[9]*ponderation2[9])+(note[10]*ponderation2[10]))/2;
        if(u1 >= 10)
            cr1 = ponderation2[0] + ponderation2[1];
        else
            cr1 = 0;
        if(u2 >= 10)
            cr2 = ponderation2[2] + ponderation2[3];
        else
            cr2= 0;
        if(u3>=10)
            cr3 = ponderation2[4];
        else
            cr3 = 0;
        if(u4>=10)
            cr4 = ponderation2[5] + ponderation2[6];
        else
            cr4 = 0;
        if (u5>=10)
            cr5 = ponderation2[7] + ponderation2[8];
        else cr5 = 0;
        if(u6>=10)
            cr6 = ponderation2[9] + ponderation2[10];
        else 
            cr6 = 0;
        if(z>=10){
            cr1 = 8;
            cr2 = 6;
            cr3 = 3;
            cr4 = 8;
        }
        if(v>=10){
            cr5 = 3;
            cr6 = 2;
        }
        int cr = cr1+cr2+cr3+cr4+cr5+cr6;
        System.out.println(cr);
        System.out.println();
        System.out.println();
        System.out.println("Total Annuel");
        
        float total = tot1+tot2;
        System.out.println("la moyenne de la catégorie A est : ");
        float u = 0;
        System.out.println("la moyenne de la categorie A est : ");
        for(int j = 0;j<7;j++){
        float w = ((cote[j]*ponderation1[j]) + (note[j]*ponderation2[j]))/45;
        u = u+w;
        }
        System.out.println(u);
        System.out.println();
        System.out.println("la moyenne de la categorie B est : ");
      float q = 0;
       for(int k = 7;k<cote.length;k++){
           float s = ((cote[k]*ponderation1[k])+(note[k]* ponderation2[k]))/15;
           q = q + s;
       }
        
     System.out.println(q);
     float g = total/60;
     System.out.println("la moyenne general de l'année   "+g);
     float credit = cre+cr;
     System.out.println("Nombre des credits captalisés sur l'année   "+credit);
     Mention lc = new Mention();
     lc.men(g);
     Decision lk = new Decision();
     lk.dec(g);
     
    }
    
}
class Etudiant{
    String nom;
    String Postnom;
    String prenom;
    String mention;
    String promotion;
    String academique;
    
    Etudiant(String nom,String postnom,String prenom){
        this.nom  = nom;
        this.Postnom = postnom;
        this.prenom = prenom;
        this.mention = "INFORMATIQUE,STATISTIQUE ET MATHEMATIQUES";
        this.promotion = "PREMIER LICENCE LMD";
        this.academique = "2019 - 2020";
    }
}
class Mention{
    void men(float a){
    
    if(a<8)
        System.out.println("Insignifiant");
    else if(a<10 && a>8)
        System.out.println("Insuffisant");
    else if(a<12 && a>10)
        System.out.println("Passable");
    else if(a<14 && a>12)
        System.out.println("Assez-Bien");
    else if(a<16 && a>14)
        System.out.println("Bien");
    else if(a<18 && a>16)
        System.out.println("Très bien");
    else if (a<=20 && a>18)
        System.out.println("Excellent");
    
}
}
class Decision{
    void dec(float b){
        if(b>=10)
        System.out.println("Admis");
        else
            System.out.println("Reprend");
    }
}
