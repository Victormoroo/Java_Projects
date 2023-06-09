package streams_practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.sorted().filter(l -> l.length() > 6).forEach(x -> System.out.print(x + ", "));
        lines.close();

    }
}
