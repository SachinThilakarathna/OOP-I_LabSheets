
import java.util.Scanner;
public class L2Q6 {

    static int inputlevel(){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Ënter the Level :");
        num=input.nextInt();
        
        return num;
    }
    static void output(int num)
    {
        switch (num)
        {
            case 1:
                System.out.println("Java Programming for Complete Beginners");
                break;
            case 2:
                System.out.println("Java Programming and Software Engineering Fundamentals");
                break;
            case 3:
                System.out.println("Object-Oriented Programming in Java Specialization");
                break;
            case 4:
                System.out.println("The Complete Java Development Bootcamp");
                break;
            case 5:
                System.out.println("Java Programming Masterclass covering Java 17");
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Level\tRelated course name");
        System.out.println("1\tJava Programming for Complete Beginners");
        System.out.println("2\tJava Programming and Software Engineering Fundamentals");
        System.out.println("3\tObject-Oriented Programming in Java Specialization");
        System.out.println("4\tThe Complete Java Development Bootcamp");
        System.out.println("5\tJava Programming Masterclass covering Java 17\n");
        
        output(inputlevel());
       
    }
}

