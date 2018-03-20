package com.nz.gentrack.mydemoproject.StepDefs;

import com.nz.gentrack.mydemoproject.domain.animal.Animal;
import com.nz.gentrack.mydemoproject.domain.animal.Dog;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.assertEquals;

public class AnimalsStepsDef {

    private Animal myDog;
    private String animalSound;


    @Given("^I have a dog$")
    public void iHaveADog(){
        myDog = new Dog();
    }

    @When("^the animal makes a sound$")
    public void theAnimalMakesASound(){
        animalSound = myDog.getNoise();
    }

    @Then("^I expect the sound to be a bark$")
    public void iExpectTheSoundToBeABark(){
        assertEquals("bark",animalSound);
    }
}
