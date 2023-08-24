package Terminal.Commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manual {
    private final static String PATH = "Pet Registry" + File.separator + "Terminal" + File.separator + "Commands" + File.separator + "MANUAL.txt";
    private final static File MANUAL = new File(PATH);

    public static File getMANUAL() {
        return MANUAL;
    }
    public static void showManual(){
        try {
            Scanner scanner = new Scanner(MANUAL);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            System.out.println();
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
