
package ro;

/**
 *
 * @author salomon luveto
 */
import java.util.Scanner;
public class Ro {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner lv = new Scanner(System.in);
        System.out.println("1) Successeur");
        System.out.println("2) Predecesseur");
        System.out.println("3) Voisin");
        System.out.println("4) Demi-degré exterieur");
        System.out.println("5) Demi-degré interieur");
        System.out.println("6) Degré");
        
       int b = lv.nextInt();
       
       if(b==1){
        String sommet[] = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        System.out.println("VEUILLEZ INSERER LE NOMBRE DES SOMMETS");
       
      int  a = lv.nextInt();
      
      System.out.println("INSERER 1 SI LE SOMMET EST LE SUCCESSEUR D'UN N'AUTRE");
      System.out.println();
      int n = 0;
      String h = "";
      int tab[][] = new int[a][a];
        for (int i = 0;i<a;i++){
          for (int j = 0;j<a;j++){
            System.out.println("INSERER UN NOMBRE POUR LE SOMMET "+sommet[i]+" ET LE SOMMET "+sommet[j]);
            int  c = lv.nextInt();
            while(c!=1 && c!=-1 && c!=0){
                System.out.println("Veuillez saisir un nombre entier compris entre -1 et 1");
                c = lv.nextInt();
            }
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
        int nv[] = new int [a];
         for (int i = 0;i<a;i++){
          
          for (int j = 0;j<a;j++){
              
           if(tab[i][j]==1){
               System.out.println(" le successeur de"+sommet[i]+ " est "+sommet[j]);
               System.out.println();
               
               n = n+1;
               nv[i] = n;
               
              
           }
                  }
          n = 0;
        }
          
        
        System.out.println();
       }
       // Predecesseur 
       if(b==2){
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
                        while(c!=1 && c!=-1 && c!=0){
                System.out.println("Veuillez saisir un nombre entier compris entre -1 et 1");
                c = lv.nextInt();
            }
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
       // Voisin
       
       if(b==3){
             String sommet[] = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        System.out.println("VEUILLEZ INSERER LE NOMBRE DES SOMMETS");
      int  a = lv.nextInt();
      int n = 0;
      String h = "";
      int tab[][] = new int[a][a];
        for (int i = 0;i<a;i++){
          for (int j = 0;j<a;j++){
             System.out.println("INSERER UN NOMBRE POUR LE SOMMET "+sommet[i]+" ET LE SOMMET "+sommet[j]);
            int  c = lv.nextInt();
                        while(c!=1 && c!=-1 && c!=0){
                System.out.println("Veuillez saisir un nombre entier compris entre -1 et 1");
                c = lv.nextInt();
            }
            tab[i][j] = c;
            
            
        }
          
        }
        System.out.println();
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
           if(tab[i][j]==1 ||tab[i][j]== -1 ){
               System.out.println(" le voisin de"+sommet[i]+ " est "+sommet[j]);
               System.out.println();
           }
                  }
        }


        
        System.out.println();
       }
       // Demi-degre exterieur
       if(b==4){
                      
         String sommet[] = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        System.out.println("VEUILLEZ INSERER LE NOMBRE DES SOMMETS");
      int  a = lv.nextInt();
      int n = 0;
      String h = "";
      int tab[][] = new int[a][a];
        for (int i = 0;i<a;i++){
          for (int j = 0;j<a;j++){
             System.out.println("INSERER UN NOMBRE POUR LE SOMMET "+sommet[i]+" ET LE SOMMET "+sommet[j]);
            int  c = lv.nextInt();
                        while(c!=1 && c!=-1 && c!=0){
                System.out.println("Veuillez saisir un nombre entier compris entre -1 et 1");
                c = lv.nextInt();
            }
            tab[i][j] = c;
            
            
        }
          
        }
        System.out.println();
        
        for (int i = 0;i<a;i++){
            System.out.println();
          for (int j = 0;j<a;j++){
           System.out.print(tab[i][j]+"\t");
        }
        }
        System.out.println();
        System.out.println();
        int nv[] = new int [a];
         for (int i = 0;i<a;i++){
          
          for (int j = 0;j<a;j++){
              
           if(tab[i][j]==1){
               
               
               n = n+1;
               nv[i] = n;
               
              
           }
                  }
          n = 0;
        }
          for(int i = 0; i<a;i++){
              System.out.println("le demi degre exterieur de "+sommet[i]+" est "+nv[i]);
              System.out.println();
          }

        
        System.out.println();
       }
       // Demi-degre interieur
       if(b==5){
           String sommet[] = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        System.out.println("VEUILLEZ INSERER LE NOMBRE DES SOMMETS");
      int  a = lv.nextInt();

      int n = 0;
      String h = "";
      int tab[][] = new int[a][a];
        for (int i = 0;i<a;i++){
          for (int j = 0;j<a;j++){
            System.out.println("INSERER UN NOMBRE POUR LE SOMMET "+sommet[i]+" ET LE SOMMET "+sommet[j]);
            int  c = lv.nextInt();
                        while(c!=1 && c!=-1 && c!=0){
                System.out.println("Veuillez saisir un nombre entier compris entre -1 et 1");
                c = lv.nextInt();
            }
            tab[i][j] = c;
            
            
        }
          
        }
        System.out.println();
        
        for (int i = 0;i<a;i++){
            System.out.println();
          for (int j = 0;j<a;j++){
           System.out.print(tab[i][j]+"\t");
        }
        }
       System.out.println();
       System.out.println();
        int nv[] = new int [a];
         for (int i = 0;i<a;i++){
          
          for (int j = 0;j<a;j++){
              
           if(tab[i][j]==-1){
               
               
               n = n+1;
               nv[i] = n;
               
              
           }
                  }
          n = 0;
        }
          for(int i = 0; i<a;i++){
              System.out.println("le demi degre interieur de "+sommet[i]+" est "+nv[i]);
              System.out.println();
          }

        
        System.out.println();
       }
       //Degré
       if(b==6){
           String sommet[] = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        System.out.println("VEUILLEZ INSERER LE NOMBRE DES SOMMETS");     
        int  a = lv.nextInt();
      int n = 0;
      String h = "";
      int tab[][] = new int[a][a];
        for (int i = 0;i<a;i++){
          for (int j = 0;j<a;j++){
           System.out.println("INSERER UN NOMBRE POUR LE SOMMET "+sommet[i]+" ET LE SOMMET "+sommet[j]);
            int  c = lv.nextInt();
                        while(c!=1 && c!=-1 && c!=0){
                System.out.println("Veuillez saisir un nombre entier compris entre -1 et 1");
                c = lv.nextInt();
            }
            tab[i][j] = c;
            
            
        }
          
        }
        System.out.println();
        for (int i = 0;i<a;i++){
            System.out.println();
          for (int j = 0;j<a;j++){
           System.out.print(tab[i][j]+"\t");
        }
        }
        System.out.println();
        System.out.println();
        int nv[] = new int [a];
         for (int i = 0;i<a;i++){
          
          for (int j = 0;j<a;j++){
              
           if(tab[i][j]==-1 ||tab[i][j]==1 ){
               
               
               n = n+1;
               nv[i] = n;
               
              
           }
                  }
          n = 0;
        }
          for(int i = 0; i<a;i++){
              System.out.println("le degre de "+sommet[i]+" est "+nv[i]);
              System.out.println();
          }

        
        System.out.println();

       }
        }
        catch(Exception e){
            System.out.println("Erreur de format vauillez insérer un nombre");
        }
    }
    
}
