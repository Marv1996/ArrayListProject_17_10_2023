package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileService {
    public static ArrayList<String> read(String url) throws IOException {
        return new ArrayList<>(Files.readAllLines(Path.of(url)));
    }

    public static void write(String url, String text) throws Exception {
        Files.write(Path.of(url), text.getBytes(), StandardOpenOption.APPEND);
    }
}
