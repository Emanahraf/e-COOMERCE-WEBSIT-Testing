package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
     WebDriver driver;

    public CategoryPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="//li[@class=\"inactive\"]//a[@href=\"/shoes\"]")
    public
    WebElement shoes;

    @FindBy(id="attribute-option-14")
    public
    WebElement garycolor;
    @FindBy(xpath = "//li//a[@href=\"/apparel-2\"]")
    WebElement Tag1;
    @FindBy(xpath = "//li//a[@href=\"/book\"]")
    WebElement Tag2;
    @FindBy(xpath = "//li//a[@href=\"/awesome\"]")
    WebElement Tag3;
    @FindBy(xpath = "//li//a[@href=\"/computer\"]")
    public
    WebElement Tag4;
    @FindBy(xpath = "//div//h1")
    WebElement Header;

}
