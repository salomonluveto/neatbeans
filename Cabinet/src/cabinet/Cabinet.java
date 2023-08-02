/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author salomon luveto
 */
public class Cabinet {

    /**
     * @param args the command line arguments
     */
   private static Connection Db;
   
    public static void main(String[] args) {
     Connection con = new Cabinet().Connect();
     
    }
     public  Connection Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("pilotes chargés");
           
            
        
                
        
        Db = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinet","root","");
            System.out.println("Connexion bien établie");
                   }
          catch(Exception e){
           System.out.println("ERROR :"+e.getMessage());
          } 
        return Db;
    }
    
}
