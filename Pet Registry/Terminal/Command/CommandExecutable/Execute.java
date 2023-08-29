package Terminal.Command.CommandExecutable;

import Terminal.Command.Command;
import Animal.Animal;

import java.util.List;

public interface Execute {
    void execute(Command command, List<Animal> animals);
}