package Basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("driver,edge.driver", "./SeleniumProject/sdriver/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.youtube.com/watch?v=LSAmtc__HFY");
		driver.close();
		
	}

}
