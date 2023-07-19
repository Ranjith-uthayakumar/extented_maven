package com.lao.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEOName_Step_def {
		// TODO Auto-generated method stub
		@Given("the user is on Home page")
		public void the_user_is_on_home_page() {
			System.out.println("the user is on Home page");
		}

		@When("the user clicks on the time option from the Menu ba")
		public void the_user_clicks_on_the_time_option_from_the_menu_ba() {
			System.out.println("the user clicks on the time option from the Menu ba");
		}

		@When("the user enters the name as {string}")
		public void the_user_enters_the_name_as(String string) {
			System.out.println("the user enters the name as john smith");
		}

		@When("clicks the view button")
		public void clicks_the_view_button() {
			System.out.println("clicks the view button");
		}

		@Then("the user should see the message as {string}")
		public void the_user_should_see_the_message_as(String string) {
			System.out.println("the user should see the message as john smith");
		}
	}


