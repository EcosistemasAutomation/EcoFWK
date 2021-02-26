package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageEnd2End {

	public PageEnd2End(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	// FIND BY HOW AND USING
	@FindBy(how=How.CSS,using=".noo-product-inner")
	private List<WebElement> lstCard;
	// USE DEFINED ELEMENT
	public void select_Card(int index) {
		lstCard.get(index).click();}

	
}
