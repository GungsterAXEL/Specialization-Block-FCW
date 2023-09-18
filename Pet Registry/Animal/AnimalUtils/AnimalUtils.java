package Animal.AnimalUtils;

import Animal.Animal;
import Animal.Subclass.Domestic.Cat;
import Animal.Subclass.Domestic.Dog;
import Animal.Subclass.Domestic.Hamster;
import Animal.Subclass.Pack.Camel;
import Animal.Subclass.Pack.Donkey;
import Animal.Subclass.Pack.Horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalUtils<A extends Animal> {
    public AnimalUtils() {
    }

    public String stringValue(A animal) {
        return animal.getCATEGORY() + " " + animal.getTYPE() + " " + animal.getName() + " " + animal.getCommands() + animal.getBirthday();
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
    public boolean requestEquals(String request, A animal){
        return animal.getCATEGORY().equals(request) || animal.getTYPE().equals(request) || animal.getName().equals(request);
    }

    public void tableMaker(String request, List<A> animals) {
        System.out.println(tableHead());
        for (A animal : animals) {
            if (requestEquals(request, animal)) {
                System.out.println(stringValue(animal));
                System.out.println(tableDelimiter());
            }
        }
        System.out.println(tableTail());
    }

    public List<A> nullAnimals() {
        return new ArrayList(Arrays.asList(
                //Domestic Animals.
                new Dog(null, null, null),
                new Cat(null, null, null),
                new Hamster(null, null, null),
                //Pack Animals.
                new Camel(null, null, null),
                new Horse(null, null, null),
                new Donkey(null, null, null)));
    }
}
