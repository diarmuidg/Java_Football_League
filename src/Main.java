public class Main {
    public static void main(String[] args) {

        Team team1 = new Team("Bohs", "Dublin");

        System.out.println(team1);
        team1.addDraw();
        System.out.println(team1);
    }
}