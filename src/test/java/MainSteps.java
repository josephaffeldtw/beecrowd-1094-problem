import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainSteps {

    private String input;
    private String current;

    @Given("input is")
    public void input_is(String input) {
        this.input = input;
    }

    @When("program run")
    public void program_runs() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream outputStream = new PrintStream(byteArrayOutputStream);

        PrintStream previousOut = System.out;
        InputStream previousIn = System.in;

        System.setIn(inputStream);
        System.setOut(outputStream);

        Main.main(null);

        current = byteArrayOutputStream.toString();

        inputStream.close();
        outputStream.close();

        System.setOut(previousOut);
        System.setIn(previousIn);
    }

    @Then("output should be")
    public void output_should_be(String expected) {
        assertEquals(expected, current);
    }
}