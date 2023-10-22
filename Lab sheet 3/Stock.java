
/**
 * Stock
 */
import java.util.Scanner;
public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    

    Stock(){
        this.symbol="ORCL";
        this.name="Oracle Corporation";
        System.out.println(symbol+" "+name);
    }

    public void getChangePercent(){
        System.out.println("Price-change percentage is :"+(currentPrice - previousClosingPrice)/previousClosingPrice*100.d);
    }

    public static void main(String[] args) {

        Stock num=new Stock();
        

        num.previousClosingPrice=34.5;
        num.currentPrice=34.35;
        num.getChangePercent();
        System.out.println(" ");
    }
}