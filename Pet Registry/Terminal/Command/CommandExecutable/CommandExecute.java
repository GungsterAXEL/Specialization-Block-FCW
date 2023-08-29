package Terminal.Command.CommandExecutable;

import Terminal.Command.Command;
import Animal.Animal;

import java.util.List;

public class CommandExecute implements Execute {
    private List<Animal> animalList;

    public CommandExecute(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public void execute(Command command, List<Animal> animals) {
        System.out.println(command.getACTION());
    }
}