package org.flip.test;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlpkartPom extends BaseClass{
	
	public FlpkartPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	@FindBy(xpath="//input[@type='text']")
	private WebElement txtTtext;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSearch;
	@FindBy(xpath="//div[@class='_4rR01T']")
	private WebElement iPhone;
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private WebElement rate;
	
	
	public WebElement getClose() {
		return close;
	}
	public WebElement getTxtTtext() {
		return txtTtext;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	

	
}
