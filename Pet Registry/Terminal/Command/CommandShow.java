package Terminal.Command;

import java.util.List;

public class CommandShow extends Command {
    private final static String ACTION = "SHOW";

    public CommandShow(String kind, String argument) {
        super(kind, argument);
    }

    @Override
    public String getACTION() {
        return this.ACTION;
    }

    @Override
    public String toString() {
        return "[ACTION] : " + this.ACTION + " [KIND] : " + super.getKind() + " [ARGUMENT] : " + super.getArgument();
    }

    @Override
    public void execute(Command command, List animals) {

    }
}
