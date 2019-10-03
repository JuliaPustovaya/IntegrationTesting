import static junit.framework.TestCase.assertEquals;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class DogStep extends Steps {
	Dog dog;

	@BeforeScenario
	public void init() {
		System.out.println("Starting test...");
		dog = new Dog("Nick");
	}

	@When("give new name $name")
	public void callChangeName(String newName) {
		dog.changeName(newName);
		System.out.println("New name is  " + dog.getName());
	}

	@Then("result")
	public void getResult() {
		assertEquals("NickKukuHello", dog.getName());
	}

	@AfterScenario
	public void finishTests() {
		System.out.println("Finish testing...");
	}
}
