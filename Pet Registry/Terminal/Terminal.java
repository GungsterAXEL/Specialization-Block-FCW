package Terminal;

import java.util.Scanner;

public class Terminal {
    /*
    private static Terminal terminal;
    private CommandParser commandParser;
    private CommandExecutableFactory commandExecutableFactory;

    public Terminal(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public static void setTerminalReader(Terminal terminal) {
        Terminal.terminal = terminal;
    }

    public void runReader(Zoo zoo) {
        Scanner scan = new Scanner(System.in);

        boolean restart = true;
        while (restart) {
            System.out.println(Menu.getMENU());
            Command command = this.commandParser.parseCommand(scan.nextLine());
            CommandExecutable commandExecutable = this.commandExecutableFactory.create(command, zoo);
            commandExecutable.execute();
        }
    }

     */
}
