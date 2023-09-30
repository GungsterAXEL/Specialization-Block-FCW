package Terminal.Command;

import Animal.Animal;
import Terminal.Menu;
import Utilities.Utilities;
import Terminal.Command.Interface.Execute;
import Terminal.Command.Interface.ParseArgument;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class CommandAdd<A extends Animal> extends Command implements Execute, ParseArgument {
    private final static String ACTION = "ADD";

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
    public List<String> parseArgument(String argument) {
        if (argument != null) {
            String regex = "(?<=\")\\s+|\\s+(?=\")|\\s+";
            List<String> argumentParts = List.of(argument.replaceAll("\\s+", " ").trim().split(regex));
            return argumentParts;
        } else return null;
    }

    @Override
    public void execute(List animals) {
        List<String> argumentParts = parseArgument(super.getArgument());
        int size = (argumentParts == null) ? 0 : argumentParts.size();

        if (size == 2 || size == 3) {
            A animal = returnAnimal(size, argumentParts);
            if (animal.getName() != null && animal.getBirthday() != null) {
                animals.add(animal);
                System.out.println("Животное " + animal.getTYPE() + " добавлено.");
            }
        } else System.out.println("Недостаточно аргументов!");
    }

    private A returnAnimal(int size, List<String> argumentParts) {
        Utilities utilities = new Utilities();
        List<A> nullAnimals = utilities.nullAnimals();
        for (A animal : nullAnimals) {
            if (super.getKind().equals(animal.getTYPE())) {
                for (int i = 0; i < size; i++) {
                    if (i == 0) animal.setName(argumentParts.get(i));
                    else if (i == 1) {
                        try {
                            String dateString = argumentParts.get(i);
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                            LocalDate date = LocalDate.parse(dateString, formatter);
                            animal.setBirthday(date);
                        } catch (DateTimeParseException e) {
                            System.out.println("Ошибка формата даты: " + e.getMessage());
                        } catch (DateTimeException e) {
                            System.out.println("Неверная дата: " + e.getMessage());
                        }
                    } else if (i == 2) {
                        animal.setCommands(List.of(argumentParts.get(i).replace("\"", "").split(", ")));
                    }
                }
                return animal;
            }
        }
        return null;
    }
}