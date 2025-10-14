package structural.facade.problem.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {

    public static void main(String[] args) throws IOException {
        String path = "example.txt";
        String content = "hello";

        // 직접 각 작업을 처리 (예외 처리/로깅이 분산됨)
        Files.write(Paths.get(path), content.getBytes());
        String read = new String(Files.readAllBytes(Paths.get(path)));
        System.out.println(read);
        Files.delete(Paths.get(path));
    }
}
