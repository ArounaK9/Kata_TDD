import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestConvert {

    @Test
    public void convert_1_to_I() {
        // Arrange
        int number = 1;
        RomanNumeralsConverter converter = new RomanNumeralsConverter();

        // Act
        String result = converter.convert(number);

        // Assert
        assertThat(result).isEqualTo("I");
    }
}