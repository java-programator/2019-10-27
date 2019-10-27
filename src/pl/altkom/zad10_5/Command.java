package pl.altkom.zad10_5;

public interface Command {
    void execute(RobotOperator operator);
    void undo(RobotOperator operator);
}
