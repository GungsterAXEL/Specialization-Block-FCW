package Animal.Subclass;

import Animal.Animal;

import java.time.LocalDate;
import java.util.List;

public abstract class PackAnimal extends Animal {
    private String CATEGORY = "PACK ANIMAL";

    public PackAnimal(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getCATEGORY() {
        return CATEGORY;
    }
}
