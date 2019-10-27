package pl.altkom.zad10_5;

public class GoSkoczekCommand implements Command{

    private int stepsX = 1;
    private int stepsY = 2;

    public GoSkoczekCommand() {
    }

    @Override
    public void execute(RobotOperator robot) {
        int x = robot.getX();
        int y = robot.getY();

        x = x + stepsX;
        y = y + stepsY;

        robot.setX(x);
        robot.setY(y);
    }

    @Override
    public void undo(RobotOperator robot) {
        int x = robot.getX();
        int y = robot.getY();

        x = x - stepsX;
        y = y - stepsY;

        robot.setX(x);
        robot.setY(y);
    }
}
