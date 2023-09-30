package Terminal.Command;

import Terminal.Command.Interface.Execute;

import java.util.List;

public class CommandHelp extends Command implements Execute {
    private static final String ACTION = "HELP";

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
    public void execute(List animals) {
        if (super.getKind() != null) System.out.println("Неизвестная команда!");
        else Manual.showManual();
    }
}