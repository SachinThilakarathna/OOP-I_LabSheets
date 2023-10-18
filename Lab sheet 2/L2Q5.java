import java.util.Scanner;
public class L2Q5 {

    static int inputage()
    {
        int age;
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the age :");
        age=a.nextInt();
        return age;
       
    } 
    static float inputweight()
    {
        float weight;
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the weight :");
        weight=a.nextFloat();
        return weight;

    }
    static void calculate(int age,float weight)
    {
        if(age>=18)
        {
            if(weight>=50)
            {
            System.out.println("You are eligible to donate blood");
            }
            else 
            System.out.println("You are not eligible to donate blood");
        }
        else{
            System.out.println("Age must be greater than 18");
        }


    }


    public static void main(String args[])
    {
       
        calculate( inputage(),inputweight());

    }
    
}
