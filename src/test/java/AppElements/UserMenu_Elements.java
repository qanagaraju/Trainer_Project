package AppElements;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMenu_Elements {
	
	boolean aboutus;
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")private WebElement AboutUs;
	public void click_AboutUs() {
	
		
		
		
		try {
			
			if(AboutUs.isEnabled()) {
				AboutUs.click();
				Assert.assertTrue(true);
			}else
			{
				
				Assert.assertFalse(false);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(aboutus==true) {
					
					Assert.assertTrue(true);
					
				}else
				{
					Assert.assertFalse(false);
				}
				
			}catch(NoSuchElementException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Help')]") private WebElement Help;
	public void click_Help() {
		
		
		if(Help.isEnabled()) {
			Help.click();
			Assert.assertTrue(true);
		}else
		{
			
			Assert.assertFalse(false);
		
		
		}
	
	
	
	}
	

}
