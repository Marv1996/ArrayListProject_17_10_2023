import model.Human;
import service.FileService;
import service.HumanService;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static final String URL = "C:\\Users\\LaBete\\Desktop\\test.txt";

    public static void main(String[] args) throws Exception {

        ArrayList<String> read = new ArrayList<>(FileService.read(URL));

        ArrayList<Human> convertHuman = new ArrayList<>(HumanService.convert(read));

        System.out.println(convertHuman);

        Collections.sort(convertHuman);
        System.out.println(convertHuman);

        String lage = HumanService.sort(convertHuman);
        FileService.write(URL, "\nTo large = " + lage);
    }
}