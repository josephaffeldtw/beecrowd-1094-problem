import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExperimentsSteps {

    private final Experiments experiments = new Experiments();
    private double rabbitPorcentage = 0;
    private double ratPorcentage = 0;
    private double frogPorcentage = 0;
    private static final double DELTA = 1e-15;

    @Given("input is {int} {int} {int} {int} {int} {int}")
    public void sumAnimals(int a, int b, int c, int d, int e, int f) {
        experiments.rabbit += a;
        experiments.rat += b;
        experiments.frog += c;
        experiments.rabbit += d;
        experiments.rat += e;
        experiments.frog += f;

        experiments.animals = experiments.rabbit + experiments.rat + experiments.frog;
    }

    @When("calculate sum and porcentage")
    public void calculatePercentage() {
        rabbitPorcentage = experiments.calculatePercentage(experiments.rabbit, experiments.animals);
        ratPorcentage = experiments.calculatePercentage(experiments.rat, experiments.animals);
        frogPorcentage = experiments.calculatePercentage(experiments.frog, experiments.animals);
    }

    @Then("result should be {double} {double} {double} {int}")
    public void thenTheResultShouldBe(double rabbit, double rat, double frog, int total) {
        assertEquals(rabbit, rabbitPorcentage, DELTA);
        assertEquals(rat, ratPorcentage, DELTA);
        assertEquals(frog, frogPorcentage, DELTA);
        assertEquals(total, experiments.animals);
    }
}