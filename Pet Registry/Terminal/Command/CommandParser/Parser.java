package Terminal.Command.CommandParser;

import Terminal.Command.Command;

public interface Parser {
    Command parseCommand(String inputCommand);
}
