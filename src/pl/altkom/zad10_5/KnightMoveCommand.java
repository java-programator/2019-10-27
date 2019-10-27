package pl.altkom.zad10_5;

public class KnightMoveCommand implements Command {
    @Override
    public void execute(RobotOperator operator) {
        int x = operator.getX();
        int y = operator.getY();
        x = x + 1;
        y = y + 2;
        operator.setX(x);
        operator.setY(y);
    }

    @Override
    public void undo(RobotOperator operator) {
        int x = operator.getX();
        int y = operator.getY();
        x = x - 1;
        y = y - 2;
        operator.setX(x);
        operator.setY(y);
    }
}
