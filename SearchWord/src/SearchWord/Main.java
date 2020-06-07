package SearchWord;

import Helpers.GetPathProject;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFile readFileBook = new ReadFile();
        ReadFile readFileName = new ReadFile();
        SearchWord searchWord = new SearchWord();
        GetPathProject getPathProject = new GetPathProject();
        String pathName;
        String pathBook;
        try {
            List<String> nameList = readFileName.ReadFileName(String.format("%s\\Hobbitname.txt", getPathProject.getPath()));
            List<String> wordBookList = readFileBook.ReadFileName(String.format("%s\\TheHobbit.txt", getPathProject.getPath()));
            System.out.println(searchWord.Compasion(nameList, wordBookList));
        } catch (NoSuchFileException e) {
            System.out.println("Неверный путь.\nПроверьте путь к считываемому файлу.");
            //e.printStackTrace();
        }


    }
}
