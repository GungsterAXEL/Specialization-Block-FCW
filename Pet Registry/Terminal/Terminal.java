package Terminal;

import Animal.Animal;
import Terminal.Command.Command;
import Terminal.Command.CommandUtils.CommandParser;

import java.util.List;
import java.util.Scanner;

public class Terminal {
    private static Terminal terminal;
    private CommandParser commandParser;

    public Terminal(CommandParser commandParser) {
        this.commandParser = commandParser;
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
            command.execute(animalList);
        }
    }
}
