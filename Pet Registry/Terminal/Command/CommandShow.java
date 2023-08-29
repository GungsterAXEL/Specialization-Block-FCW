package Terminal.Command;

public class CommandShow extends Command {
    private final String ACTION = "SHOW";

    public CommandShow(String kind, String argument) {
        super(kind, argument);
    }

    @Override
    public String getACTION() {
        return this.ACTION;
    }

}
