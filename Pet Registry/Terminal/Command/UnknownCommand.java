package Terminal.Command;

import Animal.Animal;
import Terminal.Command.Interface.Execute;

import java.util.List;

public class UnknownCommand extends Command implements Execute {
    private final String ACTION = "UNKNOWN COMMAND";

    public UnknownCommand(String kind, String argument) {
        super(kind, argument);
    }

    public UnknownCommand() {
        super(null, null);
    }

    public String getACTION() {
        return this.ACTION;
    }

    @Override
    public String toString() {
        return "[ACTION] : " + this.ACTION;
    }

    @Override
    public void execute(List<Animal> animals) {
        System.out.println("Неизвестная команда!");
    }
}
