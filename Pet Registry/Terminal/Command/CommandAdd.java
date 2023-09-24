package Terminal.Command;

import Animal.Animal;
import Animal.Utilities.Utilities;
import Terminal.Command.Interface.Execute;
import Terminal.Command.Interface.ParseArgument;

import java.util.List;

public class CommandAdd<A extends Animal> extends Command implements Execute, ParseArgument {
    private final String ACTION = "ADD";

    public CommandAdd(String kind, String argument) {
        super(kind, argument);
    }

    @Override
    public String getACTION() {
        return this.ACTION;
    }

    @Override
    public String toString() {
        return "[ACTION] : " + this.ACTION;
    }

    @Override
    public List parseArgument(String argument) {
        String regex = "(?<=\")\\s+|\\s+(?=\")|\\s+";
        List<String> argumentParts = List.of(argument.replaceAll("\\s+", " ").trim().split(regex));

        System.out.println(argumentParts.size());
        for (String s : argumentParts) {
            System.out.println(s);
        }

        return argumentParts;
    }

    @Override
    public void execute(List animals) {
        Utilities utilities = new Utilities();
        List<A> nullAnimals = utilities.nullAnimals();
        String kind = utilities.convertToUpperCase(super.getKind());
        String argument = super.getArgument();
        String regex = "(?<=\")\\s+|\\s+(?=\")|\\s+";
        if (argument != null) {
            List<String> argumentParts = List.of(argument.split(regex));
            for (A animal : nullAnimals) {
                System.out.println(kind + " " + animal.getTYPE());
                if (kind.equals(animal.getTYPE()) && argumentParts.size() == 3) {
                    for (String s : argumentParts) {
                        System.out.println(argumentParts.size() + " " + s);
                    }
//                animal.setName();
//                animal.setCommands();
//                animal.setBirthday();
//                animals.add(animal);
                }
            }
        } else System.out.println("Недостаточно аргументов!");
    }
}