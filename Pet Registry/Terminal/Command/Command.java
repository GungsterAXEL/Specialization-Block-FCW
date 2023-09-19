package Terminal.Command;

import Terminal.Command.Interface.Execute;

public abstract class Command implements Execute {
    private static final String ACTION = "COMMAND";
    private String kind;
    private String argument;

    public Command(String kind, String argument) {
        this.kind = kind;
        this.argument = argument;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public abstract String getACTION();

    public abstract String toString();
}
