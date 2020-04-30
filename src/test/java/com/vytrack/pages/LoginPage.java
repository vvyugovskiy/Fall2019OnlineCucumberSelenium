package com.vytrack.pages;


import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class LoginPage extends AbstractPageBase {

    @FindBy(id = "prependedInput")
    public WebElement username;
//    public WebElement username2 = Driver.getDriver().findElement(By.id("prependedInput"));

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement login;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPassword;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;

//    public LoginPage() {
//
//        // to connect our webdriver, page class and page factory
//        // pageFactory - to use @FindBy annotations
//        // PageFactory - helps to find elements easier
//        PageFactory.initElements(Driver.getDriver(), this);
//    }

    /**
     * Method to login, version #1
     * Login as a specific user
     *
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    /**
     * Method to login, version #2
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login() throws AWTException {
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);


    }

    /**
     * this method stands for login based on user type
     * if parameter is equals to driver, user will login as a driver
     * If role parameter is not correct, method will throw exception
     *
     * @param role driver, sales manager or store manager
     */
    public void login(String role) {
        String userName = "";
        if (role.equalsIgnoreCase("driver")) {
            userName = "user15";
        } else if (role.equalsIgnoreCase("sales manager")) {
            userName = "salesmanager110";
        } else if (role.equalsIgnoreCase("store manager")) {
            userName = "storemanager85";
        } else {
            throw new RuntimeException("Invalid role!");
        }
        System.out.println("Login as " + role);
        login(userName, "UserUser123");
    }

    public String getWarningMessageText() {
        return warningMessage.getText();
    }

}
