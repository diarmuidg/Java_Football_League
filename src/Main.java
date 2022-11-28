public class Main {
    public static void main(String[] args) {

        // Create the teams
        League leagueOne = new League();
        Team teamA = new Team("Team A", "TeamALocation");
        Team teamB = new Team("Team B", "TeamBLocation");
        Team teamC = new Team("Team C", "TeamCLocation");
        Team teamD = new Team("Team D", "TeamDLocation");

        leagueOne.addTeam(teamA);
        leagueOne.addTeam(teamB);
        leagueOne.addTeam(teamC);
        leagueOne.addTeam(teamD);

        System.out.println("Status at start of the season");
        System.out.println(leagueOne.orderedToString());

        //Week One AxB, Cxd
        // Add fixture one, a home win
        Score scoreOne = new Score(1, 0);
        Game gameOne = new Game(teamA, teamB, scoreOne);
        leagueOne.addGame(gameOne);

        // Add fixture two, a draw
        Score scoreTwo = new Score(1, 1);
        Game gameTwo = new Game(teamC, teamD, scoreTwo);
        leagueOne.addGame(gameTwo);

        System.out.println("Status after week 1");
        System.out.println(leagueOne.orderedToString());

        //Week Two CxA, DxB
        // Add fixture three, an away win
        Score scoreThree = new Score(0, 3);
        Game gameThree = new Game(teamC, teamA, scoreThree);
        leagueOne.addGame(gameThree);

        // Add fixture four, a home win
        Score scoreFour = new Score(1, 0);
        Game gameFour = new Game(teamD, teamB, scoreFour);
        leagueOne.addGame(gameFour);

        System.out.println("Status after week 2");
        System.out.println(leagueOne.orderedToString());

        //Week Two AxD, BxC
        // Add fixture Five, an home win
        Score scoreFive = new Score(5, 1);
        Game gameFive = new Game(teamA, teamD, scoreFive);
        leagueOne.addGame(gameFive);

        // Add fixture Six, an away win
        Score scoreSix = new Score(1, 3);
        Game gameSix = new Game(teamB, teamC, scoreSix);
        leagueOne.addGame(gameSix);

        System.out.println("Status after week 3");
        System.out.println(leagueOne.orderedToString());

    }
}