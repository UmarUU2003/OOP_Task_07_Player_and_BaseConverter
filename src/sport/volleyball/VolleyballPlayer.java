package sport.volleyball;

import sport.Player;

public class VolleyballPlayer extends Player {
    protected int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition,
                            String teamName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}
