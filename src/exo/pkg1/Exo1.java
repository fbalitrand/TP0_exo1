/*
* Flavie Balitrand
* TDC
* TP0
* 27/09/21
*/
package exo.pkg1;

import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     System.out.println("Bonjour");
     int i;
     
     i=20;
     System.out.println("Au revoir");
    
    
    String prenom;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Bonjour, quel est votre prenom ?");
    prenom = sc.nextLine();
    System.out.println("Bonjour "+ prenom);
    

    }
    
}
