package structural.facade.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileReader {
    String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}

