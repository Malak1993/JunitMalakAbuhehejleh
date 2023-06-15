package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechFiosPage1;
import util.BrowserFactory;

public class TechFiosPage1Test {

	WebDriver driver;

	@Test
	public void userShouldBeAbleToClickOnToggleAll() {

		driver = BrowserFactory.init();

		TechFiosPage1 tfpage = PageFactory.initElements(driver, TechFiosPage1.class);
//tfpage.selectToggleAll();
//tfpage.validateToggleAllAndListItemsChecked();
		tfpage.removeSingleItem();
		tfpage.validateRemoveSingleItem();

		
		
		
//		driver=BrowserFactory.tearDown();
	}
}