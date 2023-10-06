package Terminal.Command;

import Animal.Animal;
import Terminal.Command.Interface.Execute;

import java.util.List;

public class CommandExit extends Command implements Execute {
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

    @Override
    public void execute(List<Animal> animals) {
        if (super.getKind() != null) new UnknownCommand().execute(animals);
        else {
            System.out.println("Всего хорошего!");
            System.exit(0);
        }
    }
}
