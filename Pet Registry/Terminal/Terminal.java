package Terminal;

import Terminal.Command.Command;
import Terminal.Command.CommandExecutable.CommandExecute;
import Terminal.Command.CommandParser.CommandParser;
import Animal.Animal;
import Terminal.Command.Manual;

import java.util.List;
import java.util.Scanner;

public class Terminal {
    private static Terminal terminal;
    private CommandParser commandParser;
    private CommandExecute commandExecute;

    public Terminal(CommandParser commandParser, CommandExecute commandExecute) {
        this.commandParser = commandParser;
        this.commandExecute = commandExecute;
    }

    public static void setTerminalReader(Terminal terminal) {
        Terminal.terminal = terminal;
    }

    public void runReader(List<Animal> animalList) {
        Scanner scan = new Scanner(System.in);

        boolean restart = true;
        while (restart) {
            System.out.println(Menu.getMENU());
            Command command = this.commandParser.parseCommand(scan.nextLine());
//            CommandExecute commandExecute = this.commandExecute;
            this.commandExecute.execute(command, animalList);
        }
    }
}
