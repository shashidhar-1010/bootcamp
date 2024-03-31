package org.example;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserSteps {
    //@Then("^Amit is known as java certified$")


    User user = new User();




    @Given("^ that the user (.*) is a given a task to clear (.*) certification exam ")
    public void certification(String name, String certification) {
        user.setName(name);
        user.setCertification(certification);

    }
    @When("^ (.*) got (\\d+) marks in exam$")
    public void gotMarks(String name,int marks){
        user.setName(name);
        user.setMarks(marks);
    }
    @Then("^(.*) is known as (.*) certified$")
    public void getCertified(String name , String certification){
        user.setName(name);
        user.setCertification(certification);
        assertThat(name,is(user.getName()));
        assertThat(user.getCertification(),equalTo("java"));
        assertThat(user.getResult(),is(true));
    }

}
