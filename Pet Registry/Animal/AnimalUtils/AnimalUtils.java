package Animal.AnimalUtils;

import Animal.Animal;

public class AnimalUtils {
    public static String stringValue(Animal animal) {
        return animal.getCATEGORY() + " " + animal.getTYPE() + " " + animal.getCommands() + " " + animal.getCommands();
    }
}
