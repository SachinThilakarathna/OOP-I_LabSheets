import java.util.Scanner;
public class L2Q8 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float total=0,average;                 
        
        float[] tem=new float[7];
        
        for(int i=0;i<7;i++)
        {
            System.out.print("Enter the temperature in day "+(i+1)+":");
            tem[i]=input.nextFloat();
        }
        for(int i=0;i<7;i++)
        {
            total=total+tem[i];
        }
        average=total/7;
        
        System.out.println("The week’s average temperature :"+average);
        
    }
}
