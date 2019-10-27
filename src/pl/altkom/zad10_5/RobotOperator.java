package pl.altkom.zad10_5;

import java.util.Stack;

public class RobotOperator {
    private int x;
    private int y;
    Stack<Command> commandStack;

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

    public RobotOperator() {
        this.x = 0;
        this.y = 0;
        commandStack = new Stack<>();
    }

    public void doCommand(Command command) {
        command.execute(this);
        commandStack.push(command);
    }

    public void undo(){
        Command command = commandStack.pop();
        command.undo(this);
    }

}
