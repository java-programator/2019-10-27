package pl.altkom.zad10_5;

public class Client {
    public static void main(String[] args) {
        RobotOperator operator = new RobotOperator();
        Command command = new GoLeftCommand(2);
        operator.doCommand(command);
        operator.doCommand(new GoHorse());
        System.out.println("Pozycja robota po komendzie: " + operator.getX() + " " + operator.getY());
    }
}
