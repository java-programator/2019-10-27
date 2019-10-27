package pl.altkom.zad10_5;

public class GoLeftCommand implements Command {
    int steps;

    public GoLeftCommand(int steps) {
        this.steps = steps;
    }

    @Override
    public void execute(RobotOperator operator) {
        int x = operator.getX();
        x = x - steps;
        operator.setX(x);
    }

    @Override
    public void undo(RobotOperator operator) {
        int x = operator.getX();
        x = x + steps;
        operator.setX(x);
    }
}
