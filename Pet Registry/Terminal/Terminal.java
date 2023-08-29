package Terminal;

import java.util.Scanner;

public class Terminal {
    /*
    private static Terminal terminal;
    private CommandParser commandParser;
    private CommandFactory commandFactory;

    public Terminal(CommandParser commandParser, CommandFactory commandFactory) {
        this.commandParser = commandParser;
        this.commandFactory = commandFactory;
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
            CommandExecute commandExecutable = this.commandExecutableFactory.create(command, animalList);
            commandExecutable.execute();
        }
    }

     */
}
