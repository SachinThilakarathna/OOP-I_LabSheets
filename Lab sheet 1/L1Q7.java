/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.q7;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class L1Q7 {
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        double cel,fahr;
        
        System.out.print("Enter the Temperature in Celsius :");
        cel=input.nextDouble();
        
        fahr=(cel*9/5)+32;
        
        System.out.println("Temperature in Fahrenheit :"+fahr);
     
    }
    
}
