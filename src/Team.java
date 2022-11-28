public class Team implements Comparable<Team> {
    private final String name;
    private final String location;
    int points = 0;

    public int getGoalsScored() {
        return goalsScored;
    }

    int goalsScored = 0;

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        String pointOrPoints = (getPoints() == 1) ? "point" : "points";
        return name + " from " + location + " currently has " + points + " " + pointOrPoints + '.';
    }

    public int getPoints() {
        return points;
    }

    public void addWin() {
        this.points += 3;
    }

    public void addDraw() {
        this.points += 1;
    }

    public void addGoals(int goalsScored) {
        this.goalsScored += goalsScored;
    }

    @Override
    public boolean equals(Object object)
    {
        // We define a team as being equal if they have the same name and location
        boolean sameObj = false;

        if (object instanceof Team)
        {
            sameObj = (this.getName().equals(((Team) object).getName()) &&
                    this.getLocation().equals(((Team) object).getLocation()));
        }

        return sameObj;
    }

    @Override
    public int compareTo(Team teamToCompare) {
        // First check the number of points
        if (teamToCompare.getPoints() > this.getPoints())
            return 1;
        else if (teamToCompare.getPoints() < this.getPoints())
            return -1;

        // If we get here they are equal on points so compare goals scored
        if (teamToCompare.getGoalsScored() > this.getGoalsScored())
            return 1;
        else if (teamToCompare.getGoalsScored() < this.getGoalsScored())
            return -1;

        // Points and goals scored are equal so compare by name, then by location
        int nameCompare = this.getName().compareTo(teamToCompare.getName());

        // If the names are different return the comparison of the names
        if (nameCompare != 0)
            return nameCompare;
        else
            // else return the comparison of the locations
            return this.getLocation().compareTo(teamToCompare.getLocation());
    }
}
