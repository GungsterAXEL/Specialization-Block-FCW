import Terminal.CommandParser.CommandParser;
import Terminal.Commands.Manual;

public class Test {
    public static void main(String[] args) {
        Manual.showManual();
        // Тест парсера.
        String cmdLineEntry = "Add Dog Mike 23.07.1996 Hug, Bug, Tug";
        System.out.println(parseCommand().toString());
    }
}
