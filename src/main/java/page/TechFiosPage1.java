package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class TechFiosPage1 {
	WebDriver driver;

	@FindBy(how = How.CSS, using = "input[name='allbox']")
	WebElement Toggle_All_Element;

	@FindBy(how =How.CSS, using="input[name^='todo']") 
	List<WebElement> listItemsCheckboxes;
	
	@FindBy(how =How.CSS, using="li") 
	List<WebElement> listItems;
	
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement RemoveButton_element;

	public TechFiosPage1(WebDriver driver) {
		this.driver = driver;
	}

	public void selectToggleAll() {
		Toggle_All_Element.click();
		System.out.println("Selection has been Done");
	}
	public void validateToggleAllAndListItemsChecked() {
	 
		boolean toggleSelected=Toggle_All_Element.isSelected();
		if(toggleSelected == true) {
			System.out.println("toggle all is selected");
		}
		else {System.out.println("toggle all is not selected");}
		
		List<WebElement> item= listItemsCheckboxes;
		
		for(WebElement itemcheckbox : item) {
			
		boolean selectedcheckboxlist=	itemcheckbox.isSelected();
		if(selectedcheckboxlist==true) {
			System.out.println(" list items is selected");}
		else {System.out.println(" list items is not selected");}
		}
}


		public void removeSingleItem() {
		List<WebElement> singleItemList=listItemsCheckboxes;
		for(WebElement oneItem : singleItemList) {oneItem.click();}
	
		RemoveButton_element.click();
		
	}
		public void validateRemoveSingleItem() {
		List<WebElement> removeitem=listItems;
		for(WebElement deleteItem:removeitem) {
		boolean validateremove=deleteItem.isDisplayed();
		if(validateremove==true) {System.out.println("the item has been deleted");}
		else {System.out.println("the item has not been deleted");
	}
		}

}
public void validateAllListItemCanBeDeletedWhenToggleAllIsOn() {
	selectToggleAll();
	RemoveButton_element.click();
	validateRemoveSingleItem();
			
		}

}
