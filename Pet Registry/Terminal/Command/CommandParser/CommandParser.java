package Terminal.Command.CommandParser;

import Terminal.Command.Command;
import Terminal.Command.CommandAdd;
import Terminal.Command.CommandShow;
import Terminal.Command.CommandTeach;

import java.util.List;

public class CommandParser implements Parser {

    @Override
    public Command parseCommand(String input) {
        List<String> commandParts = List.of(input.trim().split(" ", 3));
        String action = commandParts.get(0);
        String type = commandParts.get(1);
        String argument = commandParts.get(2);

        if (action.toUpperCase().equals(new CommandShow(type, argument).getACTION())) return new CommandShow(type, argument);
        else if (action.toUpperCase().equals(new CommandAdd(type, argument).getACTION())) {
            System.out.println(action);
            return new CommandAdd(type, argument);
        } else if (action.toUpperCase().equals(new CommandTeach(type, argument).getACTION())) return new CommandTeach(type, argument);
        return null;
    }
}