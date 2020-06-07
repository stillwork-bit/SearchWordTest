package SearchWord;

import Helpers.GetPathProject;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.util.List;


public class SearchWordTest {
    @Test
    public void compasionGoodTest() throws IOException {
        ReadFile readFileBook = new ReadFile();
        ReadFile readFileName = new ReadFile();
        SearchWord searchWord = new SearchWord();
        GetPathProject getPathProject = new GetPathProject();
        String pathName = String.format("%s\\Hobbitname.txt", getPathProject.getPath());
        String pathBook = String.format("%s\\TheHobbit.txt", getPathProject.getPath());
        List<String> nameList = readFileName.ReadFileName(pathName);
        List<String> wordBookList = readFileBook.ReadFileName(pathBook);
        Assert.assertNotNull(searchWord.Compasion(nameList, wordBookList));
    }
}