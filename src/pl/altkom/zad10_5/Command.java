package pl.altkom.zad10_5;

public interface Command {
    void execute(RobotOperator robot);

    void undo(RobotOperator robot);
}
