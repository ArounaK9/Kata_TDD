
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    @Test
    public void convert_1_to_I() {
        Converter converter = new Converter();
        String result = converter.convert(1);
        assertThat(result).isEqualTo("I");
    }
}
