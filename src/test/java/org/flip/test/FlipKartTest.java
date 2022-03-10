package org.flip.test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipKartTest extends BaseClass{
	
	public static void main(String[] args) {
		browserLaunch("chrome");
		implicitWait(10);
		maximise();
		getUrl("https://www.flipkart.com/");
		FlpkartPom f = new FlpkartPom();
		click(f.getClose());
		sendKeys(f.getTxtTtext(),"iphone");
		click(f.getBtnSearch());
		
		List <WebElement>iPhone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement  x:iPhone) {
			String text = x.getText();
			System.out.println(text);
		}
		List<WebElement> rate = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        System.out.println("first price "+rate.get(0).getText());
        int size = rate.size();
        System.out.println("last prize "+rate.get(size-1).getText());
        Set <String> s= new TreeSet<String>();
        for(WebElement x:rate) {
        	String text = x.getText();
        	s.add(text);
        }
		for(String x:s) {
			System.out.println(x);
		}
		for(int i=0;i<iPhone.size();i++) {
			WebElement x = iPhone.get(i);
					String text1 = x.getText();
			WebElement y = rate.get(i);
			        String text2 = y.getText();
			System.out.println(text1+" = "+text2);
		}
       quit();
	}
}
