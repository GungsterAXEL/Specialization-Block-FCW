package Terminal.Command;

public class UnknownCommand extends Command {
    private final String ACTION = "UNKNOWN COMMAND";

    public UnknownCommand(String kind, String argument) {
        super(kind, argument);
    }

    public String getACTION() {
        return this.ACTION;
    }

    @Override
    public String toString() {
        return "[ACTION] : " + this.ACTION;
    }
}
