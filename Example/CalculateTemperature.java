/**
 * example
 */
import java.util.Scanner;
public class CalculateTemperature {
    static float input()
    {
        Scanner input=new Scanner(System.in);
        float tem;
        System.out.print("Enter the Value in Celsius :");
        tem=input.nextFloat();
        return tem;

    }
    static float calculate(float tem)
    {
        float fah;
        fah=(tem*9/5)+32;
        return fah;
    }

    static void output(float fah)
    {
        System.out.println("Temperature is :"+fah);
    }
    
    public static void main(String args[])
    {
        
        
        output(calculate(input()));
        
    }

    
}