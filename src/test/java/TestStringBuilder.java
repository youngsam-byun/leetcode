import org.junit.jupiter.api.Test;

public class TestStringBuilder {

    @Test
    void stringBuilderTest(){
        StringBuilder sb1 = new StringBuilder("ab");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb1.compareTo(sb2));
    }
}
