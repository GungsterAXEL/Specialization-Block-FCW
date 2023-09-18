package Animal.Subclass.Pack;

import Animal.Subclass.PackAnimal;

import java.time.LocalDate;
import java.util.List;

public class Camel extends PackAnimal {
    private String TYPE = "CAMEL";

    public Camel(String name, List<String> commands, LocalDate birthday) {
        super(name, commands, birthday);
    }

    public String getTYPE() {
        return TYPE;
    }
}
