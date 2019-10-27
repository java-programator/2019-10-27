package pl.altkom.zad10_5;

import java.util.Stack;

public class RobotOperator {
    private int x;
    private int y;
    Stack<Command> commands;

    public RobotOperator() {
        x = 0;
        y = 0;
        commands = new Stack<>();
    }

    public void doCommand(Command command) {
        command.execute(this);
        commands.push(command);
    }

    public void undo() {
        Command command = commands.pop();
        command.undo(this);
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
