package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void output_string_contains_author_and_quote() {
        App myApp = new App();

        String name = "Obi-Wan Kenobi";
        String quote = "These aren't the droids you're looking for.";

        String expectedOutput = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualOutput = myApp.GenerateOutput(name, quote);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}