package pl.altkom.zad10_5;

public class RobotOperator {
    private int x;
    private int y;

    public RobotOperator() {
        x = 0;
        y = 0;
    }

    public void doCommand(Command command) {
        command.execute(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
