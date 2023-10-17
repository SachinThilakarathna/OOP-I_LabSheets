/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.q8;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L1Q8 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        float num1,num2;
        
        System.out.print("Enter number 1 :");
        num1=input.nextFloat();
        
        System.out.print("Enter number 2 :");
        num2=input.nextFloat();
        
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        
        System.out.println("Enter number 1 :"+num1);
        System.out.println("Enter number 2 :"+num2);
            
    }
    
    
}
