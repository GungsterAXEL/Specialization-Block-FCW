package Animal.Subclass.Pack;

import Animal.Subclass.PackAnimal;

import java.time.LocalDate;
import java.util.List;

public class Horse extends PackAnimal {
    private String TYPE = "Лошадь";

    public Horse(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getTYPE() {
        return TYPE;
    }
}
