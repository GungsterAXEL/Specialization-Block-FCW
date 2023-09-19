package Terminal.Command.Interface;

import Terminal.Command.Command;
import Animal.Animal;

import java.util.List;

public interface Execute<A extends Animal> {
    void execute(List<A> animals);
}