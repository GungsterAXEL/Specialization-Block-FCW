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
    public void execute(List animals) {
        List<A> nullAnimals = new AnimalUtils().nullAnimals();
        String kind = super.getKind().toUpperCase();
        String argument = super.getArgument();
        for (A animal : nullAnimals) {
            if (kind.equals(animal.getTYPE()) && argument != null) {
                List<String> argumentParts = List.of(argument.replaceAll("\\s+", " ").trim().split("\""));
                argumentParts.get(0).split(" ", 1);
//                if (argumentParts.size() == 2 && argumentParts.get(0).length() == 2) {
                    for (String s : argumentParts) {
                        System.out.println(s);
                    }
//                }
//                animal.setName();
//                animal.setCommands();
//                animal.setBirthday();
//                animals.add(animal);
            }
        }
    }
}