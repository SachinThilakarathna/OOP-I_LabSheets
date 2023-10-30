import java.util.Scanner;
public class BMICalculate {
    private int age;
    private float weight;
    private float height;


    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        BMICalculate op1=new BMICalculate();

        System.out.print("Enter Age : ");
        op1.age=input.nextInt();

        System.out.print("Enter Weight(kg) : ");
        op1.weight=input.nextFloat();

        System.out.print("Enter Height(m) : ");
        op1.height=input.nextFloat();
        System.out.println();

        Person op2=new Person(op1.age,op1.weight,op1.height);
        System.out.println(op2.toString());
        op2.BMI();



    }
    
}
