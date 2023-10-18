/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.q9;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class L1Q9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    float weight,height,BMI; 
    
    System.out.println("Enter the weight in (Kg) :");
    weight=input.nextFloat();
    
    System.out.println("Enter the height in (m) :");
    height=input.nextFloat();
    
    BMI=weight/(height*height);
    
    System.out.println("BMI value is :"+BMI);
    
    if(18.5>BMI)
    {
        System.out.println("-Underweight-");
    }else if(18.5<=BMI && 24.9>=BMI)
    {
        System.out.println("-Normal-");
    }else if(25<=BMI && 29.9>=BMI)
    {
        System.out.println("-Overweight-");
    }else if(30<=BMI)
    {
        System.out.println("-Obese-");
    }
    
    }
    
}
