/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author salomon luveto
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a,b,c,max,min,ppcm,pgcd;
      
         Scanner lv = new Scanner(System.in);
         System.out.println("inserer le premier nombre");
         a = lv.nextInt();
         System.out.println("inserer le premier nombre");
         b = lv.nextInt();
         System.out.println("inserer le premier nombre");
         c = lv.nextInt();
    
         if (a>=b && a>=c)
             max = a;
         else if(b>=c)
             max = b;
         else 
             max = c;
         if (a<b && a<=c)
             min = a;
         else if (b<=c)
             min = b;
         else 
             min = c;
         ppcm = max;
         pgcd = min;
         while (max%a != 0 || max%b != 0 || max%c !=0){
             max++;
         }
         ppcm = max;
         int i;
         for (i = 1; i<=min;i++)
         {
             if(a%i == 0 && b%i==0 && c%i==0 )
             {
                 pgcd = i;
             }
         }
    System.out.println( "le ppcm est " +ppcm);
    System.out.println( "le pgcd est " +pgcd);
    
}
}
