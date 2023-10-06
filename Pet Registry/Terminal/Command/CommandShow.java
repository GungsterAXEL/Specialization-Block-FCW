package Terminal.Command;

import Animal.Animal;
import Terminal.Command.Interface.Execute;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CommandShow extends Command implements Execute {
    private final static String ACTION = "SHOW";
    private final static String TABLE = "TABLE";

    public CommandShow(String kind, String argument) {
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
        if (super.getArgument() != null) {
            int count = 0;
            System.out.println(tableHead());
            for (Animal animal : animals) {
                if (checkKind(animal)) {
                    System.out.println(tableDelimiter());
                    System.out.println(tableLine(animal));
                    count++;
                }
            }
            System.out.println(tableDelimiter());
            System.out.println(tableTail(count));
            if (count == 0) System.out.println("Данные по запросу не найдены!");
        } else System.out.println("Недостаточно аргументов!");
    }

    private String tableHead() {
        char delimiter = '|';
        return delimiter + String.format("%15s", "CATEGORY") +
                delimiter + String.format("%15s", "TYPE") +
                delimiter + String.format("%20s", "Name") +
                delimiter + String.format("%10s", "BirthDate") +
                delimiter + String.format("%50s", "CommandList") +
                delimiter;
    }

    private String tableDelimiter() {
        char delimiter = '-';
        return String.valueOf(delimiter).repeat(tableHead().length());
    }

    private String tableLine(Animal animal) {
        char delimiter = '|';
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return delimiter + String.format("%15s", animal.getCATEGORY()) +
                delimiter + String.format("%15s", animal.getTYPE()) +
                delimiter + String.format("%20s", animal.getName()) +
                delimiter + String.format("%10s", animal.getBirthday().format(formatter)) +
                delimiter + String.format("%50s", animal.getCommands()) +
                delimiter;
    }

    private String tableTail(int count) {
        char delimiter = '|';
        return delimiter + String.format("%104s", "Total:") +
                String.format("%10s", count) +
                delimiter;
    }

    private boolean checkKind(Animal animal) {
        if ((animal.getName().toUpperCase().equals(super.getKind()) || animal.getTYPE().equals(super.getKind()) || animal.getCATEGORY().equals(super.getKind())) && super.getArgument().toUpperCase().equals(this.TABLE))
            return true;
        return false;
    }
}
