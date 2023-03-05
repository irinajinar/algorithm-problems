package removeShortWords;

import org.example.removeShortWords.RemoveShortWords;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class RemoveShortWordsTest {

    @Test
    public void removeShortWordsTest() throws Exception {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("aa", "aa", "aaa"));

        ArrayList<String> output = RemoveShortWords.removeShortWords(words, 2);
        assertEquals(output.size(), 3);
    }

    @Test
    public void removeShortWordsTestWhenWordsIsEmpty() throws Exception {
        ArrayList<String> words = new ArrayList<>();

        ArrayList<String> output = RemoveShortWords.removeShortWords(words, 2);
        assertEquals(output.size(), 0);
    }

    @Test
    public void removeShortWordsTestWhenWordsContainsOnlyLongerThanMinLenghtWords() throws Exception {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("aa", "aa", "aaa"));

        ArrayList<String> output = RemoveShortWords.removeShortWords(words, 1);
        assertEquals(output.size(), words.size());
    }

    @Test
    public void removeShortWordsTestWhenWordsIsNull(){
        assertThrows(Exception.class, () -> RemoveShortWords.removeShortWords(null, 1));
    }
}
