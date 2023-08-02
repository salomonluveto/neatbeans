/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichier;

/**
 *
 * @author salomon luveto
 */
import java.io.*;
import java.util.*;
public class Fichier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File folder = new File("E:dossier1");
        File file = new File("E:li.txt");
        if (!folder.exists()){
            try{
            folder.mkdir();
         
          if (!file.exists()){
           
            file.createNewFile();
            
        }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        else{
            try{
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("don't your chicken before they hatched\n");
            bw.newLine();
            bw.write("better be alone than be with a bad company");
            bw.close();
            writer.close();
            FileReader lire = new FileReader(file);
            BufferedReader lw = new BufferedReader(lire);
         System.out.println(lw.readLine());
         
        }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
