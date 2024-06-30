// src/test/java/ConverterTest.java
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    @Test
    public void convert_1_to_I() {
        Converter converter = new Converter();
        String result = converter.convert(1);
        assertThat(result).isEqualTo("I");
    }

    @Test
    public void convert_5_to_V() {
        Converter converter = new Converter();
        String result = converter.convert(5);
        assertThat(result).isEqualTo("V");
    }

    @Test
    public void convert_10_to_X() {
        Converter converter = new Converter();
        String result = converter.convert(10);
        assertThat(result).isEqualTo("X");
    }

}
