package stepdefinition;

import io.cucumber.java.en.*;
import junit.framework.Assert;
public class Steps {
  @Given("^you are in Given annotation$")
  public void given() throws Throwable {
	  System.out.println("Method 1");
  }

  @When("^you are in When annotation$")
  public void when() throws Throwable {
	  System.out.println("Method 2");
  }

  @Then("^you are in Then \"(.*)\"$")
  public void then(String var) throws Throwable {
	  System.out.println(var);
	  Assert.assertEquals("Hello", var);
	  System.out.println("Method 3");
  }

  @And("^you are in And annotation$")
  public void and() throws Throwable {
	  System.out.println("Method 4");
  }

  @But("^you are in But annotation$")
  public void but() throws Throwable {
	  System.out.println("Method 5");
  }
  
  
  
  
  @Given("^you are in Given annotation1$")
  public void given1() throws Throwable {
	  System.out.println("Method 1");
  }

  @When("^you are in When annotation1$")
  public void when1() throws Throwable {
	  System.out.println("Method 2");
  }

  @Then("^data parameterization \"(.*)\"$")
  public void then1(String var1) throws Throwable {
	  System.out.println(var1);
  }

  @And("^you are in And annotation1$")
  public void and1() throws Throwable {
	  System.out.println("Method 4");
  }

  @But("^you are in But annotation1$")
  public void but1() throws Throwable {
	  System.out.println("Method 5");
  }

}
