package Terminal.Command;

import Animal.Animal;
import Terminal.Command.Interface.Execute;
import Terminal.Command.Interface.ParseArgument;

import java.util.ArrayList;
import java.util.List;

public class CommandTeach<A extends Animal> extends Command implements Execute, ParseArgument {
    private final String ACTION = "TEACH";

    public CommandTeach(String kind, String argument) {
        super(kind, argument);
    }

    @Override
    public String getACTION() {
        return this.ACTION;
    }

    @Override
    public String toString() {
        return "[ACTION] : " + this.ACTION + " [KIND] : " + super.getKind() + " [ARGUMENT] : " + super.getArgument();
    }

    @Override
    public void execute(List<Animal> animals) {
        if (checkArgument()) {
            List<String> argumentParts = parseArgument();
            int count = 0;
            for (Animal animal : animals) {
                if (checkKind(animal)) {
                    setupCommands(animal, argumentParts);
                }
                if (animal.getCommands() != null) count++;
            }
            if (count > 0) System.out.println("Обучение завершено!");
            else System.out.println("Некого обучать!");
        } else System.out.println("Неверный ввод команды!");
    }

    @Override
    public List<String> parseArgument() {
        return List.of(super.getArgument().replaceAll("\"", "").replaceAll("\\s+", "").trim().split(", "));
    }

    private boolean checkArgument() {
        if (super.getArgument() != null) {
            if (super.getArgument().startsWith("\"") && super.getArgument().endsWith("\"")) {
                return true;
            }
        }
        return false;
    }

    private boolean checkKind(Animal animal) {
        if (animal.getName().toUpperCase().equals(super.getKind()) || animal.getTYPE().equals(super.getKind()) || animal.getCATEGORY().equals(super.getKind()))
            return true;
        return false;
    }

    private void setupCommands(Animal animal, List<String> argumentParts) {
        if (animal.getCommands() != null) {
            List<String> newCommands = new ArrayList<>();
            newCommands.addAll(animal.getCommands());
            for (String command : argumentParts) {
                if (!newCommands.contains(command)) newCommands.add(command);
            }
            animal.setCommands(newCommands);
        } else animal.setCommands(argumentParts);
    }
}
