/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.util.Scanner;

/**
 *
 * @author salomon luveto
 */
public class Test {
public static void successeur(String nomsommet){
    Scanner lv = new Scanner(System.in);
System.out.println("nombre des sommets");
    int n = lv.nextInt();
   String sommet[] = new String[n]; 
   for(int i = 0;i<n;i++){
      
     sommet[i]=lv.next();
   }
   System.out.println("liste des sommets saisie");
   for(int i = 0;i<n;i++){
       System.out.print(sommet[i]+"\t");
   }
   System.out.println();
System.out.println("nombre d'arcs");
    int m = lv.nextInt();
    int A [][] = new int [n][m];
    
    int indexsommet =2;
    int nbsuccesseurs = 0; 
    int indexsuccesseurs [];
    for(int i=0;i<n;i++){
        for(int j = 0;j<m;j++){
         int c = lv.nextInt();
           A[i][j] = c;
        }
    }
     for(int i=0;i<n;i++){
         System.out.println();
        for(int j = 0;j<m;j++){
         System.out.print(A[i][j]+"\t");
        }
    }
System.out.println();
                   for(int i=0;i<n;i++){
                       if(sommet[i] == nomsommet){
                           indexsommet = i;
                       }
                    }
                       for(int j=0;j<n;j++){
                           if(A[indexsommet][j] == 1){
                               
                               for(int k=0;k<n;k++){
                                   if(A[k][j] == -1){
                                       nbsuccesseurs += 1;
                                       System.out.println("successuer");
                                       System.out.println(sommet[k]);
                                   }
                               } 
                           }
                       }
                   
                   System.out.println("nombre de successuer");
                   System.out.println(nbsuccesseurs);
                  }
    public static void main(String[] args) {
              try{
                  Scanner lv = new Scanner(System.in);
                  String e = new String();
                  e = lv.nextLine();
                  
                  successeur(e);
                   }
        catch(Exception e){
            System.out.println("Erreur"+e.getMessage());
        }
    }
    
    }
    

