public class SportDetails {  
    private String playerName; 
    private int playerAge; 
    private String sport;  
    public SportDetails(String playerName, int playerAge, String sport) { 
        setPlayerName(playerName); 
        setPlayerAge(playerAge); 
        setSport(sport); 
    }  
    public String getPlayerName() { 
        return playerName; 
    }  
    public void setPlayerName(String playerName) { 
        if (playerName != null) { 
            this.playerName = playerName; 
        } else { 
            System.out.println("Invalid player name. Player name should not be null."); 
        } 
    } 
 
    public int getPlayerAge() { 
        return playerAge; 
    }  
    public void setPlayerAge(int playerAge) { 
        if (playerAge >= 10 && playerAge <= 50) { 
            this.playerAge = playerAge; 
        } else { 
            System.out.println("Invalid player age. Age should be between 10 and 50 years."); 
        } 
    }  
    public String getSport() { 
        return sport; 
    }  
    public void setSport(String sport) { 
        if (sport != null) { 
            this.sport = sport; 
        } else { 
            System.out.println("Invalid sport. Sport should not be null."); 
        } 
    } 
}  