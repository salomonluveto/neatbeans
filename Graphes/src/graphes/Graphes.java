/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphes;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.util.*;
/**
 *
 * @author salomon luveto
 */
public class Graphes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
                
             Scanner lv = new Scanner(System.in);
            System.out.println("1) Matrice d'incidence sommets - sommets");
            System.out.println("2) Matrice d'incidence sommets - arc");
            System.out.println("3) quitter le programme");
            System.out.println();
            int z = lv.nextInt();
   while(z==1 || z==2){
      if(z ==1){
       
        int t;
        
        System.out.println("veuillez insérer le nombre des sommets");
        int a = lv .nextInt();
        int A[][] = new int [a][a];
      
        String som[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        for(int i = 0;i<a;i++){
            for(int j = 0;j<a;j++){
                System.out.println("les sommets "+som[i]+" et les sommets "+som[j]+" sont reliés par un arc ?");
                System.out.println();
                System.out.println("1)  OUI");
                System.out.println("2)  NON");
                int k = lv.nextInt();
                if(k ==1){
                     t = 1;
                     A[i][j]= t;
                }
                else if(k ==2){
                    t = 0;
                    A[i][j]= t;
                }
               while(k!=1 && k!=2){
                   System.out.println("tapez 1 ou 2");
                   k = lv.nextInt();
               } 
            }
        }
        System.out.println();
        System.out.println("la matrice d'incidence sommets - sommets ");
         System.out.println("_________________________________________");
          System.out.println("");
        for(int i = 0;i<a;i++){
         System.out.println();
            for(int j = 0;j<a;j++){
                               
                System.out.print(A[i][j]+"\t");
            }
        }
      }
       
      
       if(z ==2){
                System.out.println("veuillez insérer le nombre des sommets");
        int a = lv .nextInt();
        int A[][] = new int [a][a];
        System.out.println("veuillez insérer le nombre des arcs");
        int b = lv.nextInt();
        int B[][] = new int [a][b];
        String som[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String arc[]= {"u1","u2","u3","u4","u5","u6","u7","u8","u9","u10","u11","u12","u13","u14","u15","u16","u17","u18","u19","u20","u21","u22","u23","u24","u25","u26"};
         int y;
        for(int q = 0;q<a;q++){
            for(int h = 0;h<b;h++){
                System.out.println("1) le sommet "+som[q]+" est l'extremité initial de l'arc "+arc[h]);
                System.out.println("2) le sommet "+som[q]+" est l'extremité terminal de l'arc "+arc[h]);
                System.out.println("3) le sommet "+som[q]+" est l'arc "+arc[h]+" ne sont pas adjacents");
                System.out.println();
                int m = lv.nextInt();
                if(m == 1){
                    y= +1;
                    B[q][h] = y;
                }
                else if (m == 2){
                    y= -1;
                    B[q][h] = y;
                }
                 else if (m == 3){
                     y = 0;
                    B[q][h] =y;
                }
                while(m!=1 && m!=2 && m!=3){
                    System.out.println("veuillez saisir 1 , 2 ou 3");
                    m = lv.nextInt();
                }
                 
            }
            
        }
         System.out.println("la matrice d'incidence sommets - arcs ");
         System.out.println("_________________________________________");
        for(int k = 0;k<a;k++){
                    System.out.println();
                    for(int p = 0;p<b;p++){
                        System.out.print(B[k][p]+"\t");
                    }
                }
        System.out.println();
     }
  
   System.out.println();
   System.out.println();
   System.out.println("1) Matrice d'incidence sommets - sommets");
            System.out.println("2) Matrice d'incidence sommets - arc");
            System.out.println("3) quitter le programme");
            System.out.println();
            z = lv.nextInt();
   }
   
        }
       
        catch(Exception e){
            System.out.println("Erreur"+e.getMessage());
            
        }
    }
}

