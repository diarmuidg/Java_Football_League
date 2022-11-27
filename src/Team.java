public class Team {
    private final String name;
    private final String location;
    int points = 0;

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
        points += 3;
    }

    public void addDraw() {
        points += 1;
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
}
