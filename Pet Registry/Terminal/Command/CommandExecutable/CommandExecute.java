package Terminal.Command.CommandExecutable;

import Terminal.Command.*;
import Animal.Animal;
import Animal.AnimalUtils.*;

import java.util.List;

public class CommandExecute implements Execute {
    private List<Animal> animalList;

    public CommandExecute(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public void execute(Command command, List<Animal> animals) {
        System.out.println("Выполняю команду...");
        if (command instanceof CommandExit && command.getKind() == null) {
            System.out.println("Пока-пока!");
            System.exit(0);
        } else if (command instanceof CommandHelp && command.getKind() == null) Manual.showManual();
        else if (command instanceof CommandShow) {
            System.out.println("Команда SHOW.");
        } else if (command instanceof CommandAdd) {
            System.out.println("Команда ADD");
        } else if (command instanceof CommandTeach) {
            System.out.println("Команда TEACH");
        } else System.out.println("Неизвестная команда.");
    }
}