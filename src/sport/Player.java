package sport;

public abstract class Player implements Information{
    protected String nameOfPlayer;
    protected String sportType;
    protected int numberPosition;
    protected String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    @Override
    public void getInfo() {
        System.out.println("-------------------------");
        System.out.println("Information about player:");
        System.out.println("Name: " + nameOfPlayer);
        System.out.println("Position number: " + numberPosition);
        System.out.println("Team name: " + teamName);
        System.out.println("Sport type: " + sportType);
        System.out.println("-------------------------");
    }

    @Override
    public String getTeamName() {
        return teamName;
    }
}
