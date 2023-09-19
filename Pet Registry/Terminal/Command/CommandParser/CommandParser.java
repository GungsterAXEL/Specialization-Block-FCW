package Terminal.Command.CommandParser;

import Terminal.Command.*;
import Terminal.Command.Interface.ParseCommand;

import java.util.List;

public class CommandParser implements ParseCommand {
    public Command makeCommand(String action, String kind, String argument) {
        if (action.equals(CommandHelp.getACTION())) return new CommandHelp(kind, argument);
        else if (action.equals(new CommandExit(kind, argument).getACTION())) return new CommandExit(kind, argument);
        else if (action.equals(new CommandShow(kind, argument).getACTION())) return new CommandShow(kind, argument);
        else if (action.equals(new CommandAdd(kind, argument).getACTION())) return new CommandAdd(kind, argument);
        else if (action.equals(new CommandTeach(kind, argument).getACTION())) return new CommandTeach(kind, argument);
        return new UnknownCommand(kind, argument);
    }

    @Override
    public Command parseCommand(String input) {
        int limit = 3;
        List<String> commandParts = List.of(input.trim().split(" ", limit));
        String action = commandParts.get(0).toUpperCase(),
                kind = null,
                argument = null;
        if (commandParts.size() == limit) {
            kind = commandParts.get(1);
            argument = commandParts.get(2);
        }
        return makeCommand(action,kind,argument);
    }
}