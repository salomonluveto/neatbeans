package delibiration;
import java.util.*;
public class Delibiration {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nm = new String();
        String ps= new String();
        String pr = new String();
        Scanner clavier = new Scanner(System.in);
        System.out.print("nom    \t\t\t:\t");
        nm = clavier.nextLine();
        System.out.print("postnom\t\t\t:\t");
        ps = clavier.nextLine();
        System.out.print("prenom \t\t\t:\t");
        pr = clavier.nextLine();
        System.out.println("MENTION          \t:      "+"INFORMATIQUE,STATISTIQUE ET MATHEMATIQUES");
        System.out.println("PROMOTION        \t:      "+"PREMIER LICENCE LMD");
        System.out.println("ANNEE ACADEMIQUE \t:      "+"2019 - 2020");
        System.out.println();
        float[] cote = new float[11];
        
        String[] semestre1 = { "Calculus                  ","Analyse infinitesimale    ","Structure Algebrique      ","Logique Mathématique      ","Statistique Descriptive   ","informatique générale     ","Algorithmique             ","Logique formelle et EOE    ","Anglais                   ","Electricité               ","Mecanique                 "};
        int[] ponderation1 = {1,4,3,3,3,3,3,2,2,3,3};
        int pon1,pon2,pon3,pon4,pon5,pon6;
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\tSemestre 1");
        System.out.println("_____________________________________________________________________________________________________________");
        for(int i = 0; i<semestre1.length;i++){  
            System.out.print(semestre1[i]+"\t\t\t");
            float tab = clavier.nextFloat();
            while(tab>21 || tab<0){
                System.out.print("ecrire un nombre <= 20 et >= 0\t\t");
                tab = clavier.nextFloat();
            }   
            System.out.println("_____________________________________________________________________________________________________________");
            cote[i] = tab;   
        }
        float tot1 = (cote[0]*ponderation1[0])+ (cote[1]*ponderation1[1])+ (cote[2]*ponderation1[2])+ (cote[3]*ponderation1[3])+ (cote[4]*ponderation1[4])+ (cote[5]*ponderation1[5])+ (cote[6]*ponderation1[6])+(cote[7]*ponderation1[7])+ (cote[8]*ponderation1[8])+ (cote[9]*ponderation1[9])+ (cote[10]*ponderation1[10]);    
        System.out.println("TOTAL                           \t\t:\t"+tot1);
        float lit = 0;
        for(int j = 0;j<7;j++){
        float y = (cote[j]*ponderation1[j])/20;
        lit = lit+y;
        }
        System.out.println("MOYENNE OBTENUE DE LA CATEGORIE A  \t\t:\t"+lit);
      float ciy = 0;
       for(int k = 7;k<cote.length;k++){
           float mi = (cote[k]* ponderation1[k])/10;
           ciy = ciy + mi;
       }  
     System.out.println("MOYENNE OBTENUE DE LA CATEGORIE B   \t\t:\t"+ciy);
     float l = 0;
     for(int h =0;h<semestre1.length;h++){
         float nj = (cote[h]* ponderation1[h])/30;
         l = l+nj;
     }
        System.out.println("MOYENNE OBTENUE DU SEMESTRE 1    \t\t:\t"+l);
        float ue1 = ((cote[0]*ponderation1[0]) + (cote[1]*ponderation1[1]))/5;
        float ue2 = ((cote[2]*ponderation1[2]) + (cote[3]*ponderation1[3]))/6;
        float ue3 = cote[4];
        float ue4 = ((cote[5]*ponderation1[5])+(cote[6]*ponderation1[6]))/6;
        float ue5 = ((cote[7]*ponderation1[7])+(cote[8]*ponderation1[8]))/4;
        float ue6 = ((cote[9]*ponderation1[9])+(cote[10]*ponderation1[10]))/6;
        if(ue1 >= 10)
            pon1 = ponderation1[0] + ponderation1[1];
        else
            pon1 = 0;
        if(ue2 >= 10)
            pon2 = ponderation1[2] + ponderation1[3];
        else
            pon2= 0;
        if(ue3>=10)
            pon3 = ponderation1[4];
        else
            pon3 = 0;
        if(ue4>=10)
            pon4 = ponderation1[5] + ponderation1[6];
        else
            pon4 = 0;
        if (ue5>=10)
            pon5 = ponderation1[7] + ponderation1[8];
        else pon5 = 0;
        if(ue6>=10)
            pon6 = ponderation1[9] + ponderation1[10];
        else 
            pon6 = 0;
        if(lit>=10){
            pon1 = 5;
            pon2 = 6;
            pon3 = 3;
            pon4 = 6;
        }
        if(ciy>=10){
            pon5 = 4;
            pon6 = 6;
        }    
        int cre = pon1+pon2+pon3+pon4+pon5+pon6;
        System.out.println("NOMBRE DES CREDITS CAPITALISES SEMESTRE 1  \t:\t"+cre);
        System.out.println();
        System.out.println();
        System.out.println();
                 
        float[] note = new float[11];
        String[] semestre2 = {"Algèbre linéaire          ","géométrie affine          ","Logiciels d'application   ","Langage c                 ","Analyse Math2             ","Théorie de Probabilité    ","Statistique Inferentielle ","Interface Maths           ","Economie politique        ","Education à la citoyenneté","Psychologie               "};
        int[] ponderation2 = {4,4,3,3,3,4,4,1,2,1,1};
        int pond1,pond2,pond3,pond4,pond5,pond6;
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\tSemestre 2");
        System.out.println("_____________________________________________________________________________________________________________");
        
