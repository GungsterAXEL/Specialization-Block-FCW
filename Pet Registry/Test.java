import Terminal.Command.Command;
import Terminal.Command.CommandExecutable.CommandExecute;
import Terminal.Command.CommandParser.CommandParser;
import Terminal.Command.Manual;

import java.util.ArrayList;
import java.util.List;

import Animal.Animal;

public class Test {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        Manual.showManual();
        // Тест парсера.
        CommandParser parser = new CommandParser();
        CommandExecute executable = new CommandExecute(animalList);

        String input = "Add Dog Mike 23.07.1996 Hug, Bug, Tug";
        System.out.println("Ввод:\n" + input);
        System.out.println("Результат:");
        Command command = parser.parseCommand(input);
        executable.execute(command, animalList);
    }
}
