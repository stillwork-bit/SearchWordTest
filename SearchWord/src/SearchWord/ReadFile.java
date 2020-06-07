package SearchWord;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class ReadFile {
    private List<String> words = new ArrayList<String>();

    public List ReadFileName(String namePathFile) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get(namePathFile));
            while (scanner.hasNext()) {
                StringTokenizer tokenizer = new StringTokenizer(scanner.next(), ".(),!?;':\"\n-");
                while (tokenizer.hasMoreTokens()) {
                    words.add(tokenizer.nextToken());
                }

            }
        } catch (NullPointerException e) {
            scanner.close();
            System.out.println("Неверный путь" + e);
        }
        return words;
    }
}