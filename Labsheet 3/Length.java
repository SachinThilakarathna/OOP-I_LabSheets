/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package length;
import java.util.Scanner;
public class Length {
    float L1,L2,add;
    public void input(){
        Scanner enter=new Scanner(System.in);
        
        System.out.print("Enter Length 1 :");
        L1=enter.nextFloat();
        System.out.print("Enter Length 2 :");
        L2=enter.nextFloat();
    }
    public void add(){
        add=L1+L2;
    }
    public void output(){
        System.out.println("Length 1 + Length 2 = "+add);
    }
    public static void main(String[] args) {
        Length m1=new Length();
        m1.input();
        m1.add();
        m1.output();
    }
    
}
