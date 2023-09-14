package Terminal.Command;

public class CommandExit extends Command {
    private final String ACTION = "EXIT";

    public CommandExit(String kind, String argument) {
        super(kind, argument);
    }

    @Override
    public String getACTION() {
        return this.ACTION;
    }

    @Override
    public String toString() {
        return "[ACTION] : " + this.ACTION;
    }
}
