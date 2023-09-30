import Terminal.Command.CommandUtils.CommandParser;

import java.util.ArrayList;
import java.util.List;

import Animal.Animal;
import Terminal.Terminal;

public class Test {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList();
        Terminal terminal = new Terminal(new CommandParser());
        terminal.runReader(animalList);
    }
}
