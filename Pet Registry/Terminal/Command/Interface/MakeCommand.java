package Terminal.Command.Interface;

import Terminal.Command.Command;

public interface MakeCommand {
    Command makeCommand(String action, String kind, String argument);
}
