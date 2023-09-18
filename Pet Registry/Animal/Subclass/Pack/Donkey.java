package Animal.Subclass.Pack;

import Animal.Subclass.PackAnimal;

import java.time.LocalDate;
import java.util.List;

public class Donkey extends PackAnimal {
    private String TYPE = "DONKEY";

    public Donkey(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getTYPE() {
        return TYPE;
    }
}
