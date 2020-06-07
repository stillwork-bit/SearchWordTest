package SearchWord;

import Helpers.GetPathProject;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

public class ReadFileTest {
    @Test
    public void readFileNameGood() throws IOException {
        ReadFile readFile = new ReadFile();
        GetPathProject getPathProject = new GetPathProject();
        Assert.assertNotNull(readFile.ReadFileName(getPathProject.getPath() + "\\Hobbitname.txt"));
    }

    @Test
    public void readFileNameBadPath1() throws NullPointerException {
        ReadFile readFile = new ReadFile();
        GetPathProject getPathProject = new GetPathProject();
        try {
            readFile.ReadFileName(getPathProject.getPath() + "\\BadTest.txt");
            Assert.fail("Expected IOException");
        } catch (NullPointerException | IOException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    //Какой способ лучше использовать? прочитал про Junit5, там можно более изящно перехватить исключение с throw
    @Test(expected = java.nio.file.NoSuchFileException.class)
    public void readFileNameBadPath2() throws IOException {
        ReadFile readFile = new ReadFile();
        GetPathProject getPathProject = new GetPathProject();
        readFile.ReadFileName(getPathProject.getPath() + "\\BadTest.txt");

    }
}
