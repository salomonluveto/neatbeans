/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

/**
 *
 * @author salomon luveto
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static int pgcd(int b,int c){
        int pgcd = 0;
        for(int i=1;i<=c;i++){
            if(c%i==0 && b%i==0){
                 pgcd = i;
                
            }
        }
       return pgcd; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10856;
        int a = 0;
        for(int i = 1;i<10856;i++){
            if(pgcd(10856,i)==1){
                a = a+1;
                System.out.println(i);
               
                
                
            }
        }
        System.out.println("nombre est");
        System.out.println(a);
    }
    
}
