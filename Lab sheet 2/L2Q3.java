import java.util.Scanner;
public class L2Q3 {
    static int inputn()
    {
        int num;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the number :");
        num=input.nextInt();
        return num;
    }
    static void output(int num)
    {
        int a=num%2;
        String b=(a==0)? "even":"odd";
        System.out.println(b);
    }

    
    public static void main(String args[])
    {
        output(inputn());

    }
}
