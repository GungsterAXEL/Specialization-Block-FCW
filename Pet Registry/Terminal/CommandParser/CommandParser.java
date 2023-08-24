package Terminal.CommandParser;

import Terminal.Commands.Command;

import java.util.List;

public class CommandParser {
    public Command parseCommand(String input) {
        List<String> commandParts = List.of(input.split(" ", 3));
        String action = commandParts.get(0);
        String type = commandParts.get(1);
        String argument = commandParts.get(2);

        System.out.println("Действие: " + action);
        System.out.println("Тип: " + type);
        System.out.println("Параметры: " + argument);
        return new Command(action, type, argument);
    }
}