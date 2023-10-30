package sport.basketball;

public class PointGuard extends BasketballPlayer{
    private int countOfGuard;

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition,
                      String teamName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }

    public void setCountOfGuard(int countOfGuard) {
        this.countOfGuard = countOfGuard;
    }
}
