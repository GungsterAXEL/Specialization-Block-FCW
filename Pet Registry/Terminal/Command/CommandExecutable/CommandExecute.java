package Terminal.Command.CommandExecutable;

import Animal.AnimalUtils.AnimalUtils;
import Terminal.Command.*;
import Animal.Animal;

import java.util.List;

public class CommandExecute<A extends Animal> implements Execute {
    private List<A> animalList;

    public CommandExecute(List<A> animalList) {
        this.animalList = animalList;
    }

    @Override
    public void execute(Command command, List animals) {
        System.out.println("Выполняю команду...");
        AnimalUtils animalUtils = new AnimalUtils();
        if (command instanceof CommandExit && command.getKind() == null) {
            System.out.println("Пока-пока!");
            System.exit(0);
        } else if (command instanceof CommandHelp && command.getKind() == null) Manual.showManual();
        else if (command instanceof CommandShow) {
            System.out.println("Команда SHOW.");
            String request = command.getKind();
            animalUtils.tableMaker(request, animals);
        } else if (command instanceof CommandAdd) {
            System.out.println("Команда ADD");
        } else if (command instanceof CommandTeach) {
            System.out.println("Команда TEACH");
        } else System.out.println("Неизвестная команда.");
    }
}