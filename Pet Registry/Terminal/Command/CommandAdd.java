package Terminal.Command;

public class CommandAdd extends Command {
    private final String ACTION = "ADD";

    public CommandAdd(String kind, String argument) {
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