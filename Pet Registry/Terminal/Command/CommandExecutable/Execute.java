package Terminal.Command.CommandExecutable;

import Terminal.Command.Command;
import Animal.Animal;

import java.util.List;

public interface Execute<A extends Animal> {
    void execute(Command command, List<A> animals);
}