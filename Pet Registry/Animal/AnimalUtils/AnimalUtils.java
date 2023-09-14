package Animal.AnimalUtils;

import Animal.Animal;

import java.util.List;

public class AnimalUtils<A extends Animal> {
    public AnimalUtils() {
    }

    public String stringValue(Animal animal) {
        return animal.getCATEGORY() + " " + animal.getTYPE() + " " + animal.getCommands() + " " + animal.getCommands();
    }

    public String tableHead() {
        return " ";
    }

    public String tableDelimiter() {
        return " ";
    }

    public String tableTail() {
        return " ";
    }

    public void tableMaker(String request, List<A> animals) {
        System.out.println(tableHead());
        for (A animal : animals) {
            if (animal.getCATEGORY().equals(request) || animal.getTYPE().equals(request)) {
                System.out.println(stringValue(animal));
                System.out.println(tableDelimiter());
            }
        }
        System.out.println(tableTail());
    }
}
