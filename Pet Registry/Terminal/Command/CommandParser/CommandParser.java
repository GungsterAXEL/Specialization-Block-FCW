package Terminal.Command.CommandParser;

import Terminal.Command.*;

import java.util.List;

public class CommandParser implements Parser {

    @Override
    public Command parseCommand(String input) {
        List<String> commandParts = List.of(input.trim().split(" ", 3));
        String action = commandParts.get(0).toUpperCase(),
                kind = null,
                argument = null;

        if (commandParts.size() > 2) {
            kind = commandParts.get(1);
            argument = commandParts.get(2);
        }

        if (action.equals(new CommandHelp(kind, argument).getACTION())) return new CommandHelp(kind, argument);
        else if (action.equals(new CommandExit(kind, argument).getACTION())) return new CommandExit(kind, argument);
        else if (action.equals(new CommandShow(kind, argument).getACTION())) return new CommandShow(kind, argument);
        else if (action.equals(new CommandAdd(kind, argument).getACTION())) return new CommandAdd(kind, argument);
        else if (action.equals(new CommandTeach(kind, argument).getACTION())) return new CommandTeach(kind, argument);
        return new UnknownCommand(kind, argument);
    }
}