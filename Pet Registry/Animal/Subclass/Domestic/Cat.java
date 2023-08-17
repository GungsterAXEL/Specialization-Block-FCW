package Animal.Subclass.Domestic;

import Animal.Subclass.DomesticAnimal;

import java.time.LocalDate;
import java.util.List;

public class Cat extends DomesticAnimal {
    private String TYPE = "Кошка";

    public Cat(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getTYPE() {
        return TYPE;
    }
}
