import java.util.Scanner;
public class L2Q4{

    static String input2()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word :");
        String verd=input.nextLine();
        return verd;
    }

    static void output(String verd)
    {
        int a=verd.length();//a=length in- word 
        char[] array=new char[a]; 
         
        int j=0; 
        while(j<a-1) 
        { 
            for(int i=a-1;i>=0;i--) 
            { 
                array[i]=verd.charAt(j); 
                j++; 
            } 
        } 
        
        String newword=new String(array); 
        if(newword.equals(verd)) 
            System.out.println("Its reverse string is the same as it is"); 
        else 
            System.out.println("No");       
    } 


    public static void main(String args[])
    {
       output(input2()) ;

    }
}