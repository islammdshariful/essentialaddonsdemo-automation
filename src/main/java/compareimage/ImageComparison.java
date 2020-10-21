package compareimage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.eaTestimonialsUtils;

public class ImageComparison {
	
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
		driver.get("https://essential-addons.com/elementor/testimonials/");
	}
	
	public  void comparison() {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1166)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			WebElement logoImageElement_snap = driver
//					.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_image_xpath));
			
			Screenshot logoImageScreenshot_snap = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(logoImageScreenshot_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/icon.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/icon.png");

			if (file.exists()) {
				System.out.println("Image File Captured");
			} else {
				System.out.println("Image File NOT exist");
			}

			BufferedImage expectedImage = ImageIO
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/icon.png"));

//			WebElement logoImageElement_com = driver
//					.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
			WebElement logoImageElement_com = driver
					.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_image_xpath));
			Screenshot logoImageScreenshot_com = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, logoImageElement_com);
			BufferedImage actualImage = logoImageScreenshot_com.getImage();

			ImageDiffer imgDiff = new ImageDiffer(); // A special class to compare images
			ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
			if (diff.hasDiff() == true) {
				System.out.println("Images are NOT Same");
			} else {
				System.out.println("Images are Same");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
    public static void main(String args[]) {
    	
    	ImageComparison compare = new ImageComparison();
    	compare.invokeBrowser();
    	compare.openPage();
    	compare.comparison();
    	
    }
}