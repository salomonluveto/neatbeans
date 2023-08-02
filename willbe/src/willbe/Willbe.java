/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willbe;

import java.util.Scanner;

/**
 *
 * @author salomon luveto
 */
public class Willbe {

    /**
     * @param args the comman67d line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
         int d,age;
        Scanner lv = new Scanner(System.in);
        d = lv.nextInt();
        age = lv.nextInt();
        try{
        d = Integer.parseInt(args[0]);
        age = 100/d;
        
    }
        catch(NumberFormatException a ){
            System.out.println("un nombre entier svp");
        }
        catch(ArithmeticException e){
            System.out.println("partir vers l'infini");
        }
        finally{
            System.out.println("passage obligé");
        }
    }
    
}
