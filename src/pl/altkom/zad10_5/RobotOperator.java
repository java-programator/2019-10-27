package pl.altkom.zad10_5;

public class RobotOperator {
    private int x;
    private int y;

    RobotOperator(){
        int x = 0;
        int y = 0;
    }

    public void doCommand(Command command) {
        command.execute();
    }

}
