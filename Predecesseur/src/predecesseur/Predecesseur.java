/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predecesseur;

import java.util.Scanner;

/**
 *
 * @author salomon luveto
 */
public class Predecesseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner lv = new Scanner(System.in);
         String sommet[] = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        System.out.println("VEUILLEZ INSERER LE NOMBRE DES SOMMETS");
      int  a = lv.nextInt();
      System.out.println("INSERER -1 SI LE SOMMET EST LE PREDECESSEUR D'UN N'AUTRE");
      System.out.println();

      int n = 0;
      String h = "";
      int tab[][] = new int[a][a];
        for (int i = 0;i<a;i++){
          for (int j = 0;j<a;j++){
             System.out.println("INSERER UN NOMBRE POUR LE SOMMET "+sommet[i]+" ET LE SOMMET "+sommet[j]);
            int  c = lv.nextInt();
            tab[i][j] = c;
            
            
        }
          
        }
        
        for (int i = 0;i<a;i++){
            System.out.println();
          for (int j = 0;j<a;j++){
           System.out.print(tab[i][j]+"\t");
        }
        }
        System.out.println();
         System.out.println();
      
         for (int i = 0;i<a;i++){
          
          for (int j = 0;j<a;j++){
           if(tab[i][j]==-1){
               System.out.println(" le predecesseur de"+sommet[i]+ " est "+sommet[j]);
                System.out.println();
               
           }
                  }
        }


        
        System.out.println();
    }
    
}
