import java.util.Scanner;
public class PlayerDetails {
    private String name;
    private int age;
    private String sport; 
     
    
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        PlayerDetails op1=new PlayerDetails();

        System.out.print("Enter player Name : ");
        op1.name=input.nextLine();
        System.out.print("Enter player Sport : ");
        op1.sport=input.nextLine();        
        System.out.print("Enter player Age : ");
        op1.age=input.nextInt();

        System.out.println();
        


        SportDetails op=new SportDetails(op1.name, op1.age, op1.sport);
        System.out.println(op.toString());
        


    } 
} 
