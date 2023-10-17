/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.q4;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,add;
        int age;
        
        System.out.print("Name :");
        name=input.nextLine();
                                             //print nisa line eka pallehata enne na
        System.out.print("Address :");
        add=input.nextLine();
          
        System.out.println("Age :");//line eka enne pallehata println nisa
        age=input.nextInt();
        
        System.out.println("\n"+name+"\n"+age+"\n"+add+"\n");
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
