
package soccer;


public class Game {


 
      public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame(int maxGoals) {
        /* Practice 8-2. Add code to initialize the array currGame.goals to a random size */
        int numberOfGoals = (int)(Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        //GameUtils.addGameGoals(this);        
    }
    
    public void playGame() {
        playGame(6);
    }
    
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after ").append(currGoal.theTime).append(" mins by ").append(currGoal.thePlayer.playerName).append(" of ").append(currGoal.theTeam.teamName).append("\n");
        }
        return returnString.toString();
    }
    
}
