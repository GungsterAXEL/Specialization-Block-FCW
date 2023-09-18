package Terminal.Command;

import Animal.Animal;
import Animal.AnimalUtils.AnimalUtils;
import Terminal.Command.Interface.Execute;

import java.util.List;

public class CommandAdd<A extends Animal> extends Command implements Execute {
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
    public void execute(Command command, List animals) {
        List<A> nullAnimals = new AnimalUtils().nullAnimals();
        String kind = command.getKind().toUpperCase();
        for (A animal : nullAnimals) {
            if (kind.equals(animal.getTYPE()) && command.getArgument() != null) {
                String[] argument = command.getArgument().replaceAll("\\s+", " ").trim().split("\"");
                System.out.println(argument.length);
                for (String s : argument) {
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