/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.q10;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L1Q10 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int a;
        
        System.out.print("Enter thhe number of rule :");
        a=input.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++){
              System.out.print("*");  
            }
            System.out.println();
            
        }
        
    }
    
}
