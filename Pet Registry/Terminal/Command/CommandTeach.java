package Terminal.Command;

import java.util.List;

public class CommandTeach extends Command {
    private final String ACTION = "TEACH";

    public CommandTeach(String kind, String argument) {
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
