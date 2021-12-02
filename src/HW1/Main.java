package HW1;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Roma",12);
        Player player2 = new Player("Vova",13);
        Player player3 = new Player("Vlad",10);
        Player player4 = new Player("Dima",11);
        Team team = new Team(player1, player2, player3, player4);
        Course course = new Course();


    }
}
