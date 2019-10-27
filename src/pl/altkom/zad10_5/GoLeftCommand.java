package pl.altkom.zad10_5;

public class GoLeftCommand implements Command {

    private int steps;

    public GoLeftCommand(int steps){
        this.steps = steps;
    }

    @Override
    public void execute(RobotOperator robot) {
        int moveX = robot.getX()-steps;
        robot.setX(moveX);
    }

    @Override
    public void undo(RobotOperator robot) {
        int moveX = robot.getX()+steps;
        robot.setX(moveX);
    }
}