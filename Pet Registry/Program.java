import Animal.Animal;
import Animal.Subclass.Pack.Donkey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        List<String> commands = new ArrayList<>();
        commands.add("Ghhh");
        String name = "Iia";
        LocalDate bday = LocalDate.of(2023, 02, 17);

        Donkey donkey = new Donkey(name, commands, bday);
        System.out.println(donkey.getCATEGORY() + " " + donkey.getTYPE() + " " + donkey.getName() + " " + donkey.getCommands().toString() + " " + donkey.getBirthday().toString());

        animalList.add(donkey);
        System.out.println(animalList.get(0).getCATEGORY());
    }
}
