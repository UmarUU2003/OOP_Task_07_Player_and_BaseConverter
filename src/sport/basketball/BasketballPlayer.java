package sport.basketball;

import sport.Player;

public class BasketballPlayer extends Player {
    protected int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer, String sportType, int numberPosition,
                            String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
}
