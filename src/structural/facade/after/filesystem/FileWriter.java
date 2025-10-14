package structural.facade.after.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileWriter {
    void writeFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}

