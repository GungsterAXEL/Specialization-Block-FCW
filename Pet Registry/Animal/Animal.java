package Animal;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    private String name;
    private List<String> commands;
    private LocalDate birthday;

    public Animal(String name, List<String> commands, LocalDate birthday) {
        this.name = name;
        this.commands = commands;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public abstract String getTYPE();
    public abstract String getCATEGORY();
}
