package pl.altkom.zad10_5;

public class Main {

    public static void main(String[] args) {
        RobotOperator robot = new RobotOperator();
        Command command = new GoLeftCommand(2);
        robot.doCommand(command);
        System.out.println(robot.getX() + " " + robot.getY());

        RobotOperator robot2 = new RobotOperator();
        Command command2 = new GoSkoczekCommand();
        robot2.doCommand(command2);
        System.out.println(robot2.getX() + " " + robot2.getY());
    }
}
