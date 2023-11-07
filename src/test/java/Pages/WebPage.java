package Pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage extends Utility {

    //For Login
    By inputTextUserName = By.xpath("//*[@id=\"user-name\"]");
    By inputTextPassword = By.xpath("//*[@id=\"password\"]");
    By inputTextLoginButton = By.xpath("//*[@id=\"login-button\"]");

    //For Home Page
    By inputtextHomePage = By.xpath("//*[@id=\"item_3_title_link\"]/div");

    //For All List
    By inputMenuButton = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By inputListItem = By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div");
    By inputViewAllList = By.xpath("//*[@id=\"item_0_title_link\"]/div");

    //Item Selection
    By inputItemSelection = By.xpath("//*[@id=\"item_2_title_link\"]/div");

    //For Detail
    By inputPageItemSelecrion = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");

    //For Add Items
    By inputAddToChart = By.id("add-to-cart-sauce-labs-onesie");

    //For Chart
    By inputListKerang = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By inputOnPageChar = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By inputCheckoutButton =  By.xpath("//*[@id=\"checkout\"]");

    //For Checkout
    By inputScreenCheckoutPage = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By inputFristName = By.xpath("//*[@id=\"first-name\"]");
    By inputLastName =  By.xpath("//*[@id=\"last-name\"]");
    By inputKodePos = By.xpath("//*[@id=\"postal-code\"]");
    By inputContinueButton = By.xpath("//*[@id=\"continue\"]");
    By inputCheckoutOverview = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By inputFinisButton =  By.xpath("//*[@id=\"finish\"]");
    By inputCheckoutComplete = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public void userIsOnLoginPage(){
//        driver.navigate().to("https://www.saucedemo.com");
        driver.get("https://www.saucedemo.com");
    }

    public void userInputUsernameWith (String username){
        driver.findElement(inputTextUserName).sendKeys(username);
    }

    public void userInputPasswordWith (String Password){
        driver.findElement(inputTextPassword).sendKeys(Password);
    }

    public void userClickLoginButton (){
        driver.findElement(inputTextLoginButton).click();
    }

    public void userAbleToSeeErrorMessage(String ErrorBro){
        assertTrue(driver.getPageSource().contains(ErrorBro));
    }

    public void userIsOnHomepage(){
        WebElement Akses = driver.findElement(inputtextHomePage);
        assertTrue(Akses.isDisplayed());
        assertEquals("Test.allTheThings() T-Shirt (Red)",Akses.getText());
//        System.out.println("Judul pada Item ini adalah=" + Akses.getText());

    }

    //For All List
    public void userClickOpenMenuButton (){
        driver.findElement(inputMenuButton).click();
    }

    public void userClickAllItems (){
        driver.findElement(inputListItem).click();
    }

    public void userIsOnAllListItem(){
        WebElement Local = driver.findElement(inputViewAllList);
        assertTrue(Local.isDisplayed());
        assertEquals("Sauce Labs Bike Light",Local.getText());
//        System.out.println("Judul pada Item ini adalah=" + Local.getText());
    }
    //Item Selection
    public void userClickItemSelection (){
        driver.findElement(inputItemSelection).click();
    }

    //For Detail
    public void userIsOnPageOfItemSelection(){
        WebElement Access = driver.findElement(inputPageItemSelecrion);
        assertTrue(Access.isDisplayed());
        assertEquals("Sauce Labs Onesie",Access.getText());
//        System.out.println("Judul pada Item ini adalah=" + Access.getText());
    }

    //For Add Items
    public void userItemOnPageChart(){
        driver.findElement(inputAddToChart).click();
    }

    //For Chart
    public void userInspecItemOnPageChart(){
        driver.findElement(inputListKerang).click();
    }

    public void userOnPageChart() {
        WebElement bses = driver.findElement(inputOnPageChar);
        assertTrue(bses.isDisplayed());
        assertEquals("Your Cart", bses.getText());
//        System.out.println("Judul pada Item ini adalah= " + bses.getText());
    }

    public void userClickCheckout(){
        driver.findElement(inputCheckoutButton).click();
    }

    //For Checkout
    public void userIsOnPageCheckot(){
        WebElement cses = driver.findElement(inputScreenCheckoutPage);
        assertTrue(cses.isDisplayed());
        assertEquals("Checkout: Your Information", cses.getText());
//        System.out.println("Judul pada Item ini adalah= " + cses.getText());

    }

    public void userInputFristNameWith(String NamaPertama){
        driver.findElement(inputFristName).sendKeys(NamaPertama);
    }

    public void userInputLastNameWith(String NamaTerakhir){
        driver.findElement(inputLastName).sendKeys(NamaTerakhir);
    }
    public void userInputZipCodeWith(String ZipCode){
        driver.findElement(inputKodePos).sendKeys(ZipCode);
    }

    public void userClickItemContinue(){
        driver.findElement(inputContinueButton).click();
    }

    public void userIsOnPageCheckoutOverview() {
        WebElement dses = driver.findElement(inputCheckoutOverview);
        assertTrue(dses.isDisplayed());
        assertEquals("Checkout: Overview", dses.getText());
//        System.out.println("Judul pada Item ini adalah= " + dses.getText());
    }

    public void userClickFinish(){
        driver.findElement(inputFinisButton).click();
    }

    public void userIsOnPageCheckoutComplete(){
        WebElement eces = driver.findElement(inputCheckoutComplete);
        assertTrue(eces.isDisplayed());
        assertEquals("Checkout: Complete!", eces.getText());
    }
}
