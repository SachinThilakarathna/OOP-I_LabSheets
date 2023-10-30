public class SportDetails {  
    private String playerName;
    private int playerAge;
    private String sport;

    public SportDetails(String name,int age,String sport){
        setPlayerName(name);
        setPlayerAge(age);
        setSport(sport);
    }

    public void setPlayerName(String playerName) {
        if(playerName != null){
            this.playerName=playerName;
        }
        else{
            System.out.println("Invalid player name, player name should be not null");
        }
    }

    public void setPlayerAge(int playerAge){
        if(playerAge>10 && playerAge<50){
            this.playerAge=playerAge;
        }
        else
        {
            System.out.println("Invalid player Age, player Age should be 10-50 years");
        }
    }

    public void setSport(String sport){
        if(sport != null){
            this.sport=sport;
        }
        else{
            System.out.println("Invalid player Sport, player sport should be not null");
        }       
    }

    public int getPlayerAge() {
        return playerAge;
    }
    public String getPlayerName(){
        return playerName;
    }
    public String getSport(){
        return sport;
    }

    public String toString(){
        return String.format("Player name : %s\nPlayer Age : %d\nPlayer Sport : %s\n",getPlayerName(),getPlayerAge(),getSport());
    }

}  