/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author salomon luveto
 */
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
        System.out.println("INSIGNIFIANT");
    else if(a<10 && a>8)
        System.out.println("INSUFFISANT");
    else if(a<12 && a>10)
        System.out.println("PASSABLE");
    else if(a<14 && a>12)
        System.out.println("ASSEZ-BIEN");
    else if(a<16 && a>14)
        System.out.println("BIEN");
    else if(a<18 && a>16)
        System.out.println("TRES BIEN");
    else if (a<=20 && a>18)
        System.out.println("EXCELLENT");
    
}
}
class Decision{
    void dec(float b){
        if(b>=10)
        System.out.println("ADMIS");
        else
            System.out.println("REPREND");
    }
}

public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        try{
            //déclaretion des variables
            
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
       
        System.out.println("ecrire le numéro du bulletin");
        int fi = lv.nextInt(); 
        int ji = 568;
        float[] cote = new float[11];
        float[] note = new float[11];
        String[] semestre1 = { "Calculus                  ","Analyse infinitesimale    ","Structure Algebrique      ","Logique Mathématique      ","Statistique Descriptive   ","informatique générale     ","Algorithmique             ","Logique formelle et EOE    ","Anglais                   ","Electricité               ","Mecanique                 "};
        String[] semestre2 = {"Algèbre linéaire          ","géométrie affine          ","Logiciels d'application   ","Langage c                 ","Analyse Math2             ","Théorie de Probabilité    ","Statistique Inferentielle ","Interface Maths           ","Economie politique        ","Education à la citoyenneté","Psychologie               "};
        int[] ponderation1 = {1,4,3,3,3,3,3,2,2,3,3};
        int[] ponderation2 = {4,4,3,3,3,4,4,1,2,1,1};
        int cre1,cre2,cre3,cre4,cre5,cre6;
        int cr1,cr2,cr3,cr4,cr5,cr6;
        
        //recupération des valeurs inserées
       
        System.out.println("\t\t\t\t\t\tSemestre 1");
        for(int i = 0; i<semestre1.length;i++){ 
            System.out.print(semestre1[i]+"\t\t\t");
            float a = lv.nextFloat();
            while(a>21 || a<0){
                System.out.print("inserer un nombre compris entre 0 et 20\t\t");
                a = lv.nextFloat();
            }   
            cote[i] = a;   
        }
      
        // total du premier semestre
        
        float tot1 = (cote[0]*ponderation1[0])+ (cote[1]*ponderation1[1])+ (cote[2]*ponderation1[2])+ (cote[3]*ponderation1[3])+ (cote[4]*ponderation1[4])+ (cote[5]*ponderation1[5])+ (cote[6]*ponderation1[6])+(cote[7]*ponderation1[7])+ (cote[8]*ponderation1[8])+ (cote[9]*ponderation1[9])+ (cote[10]*ponderation1[10]);
        
        //moyenne de la categorie a
        
       float p = 0;
        for(int j = 0;j<7;j++){
        float t = (cote[j]*ponderation1[j])/20;
        p = p+t;
        }
      
      //calcul de la moyenne du catégorie B
      
      float b = 0;
       for(int k = 7;k<cote.length;k++){
           float f = (cote[k]* ponderation1[k])/10;
           b = b + f;
       }
       
       // moyenne du semestre 1
       
     float l = 0;
     for(int h =0;h<semestre1.length;h++){
         float m = (cote[h]* ponderation1[h])/30;
         l = l+m;
     }
     
     // la moyenne des UE
     
        float ue1 = ((cote[0]*ponderation1[0]) + (cote[1]*ponderation1[1]))/5;
        float ue2 = ((cote[2]*ponderation1[2]) + (cote[3]*ponderation1[3]))/6;
        float ue3 = cote[4];
        float ue4 = ((cote[5]*ponderation1[5])+(cote[6]*ponderation1[6]))/6;
        float ue5 = ((cote[7]*ponderation1[7])+(cote[8]*ponderation1[8]))/4;
        float ue6 = ((cote[9]*ponderation1[9])+(cote[10]*ponderation1[10]))/6;
        
        // credit capitaliser
        
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
        
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("\t\t\t\t\t\tSemestre 2");

        
     for(int i = 0; i<semestre2.length;i++){
            
            System.out.print(semestre2[i]+"\t\t\t");
            float a = lv.nextFloat();
            while(a>21 || a<0){
                System.out.print("inserer un nombre compris entre 0 et 20\t\t");
                a = lv.nextFloat();
            }
           
            note[i] = a;
        }
    
     float tot2 = (note[0]*ponderation2[0])+ (note[1]*ponderation2[1])+ (note[2]*ponderation2[2])+ (note[3]*ponderation2[3])+ (note[4]*ponderation2[4])+ (note[5]*ponderation2[5])+ (note[6]*ponderation2[6])+(note[7]*ponderation2[7])+ (note[8]*ponderation2[8])+ (note[9]*ponderation2[9])+ (note[10]*ponderation2[10]);

        float z = 0;
        
        for(int j = 0;j<7;j++){
        float x = (note[j]*ponderation2[j])/25;
        z = z+x;
        }
    
       
      float v = 0;
       for(int k = 7;k<cote.length;k++){
           float d = (note[k]* ponderation2[k])/5;
           v = v + d;
       }
        
    
     
     float y = 0;
     for(int h =0;h<semestre1.length;h++){
         float c = (note[h]* ponderation2[h])/30;
         y = y+c;
     }
       

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
        String[] UE1= {"MAT102"," ","MAT101"," ","STA101","INF101"," ","COM191"," ","PHY192"," "};
        String[] UE2 = {"MAT103"," ","INF102"," ","MAT104","STA102"," ","MAT105"," ","PSY191"," "};
        String[] int1= {"ANALYSE MATHEMATIQUE 1              "," ","STRUCT ALGEBRIQUE ET LOGIQUE MATH   "," ","STATISTIQUE DESCRIPTIVE             ","INFORMATIQUE ET ALGORITHMIQUE       "," ","LANGUES ET COMMUNICATION 1          "," ","MECANIQUE ET ELECTRICITE            "," "};
        String[] int2= {"ALGEBRE ET GEOMETRIE AFFINE         "," ","LOGICIELS ET LANGAGES               "," ","ANALYSE MATHEMATIQUE 2              ","PROBABILITE ET STATISTIQUE 1        "," ","MATHS,INFORMATI ET SOCIETE    "," ","CULTURE GENERALE                    "," "};
        
        String[] categorie={ "A"," ","A"," ","A","A"," ","B"," ","B"," "};
        String [] credit = {"5"," ","6"," ","3","6"," ","4"," ","6"," "};
        String [] credit2 = {"8"," ","6"," ","3","8"," ","3"," ","2"," "};
        String [] ue = {""+ue1," ",""+ue2," ",""+ue3,""+ue4," ",""+ue5," ",""+ue6," "};
        String [] U = {""+u1," ",""+u2," ",""+u3,""+u4," ",""+u5," ",""+u6," "};
        float c1 = ((cote[0]*ponderation1[0]) + (cote[1]*ponderation1[1]));
        float c2 = ((cote[2]*ponderation1[2]) + (cote[3]*ponderation1[3]));
        float c3 = cote[4]*ponderation1[4];
        float c4 = ((cote[5]*ponderation1[5])+(cote[6]*ponderation1[6]));
        float c5 = ((cote[7]*ponderation1[7])+(cote[8]*ponderation1[8]));
        float c6 = ((cote[9]*ponderation1[9])+(cote[10]*ponderation1[10]));
        
         System.out.println("____________________________________________________________________________________________________________________________________________");
         System.out.println("\tBulletin N° "+fi+"/"+ji );
         System.out.println("NOM, POSTNOM ET PRENOM \t\t\t\t\t:\t"+e.nom+" "+e.Postnom+" "+e.prenom);
         System.out.println("MENTION                \t\t\t\t\t:\t"+e.mention);
         System.out.println("PROMOTION              \t\t\t\t\t:\t"+e.promotion);
         System.out.println("ANNEE ACADEMIQUE       \t\t\t\t\t:\t"+e.academique);
          System.out.println("____________________________________________________________________________________________________________________________________________|");
        System.out.println("____________________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t Semestre I");
        System.out.println("____________________________________________________________________________________________________________________________________________|");
        System.out.println("|"+"code UE|\t"+"Intitulé\t\t\t\t|     Catégorie\t\t| \t CC\t\t|      Crédit\t\t|Cotes pond. ");
        System.out.println("____________________________________________________________________________________________________________________________________________|");
        
            String [] pond = {""+(int)c1," ",""+(int)c2," ",""+(int)c3,""+(int)c4," ",""+(int)c5," ",""+(int)c6," "};
          for(int i = 0; i<semestre1.length;i++){
              
            if( i == 4){
            System.out.println("|"+UE1[i]+"\t|\t"+int1[i]+"\t"+"|\t"+categorie[i]+"\t\t|\t"+ue[i]+"\t\t|\t"+credit[i]+"\t\t|\t"+pond[i]);
            System.out.println("\t|___________________________________________________________________________________________________________________________________|");
            }
            
            
            if (i == 0 || i == 2 || i == 5 || i == 7 || i == 9){
                System.out.println("|"+UE1[i]+"\t|\t"+int1[i]+"\t"+"|\t"+categorie[i]+"\t\t|\t"+ue[i]+"\t\t|\t"+credit[i]+"\t\t|\t"+pond[i]);
                System.out.println("\t|___________________________________________________________________________________________________________________________________|");
                 System.out.println("|"+"\t|\t"+semestre1[i]+"\t\t|"+"\t\t\t|\t"+cote[i]+"\t\t|\t"+ponderation1[i]+"\t\t|");
                 System.out.println("\t|___________________________________________________________________________________________________________________________________|");
            }
            else{
            System.out.println("|"+"\t|\t"+semestre1[i]+"\t\t|"+"\t\t\t|\t"+cote[i]+"\t\t|\t"+ponderation1[i]+"\t\t|");
            System.out.println("____________________________________________________________________________________________________________________________________________|");
        }
          }
        
        System.out.println("TOTAL                           \t\t\t\t\t\t\t\t\t\t    \t|\t"+tot1+"\t    |");
        System.out.println("MOYENNE OBTENUE DE LA CATEGORIE A  \t\t\t\t\t\t\t\t\t\t    \t|\t"+p+"\t    ");
        System.out.println("MOYENNE OBTENUE DE LA CATEGORIE B   \t\t\t\t\t\t\t\t\t\t    \t|\t"+b+"\t    ");
        System.out.println("MOYENNE OBTENUE DU SEMESTRE 1    \t\t\t\t\t\t\t\t\t\t    \t|\t"+l);
        System.out.println("NOMBRE DES CREDITS CAPITALISES SEMESTRE 1  \t\t\t\t\t\t\t\t\t    \t|\t"+cre+"\t    |");
        System.out.println("____________________________________________________________________________________________________________________________________________|");
        
        float a1 = ((note[0]*ponderation2[0]) + (note[1]*ponderation2[1]));
        float a2 = ((note[2]*ponderation2[2]) + (note[3]*ponderation2[3]));
        float a3 = note[4]*ponderation2[4];
        float a4 = ((note[5]*ponderation2[5])+(note[6]*ponderation2[6]));
        float a5 = ((note[7]*ponderation2[7])+(note[8]*ponderation2[8]));
        float a6 = ((note[9]*ponderation2[9])+(note[10]*ponderation2[10]));
       System.out.println("____________________________________________________________________________________________________________________________________________|");
        System.out.println("\t\t\t\t\t\t\t Semestre II");
        System.out.println("____________________________________________________________________________________________________________________________________________|");
        System.out.println("|"+"code UE|\t"+"Intitulé\t\t\t\t|     Catégorie\t\t| \t CC\t\t|      Crédit\t\t|Cotes pond. ");
        System.out.println("____________________________________________________________________________________________________________________________________________|");
        
            String [] pon = {""+(int)a1," ",""+(int)a2," ",""+(int)a3,""+(int)a4," ",""+(int)a5," ",""+(int)a6," "};
          for(int i = 0; i<semestre2.length;i++){
               if( i == 4){
            System.out.println("|"+UE2[i]+"\t|\t"+int2[i]+"\t"+"|\t"+categorie[i]+"\t\t|\t"+U[i]+"\t\t|\t"+credit2[i]+"\t\t|\t"+pon[i]);
            System.out.println("\t|___________________________________________________________________________________________________________________________________|");
            }
            
            
            if (i == 0 || i == 2 || i == 5 || i == 7 || i == 9){
                System.out.println("|"+UE2[i]+"\t|\t"+int2[i]+"\t"+"|\t"+categorie[i]+"\t\t|\t"+U[i]+"\t\t|\t"+credit2[i]+"\t\t|\t"+pon[i]);
                System.out.println("\t|___________________________________________________________________________________________________________________________________|");
                 System.out.println("|"+"\t|\t"+semestre2[i]+"\t\t|"+"\t\t\t|\t"+note[i]+"\t\t|\t"+ponderation2[i]+"\t\t|");
                 System.out.println("\t|___________________________________________________________________________________________________________________________________|");
            }
            else{
            System.out.println("|"+"\t|\t"+semestre2[i]+"\t\t|"+"\t\t\t|\t"+note[i]+"\t\t|\t"+ponderation2[i]+"\t\t|");
            System.out.println("____________________________________________________________________________________________________________________________________________|");
        }
     
          }     
        
        System.out.println("TOTAL                           \t\t\t\t\t\t\t\t\t\t    \t|\t"+tot2+"\t    |");
        System.out.println("MOYENNE OBTENUE DE LA CATEGORIE A  \t\t\t\t\t\t\t\t\t\t    \t|\t"+z+"\t    ");
        System.out.println("MOYENNE OBTENUE DE LA CATEGORIE B   \t\t\t\t\t\t\t\t\t\t    \t|\t"+v+"\t    ");
        System.out.println("MOYENNE OBTENUE DU SEMESTRE 2    \t\t\t\t\t\t\t\t\t\t    \t|\t"+y+"   ");
        System.out.println("NOMBRE DES CREDITS CAPITALISES SEMESTRE 2  \t\t\t\t\t\t\t\t\t    \t|\t"+cr+"\t    |");
     System.out.println("____________________________________________________________________________________________________________________________________________|");
     System.out.println("____________________________________________________________________________________________________________________________________________|");
        System.out.println("\t\t\t\t\t\t\t\t Total Annuel ");
         System.out.println("____________________________________________________________________________________________________________________________________________|");
        
        
        
        float total = tot1+tot2;
    System.out.println("TOTAL                           \t\t\t\t\t\t\t\t\t\t\t\t"+(int)total+"\t    |");
        float u = 0;
       
        for(int j = 0;j<7;j++){
        float w = ((cote[j]*ponderation1[j]) + (note[j]*ponderation2[j]))/45;
        u = u+w;
        }
    System.out.println("MOYENNE ANNUELLE CATEGORIE A       \t\t\t\t\t\t\t\t\t\t\t\t"+u+"\t");
      float q = 0;
       for(int k = 7;k<cote.length;k++){
           float s = ((cote[k]*ponderation1[k])+(note[k]* ponderation2[k]))/15;
           q = q + s;
       }
        
    System.out.println("MOYENNE ANNUELLE CATEGORIE B       \t\t\t\t\t\t\t\t\t\t\t\t"+q+"\t");
     float g = total/60;
    System.out.println("MOYENNE GENERALE DE L'ANNEE        \t\t\t\t\t\t\t\t\t\t\t\t"+g+"\t");
     float credi = cre+cr;
    System.out.println("NOMBRE DES CREDITS CAPITALISE SUR L'ANNEE \t\t\t\t\t\t\t\t\t\t\t"+credi+"\t    |");
  System.out.println("____________________________________________________________________________________________________________________________________________|");
        
     Mention lc = new Mention();
     System.out.print("MENTION \t\t\t\t\t\t\t\t\t\t\t\t\t");
     lc.men(g);
 System.out.println("____________________________________________________________________________________________________________________________________________|");
     Decision lk = new Decision();
     System.out.print("DECISION \t\t\t\t\t\t\t\t\t\t\t\t\t");
     lk.dec(g);
 System.out.println("____________________________________________________________________________________________________________________________________________|");
        
        }
        catch(Exception e){
            System.out.println("erreur de format veuillez ressayer");
        }
     
    }
    
}

