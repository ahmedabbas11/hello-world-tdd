import com.orange.count.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WordCounterTest {

    @Test
    public void test_count_one_word(){
        // arrange
        WordCount wordCount = new WordCount();
        String phrase = "abbas";
        // action
        int count = wordCount.count(phrase);
        // assert
        Assertions.assertEquals(1, count);

    }
}
