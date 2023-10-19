/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
public class Student {
    static String name;
    static Float mark;
    
    public static void input(){
        Scanner enter=new Scanner(System.in);
        
        System.out.print("Enter the name :");
        name=enter.nextLine();
        System.out.print("Enter mark :");
        mark=enter.nextFloat();
        
       // st.output();
    }
    
    static void output(){
        System.out.println("Name is "+name+" Mark is "+mark);
    }
    
    public static void main(String[] args) {
        Student st=new Student();
        st.input();
        st.output();
    }
    
}
