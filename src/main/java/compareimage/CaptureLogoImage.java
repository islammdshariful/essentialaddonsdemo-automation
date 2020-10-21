package compareimage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;


public class CaptureLogoImage {
	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void openPage() {
		driver.get("https://essential-addons.com/elementor/team-members/");
	}

	public void takeScreenshoot() {
		try {
			
			WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"eael-team-member-1c4475c9\"]/div/div[1]/figure/img"));
			Screenshot logoImageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, logoImageElement);
			ImageIO.write(logoImageScreenshot.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/icon.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/icon.png");

			if (file.exists()) {
				System.out.println("Image File Captured");
			} else {
				System.out.println("Image File NOT exist");
			}

			Thread.sleep(5000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		CaptureLogoImage snapshot = new CaptureLogoImage();
		snapshot.invokeBrowser();
		snapshot.openPage();
		snapshot.takeScreenshoot();

	}
}