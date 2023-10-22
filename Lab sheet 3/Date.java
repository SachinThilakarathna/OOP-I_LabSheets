/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;
import java.util.Scanner;
public class Date {
    int m,y,d;
    
    public void input(){
       Scanner enter=new Scanner(System.in); 
       System.out.print("Enter Day (1-31) :");
       d=enter.nextInt();
       System.out.print("Enter Month (1-12) :");
       m=enter.nextInt();
       System.out.print("Enter Year :");
       y=enter.nextInt();
    }
    
    public void printFormat1(){
       System.out.println("Method 1 - "+d+"."+m+"."+y);
    }
    public void printFormat2(){
       String a,b;
       
        switch (d) {
        
        case 1:
        case 21:
        case 31:
            a="st";
            break;
        case 2:
        case 22:
            a="nd";
            break;
        case 3:
        case 23:
            a="rd";
            break;
        default:
            a="th";
            break;
        }       
        switch (m){
            case 1:
                b="January";
                break;
            case 2:
                b="February";
                break;
            case 3:
                b="March";
                break;
            case 4:
                b="April";
                break;
            case 5:
                b="May";
                break;
            case 6:
                b="June";
                break;
            case 7:
                b="July";
                break;
            case 8:
                b="August";
                break;
            case 9:
                b="September";
                break;
            case 10:
                b="Octorber";
                break;
            case 11:
                b="November";
                break;
            default :
                b="December";
                break;
                
        } 
        System.out.println("Method 2 -"+d+a+" "+b+" "+y);
    }
    public static void main(String[] args) {
        Date m1=new Date();
        m1.input();
        m1.printFormat1();
        m1.printFormat2();
               
    }
    
}
