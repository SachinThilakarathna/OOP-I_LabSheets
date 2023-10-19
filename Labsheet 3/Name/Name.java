/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;
import java.util.Scanner;
public class Name {
    String fst,snd,trd;
    public void input(){
      Scanner enter=new Scanner(System.in);
      System.out.print("First Name :");
      fst=enter.nextLine();
      System.out.print("Second Name :");
      snd=enter.nextLine();
      System.out.print("Third Name :");
      trd=enter.nextLine();
    }
    
    public void print(){
      System.out.println("Name is :"+fst+" "+snd+" "+trd);
    }
    
    public static void main(String[] args) {
        Name m1=new Name();
        m1.input();
        m1.print();
    }
    
}
