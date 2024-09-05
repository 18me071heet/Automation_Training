package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class incognito_practise {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13780557643146505510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9154062&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
	}

}
