package Animal.Subclass;

import Animal.Animal;

import java.time.LocalDate;
import java.util.List;

public abstract class DomesticAnimal extends Animal {
    private String CATEGORY = "DOMESTIC ANIMAL";

    public DomesticAnimal(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getCATEGORY() {
        return CATEGORY;
    }
}
