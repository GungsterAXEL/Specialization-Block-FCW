package Terminal.Command;

import Animal.Animal;
import Animal.AnimalUtils.AnimalUtils;
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
        List<String> argumentParts = List.of(argument.replaceAll("\\s+", " ").trim().split("\""));


        System.out.println(argumentParts.size());
        for (String s : argumentParts) {
            System.out.println(s);
        }

        return argumentParts;
    }

    @Override
    public void execute(List animals) {
        List<A> nullAnimals = new AnimalUtils().nullAnimals();
        String kind = super.getKind().toUpperCase();
        String argument = super.getArgument();
        String regex = "(?<=\")\\s+|\\s+(?=\")|\\s+";
        for (A animal : nullAnimals) {
            if (kind.equals(animal.getTYPE()) && argument != null) {
                List<String> argumentParts = List.of(argument.split(regex));
                for (String s : argumentParts) {
                    System.out.println(s);
                }
//                animal.setName();
//                animal.setCommands();
//                animal.setBirthday();
//                animals.add(animal);
            }
        }
    }


}