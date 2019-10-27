package pl.altkom.zad10_5;

public class RobotOperator {
    private int x;
    private int y;

    public void doCommand(Command command) {
        command.execute();
    }

}
