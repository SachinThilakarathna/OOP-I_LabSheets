public class PlayerDetails { 
     
public static void main(String[] args) { 
        java.util.Scanner scanner = new java.util.Scanner(System.in);  
        System.out.print("Enter player name: "); 
        String playerName = scanner.nextLine(); 
        System.out.print("Enter player age: "); 
        int playerAge = scanner.nextInt(); 
        scanner.nextLine(); // Consume newline 
        System.out.print("Enter sport: "); 
        String sport = scanner.nextLine();  
        SportDetails player = new SportDetails(playerName, playerAge, sport);  
        System.out.println("\nPlayer Details:"); 
        System.out.println("Player Name: " + player.getPlayerName()); 
        System.out.println("Player Age: " + player.getPlayerAge()); 
        System.out.println("Sport: " + player.getSport());  
        scanner.close(); 
    } 
} 
