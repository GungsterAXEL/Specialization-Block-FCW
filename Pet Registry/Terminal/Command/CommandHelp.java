package Terminal.Command;

import java.util.List;

public class CommandHelp extends Command {
    private final String ACTION = "HELP";

    public CommandHelp(String kind, String argument) {
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

    @Override
    public void execute(Command command, List animals) {
        Manual.showManual();
    }
}