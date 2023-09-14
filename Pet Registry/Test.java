import Terminal.Command.CommandExecutable.CommandExecute;
import Terminal.Command.CommandParser.CommandParser;

import java.util.ArrayList;
import java.util.List;

import Animal.Animal;
import Terminal.Terminal;

public class Test {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        Terminal terminal = new Terminal(new CommandParser(), new CommandExecute(animalList));
        terminal.runReader(animalList);
    }
}
