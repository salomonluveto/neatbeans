                    
package bd;
import java.sql.*;
import java.sql.DriverManager;

public class Bd {
 
    private static Connection Db;
   
    public static void main(String[] args) {
     Connection con = new Bd().Connect();
     
    }
     public  Connection Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("pilotes chargés");
           
            
        
                
        
        Db = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","");
            System.out.println("Connexion bien établie");
                   }
          catch(Exception e){
           System.out.println("ERROR :"+e.getMessage());
          } 
        return Db;
    }

   
}
