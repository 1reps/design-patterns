package structural.facade.after.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileDeleter {
    void deleteFile(String filePath) throws IOException {
        Files.delete(Paths.get(filePath));
    }
}

