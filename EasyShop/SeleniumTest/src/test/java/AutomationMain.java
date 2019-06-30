import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.prgs.automation.shool.AutomationFramework;

public class AutomationMain {

	public static void main(String[] args) throws InterruptedException {
		AutomationFramework framework = new AutomationFramework();
		
		String baseUrl = "http://localhost:8080/classrooms";
		WebDriver driver = framework.launchBrowser(baseUrl);

        
        String expectedTitle = "Classrooms list";
        String actualTitle = "";

        // launch Browser and direct it to the Base URL

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title matched!");
        } else {
            System.out.println("Title doesnt match");
        }
        
        List<WebElement> linksToClasses = driver.findElements(By.tagName("a"));
        
        if(linksToClasses.size() == 4) {
        	System.out.println("Test passed: found 4 classes");
        } else {
        	System.out.println("Test failed: class count is not 4");
        }
        Thread.sleep(4000);

        linksToClasses.get(0).click();
        WebElement classDescription = driver.findElement(By.tagName("p"));
        String description = classDescription.getText();
        
        System.out.println("Class description:"+ description);
        
        Thread.sleep(5000);
        
        framework.close();
	}


}