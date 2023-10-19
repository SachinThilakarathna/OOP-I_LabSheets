public class Stock {
    String symbol;
    String name;
    double previousClosingPrice; 
    double currentPrice; 
    static double precentage ; 


    public double getChangePercent(){  
        precentage = (currentPrice - previousClosingPrice)/previousClosingPrice *100.d; 
        return precentage; 
     } 

     public static void main(String[] args){ 
        Stock s1 = new Stock();  
        s1.name="Oracale Corporation" ; 
        s1.symbol="ORCL"; 
        s1.previousClosingPrice=34.5; 
        s1.currentPrice=34.35;  
        s1.getChangePercent();  
        System.out.println("price-change precentage is "+precentage);

    }
}