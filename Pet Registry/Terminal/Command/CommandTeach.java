package Terminal.Command;

public class CommandTeach extends Command {
    private final String ACTION = "TEACH";

    public CommandTeach(String kind, String argument) {
        super(kind, argument);
    }

    @Override
    public String getACTION() {
        return this.ACTION;
    }

}
