package Terminal.Commands;

public class Command {
    private String action;
    private String kind;
    private String argument;

    public Command(String action, String kind, String argument) {
        this.action = action;
        this.kind = kind;
        this.argument = argument;
    }

    public String getAction() {
        return action;
    }

    public void setACTION(String action) {
        this.action = action;
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
}
