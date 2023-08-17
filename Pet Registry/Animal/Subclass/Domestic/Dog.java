package Animal.Subclass.Domestic;

import Animal.Subclass.DomesticAnimal;

import java.time.LocalDate;
import java.util.List;

public class Dog extends DomesticAnimal {
    private String TYPE = "Собака";

    public Dog(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getTYPE() {
        return TYPE;
    }
}
