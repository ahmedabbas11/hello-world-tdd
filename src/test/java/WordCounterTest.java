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

    @Test
    public void test_count_words_separated_by_space(){
        WordCount wordCount = new WordCount();
        String phrase = "AbdElrahman Alaa";

        int count = wordCount.count(phrase);

        Assertions.assertEquals( 2 , count );
    }

    @Test
    public void test_count_words_separated_by_comma(){
        WordCount wordCount = new WordCount();
        String phrase = "Ahmed,mohamed,Elsafty";

        int count = wordCount.count(phrase);
        Assertions.assertEquals(3 , count);
    }

    @Test
    public void test_count_words_separated_by_comma_and_space(){
        WordCount wordCount = new WordCount();
        String phrase = "Ahmed, mohamed,Elsafty";

        int count = wordCount.count(phrase);
        Assertions.assertEquals(3 , count);
    }

    @Test
    public void test_count_words_separated_by_multiple_space(){
        WordCount wordCount = new WordCount();
        String phrase = "Ahmed    mohamed,Elsafty";

        int count = wordCount.count(phrase);
        Assertions.assertEquals(3 , count);
    }
}