     for(int i = 0; i<semestre2.length;i++){
            
            System.out.print(semestre2[i]+"\t\t\t");
            float a = clavier.nextFloat();
            while(a>21 || a<0){
                System.out.print("ecrire un nombre <= 20 et >=0\t\t");
                a = clavier.nextFloat();
            }
            System.out.println("_____________________________________________________________________________________________________________");
            note[i] = a;
        }
    
     float tot2 = (note[0]*ponderation2[0])+ (note[1]*ponderation2[1])+ (note[2]*ponderation2[2])+ (note[3]*ponderation2[3])+ (note[4]*ponderation2[4])+ (note[5]*ponderation2[5])+ (note[6]*ponderation2[6])+(note[7]*ponderation2[7])+ (note[8]*ponderation2[8])+ (note[9]*ponderation2[9])+ (note[10]*ponderation2[10]);
    System.out.println("TOTAL                              \t\t:\t "+tot2);
        float z = 0;
        
        for(int j = 0;j<7;j++){
        float x = (note[j]*ponderation2[j])/25;
        z = z+x;
        }
    System.out.println("MOYENNE OBTENUE DE LA CATEGORIE A   \t\t:\t "+z);
       
      float v = 0;
       for(int k = 7;k<cote.length;k++){
           float d = (note[k]* ponderation2[k])/5;
           v = v + d;
       }
        
    System.out.println("MOYENNE OBETENUE DE LA CATEGORIE B   \t\t:\t "+v);
     
     float y = 0;
     for(int h =0;h<semestre1.length;h++){
         float c = (note[h]* ponderation2[h])/30;
         y = y+c;
     }
        System.out.println("MOYENNE OBTENUE DU SEMESTRE 2     \t\t:\t "+y);

        float u1 = ((note[0]*ponderation2[0]) + (note[1]*ponderation2[1]))/8;
        float u2 = ((note[2]*ponderation2[2]) + (note[3]*ponderation2[3]))/6;
        float u3 = note[4];
        float u4 = ((note[5]*ponderation2[5])+(note[6]*ponderation2[6]))/8;
        float u5 = ((note[7]*ponderation2[7])+(note[8]*ponderation2[8]))/3;
        float u6 = ((note[9]*ponderation2[9])+(note[10]*ponderation2[10]))/2;
        if(u1 >= 10)
            pond1 = ponderation2[0] + ponderation2[1];
        else
            pond1 = 0;
        if(u2 >= 10)
            pond2 = ponderation2[2] + ponderation2[3];
        else
            pond2= 0;
        if(u3>=10)
            pond3 = ponderation2[4];
        else
            pond3 = 0;
        if(u4>=10)
            pond4 = ponderation2[5] + ponderation2[6];
        else
            pond4 = 0;
        if (u5>=10)
            pond5 = ponderation2[7] + ponderation2[8];
        else pond5 = 0;
        if(u6>=10)
            pond6 = ponderation2[9] + ponderation2[10];
        else 
            pond6 = 0;
        if(z>=10){
            pond1 = 8;
            pond2 = 6;
            pond3= 3;
            pond4 = 8;
        }
        if(v>=10){
            pond5 = 3;
            pond6 = 2;
        }
        int cr = pond1+pond2+pond3+pond4+pond5+pond6;
        System.out.println("NOMBRE DES CREDITS CAPITALISES SEMESTRE 2 \t:\t "+cr);
        System.out.println();
        System.out.println();
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t Total Annuel ");
        System.out.println("_____________________________________________________________________________________________________________");
        
        
        float total = tot1+tot2;
    System.out.println(" TOTAL                           \t\t:\t"+total);
        float u = 0;
       
        for(int j = 0;j<7;j++){
        float w = ((cote[j]*ponderation1[j]) + (note[j]*ponderation2[j]))/45;
        u = u+w;
        }
    System.out.println("MOYENNE ANNUELLE CATEGORIE A       \t\t:\t"+u);
      float q = 0;
       for(int k = 7;k<cote.length;k++){
           float s = ((cote[k]*ponderation1[k])+(note[k]* ponderation2[k]))/15;
           q = q + s;
       }
        
    System.out.println("MOYENNE ANNUELLE CATEGORIE B       \t\t:\t"+q);
     float g = total/60;
    System.out.println("MOYENNE GENERALE DE L'ANNEE        \t\t:\t"+g);
     float credit = cre+cr;
    System.out.println("NOMBRE DES CREDITS CAPITALISE SUR L'ANNEE \t:\t"+credit);
    System.out.println("_____________________________________________________________________________________________________________");
   System.out.print("MENTION \t\t:\t");
    if(g<8)
        System.out.println("INSIGNIFIANT");
    else if(g<10 && g>8)
        System.out.println("INSUFFISANT");
    else if(g<12 && g>10)
        System.out.println("PASSABLE");
    else if(g<14 && g>12)
        System.out.println("ASSEZ-BIEN");
    else if(g<16 && g>14)
        System.out.println("BIEN");
    else if(g<18 && g>16)
        System.out.println("TRES BIEN");
    else if (g<=20 && g>18)
        System.out.println("EXCELLENT");
 
     System.out.println("_____________________________________________________________________________________________________________");
     Decision des = new Decision();
     System.out.print("DECISION \t\t:\t");
     des.dec(g);
    System.out.println("_____________________________________________________________________________________________________________");
        
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
