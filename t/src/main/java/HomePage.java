import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Currency;

public class HomePage {
    WebDriver driver;
    public HomePage( WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="small-searchterms")
    WebElement Search;
    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    WebElement SearchBtn;
    @FindBy(xpath = "//li[@class=\"ui-menu-item\"]//a//span")
   WebElement searchItem;
@FindBy(linkText = "Euro")
    WebElement ChangeCurrency;
@FindBy(xpath = "//select[@id=\"customerCurrency\"]")
    WebElement currentCurrency;
@FindBy(css = "a[href=\"/computers\"]")
    WebElement cat1;
    @FindBy(css = "a[href=\"/electronics\"]")
    WebElement cat2;
    @FindBy(css = "a[href=\"/apparel\"]")
    WebElement cat3;
    @FindBy(css = "a[href=\"/digital-downloads\"]")
    WebElement cat4;

    @FindBy(css = "a[href=\"/books\"]")
    WebElement cat5;
    @FindBy(css = "a[href=\"/jewelry\"]")
    WebElement cat6;

    @FindBy(css = "a[href=\"/jewelry\"]")
    WebElement cat7;
    @FindBy(css = "a[href=\"/gift-cards\"]")
    WebElement cat8;
    //catagroy page

    @FindBy(xpath = "//div[@class=\"filter-content\"]//li[@class=\"item color-item\"]")
    WebElement graycolor;

    //


    @FindBy(xpath = "(//div[@class=\"details\"]//div[@class=\"buttons\"]//button[@class=\"button-2 add-to-wishlist-button\"])[3]")
    WebElement AddToWish;
    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addTowishmsg;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")
    WebElement AddToCart1;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")
    WebElement AddToCart2;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")
    WebElement AddToCart3;
    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addTocartmsg;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-wishlist-button\"])[1]")
    WebElement AddToWish1;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-compare-list-button\"])[1]")
    WebElement AddToCompare1;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-wishlist-button\"])[2]")
    WebElement AddToWish2;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-compare-list-button\"])[2]")
    WebElement AddToCompare2;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-wishlist-button\"])[3]")
    WebElement AddToWish3;
    @FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-compare-list-button\"])[3]")
    WebElement AddToCompare3;
    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addToWishmsg;
    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addToComparemsg;
    @FindBy(css = "a[class=\"ico-cart\"]")
    WebElement CartIcon;
    @FindBy(xpath = "//p[@class=\"content\"]//a")
    WebElement CartIcon2;

//cat page
@FindBy(id="attribute-option-14")
WebElement garycolor;
    @FindBy(xpath = "//li//a[@href=\"/apparel-2\"]")
    WebElement Tag1;
    @FindBy(xpath = "//li//a[@href=\"/book\"]")
    WebElement Tag2;
    @FindBy(xpath = "//li//a[@href=\"/awesome\"]")
    WebElement Tag3;
    @FindBy(xpath = "//li//a[@href=\"/computer\"]")
    WebElement Tag4;
    @FindBy(xpath = "//div//h1")
    WebElement Header;



}


