package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="small-searchterms")
    public
    WebElement Search;
    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    WebElement SearchBtn;
    @FindBy(xpath = "//li[@class=\"ui-menu-item\"]//a//span")
    public
    WebElement searchItem;
@FindBy(linkText = "Euro")
    WebElement ChangeCurrency;
@FindBy(xpath = "//select[@id=\"customerCurrency\"]")
public
WebElement currentCurrency;
@FindBy(css = "a[href=\"/computers\"]")
public
WebElement cat1;
    @FindBy(xpath ="//ul[@class=\"top-menu notmobile\"]//a[@href=\"/desktops\"]")
    public
    WebElement subcat1;
@FindBy(css="a[href=\"/apparel\"]")
public
WebElement cat3;

// catagroy pae
@FindBy(xpath="//li[@class=\"inactive\"]//a[@href=\"/shoes\"]")
WebElement shoes;
//add to cart Button
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")
WebElement AddToCart1;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")
WebElement AddToCart2;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")
public
WebElement AddToCart3;
@FindBy(xpath = "//p[@class=\"content\"]")
public
WebElement addTocartmsg;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-wishlist-button\"])[1]")
public
WebElement AddToWish1;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-compare-list-button\"])[1]")
WebElement AddToCompare1;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-wishlist-button\"])[2]")
WebElement AddToWish2;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-compare-list-button\"])[2]")
WebElement AddToCompare2;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-wishlist-button\"])[3]")
public
WebElement AddToWish3;
@FindBy(xpath = "(//div[@class=\"details\"]//button[@class=\"button-2 add-to-compare-list-button\"])[3]")
public
WebElement AddToCompare3;
@FindBy(xpath = "//p[@class=\"content\"]")
WebElement addToWishmsg;
@FindBy(xpath = "//p[@class=\"content\"]")
WebElement addToComparemsg;
    @FindBy(css = "a[class=\"ico-cart\"]")
    WebElement CartIcon;
    @FindBy(xpath = "//p[@class=\"content\"]//a")
    public
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
public
WebElement Header;

}


