package StepDefs;

import Common.CommonMethods;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Common.CommonMethods.openPage;

public class QC_5774_Background {


    @Given("the page opened on uri {string}")
    public void the_page_opened_on_uri(String string) {
        openPage("https://www.autodoc.de/sno-pro/15080617");
    }

    @Given("added drop product to basket")
    public void added_drop_product_to_basket() {
        System.out.println("HERE");
    }

    @Given("added simple product to basket")
    public void added_simple_product_to_basket() {
        System.out.println("HERE");
    }

    @When("go to basket")
    public void go_to_basket() {
        System.out.println("HERE");
    }

    @When("Login")
    public void login() {
        System.out.println("HERE");
    }

}
