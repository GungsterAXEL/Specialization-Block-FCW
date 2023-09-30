package Terminal.Command.CommandUtils;

import Terminal.Command.*;
import Terminal.Command.Interface.MakeCommand;
import Terminal.Command.Interface.ParseCommand;

import java.util.List;

public class CommandParser implements ParseCommand, MakeCommand {
    @Override
    public Command parseCommand(String input) {
        int limit = 3;
        List<String> commandParts = List.of(input.trim().split(" ", limit));
        String action = null,
                kind = null,
                argument = null;

        for (int i = 0; i < commandParts.size() && commandParts != null; i++) {
            if (i == 0) action = commandParts.get(i).toUpperCase();
            else if (i == 1) kind = commandParts.get(i).toUpperCase();
            else if (i == 2) argument = commandParts.get(i);
        }

        return makeCommand(action, kind, argument);
    }

    @Override
    public Command makeCommand(String action, String kind, String argument) {
        if (action.equals(new CommandHelp(kind, argument).getACTION())) return new CommandHelp(kind, argument);
        else if (action.equals(new CommandExit(kind, argument).getACTION())) return new CommandExit(kind, argument);
        else if (action.equals(new CommandShow(kind, argument).getACTION())) return new CommandShow(kind, argument);
        else if (action.equals(new CommandAdd(kind, argument).getACTION())) return new CommandAdd(kind, argument);
        else if (action.equals(new CommandTeach(kind, argument).getACTION())) return new CommandTeach(kind, argument);
        return new UnknownCommand(kind, argument);
    }
}