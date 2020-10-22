package wpdev.ea.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class SnapComImg {

	public static void snap(WebDriver driver, String xpath, String inputLoc) {
		try {
			WebElement logoImageElement_snap = driver.findElement(By.xpath(xpath));

			Screenshot first_ig_img_snap = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(first_ig_img_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/" + inputLoc));

			File file = new File(System.getProperty("user.dir") + "/forCompareImage/" + inputLoc);

			if (file.exists()) {
				System.out.println("Image File Captured");
			} else {
				System.out.println("Image File NOT exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void comparison(WebDriver driver, String xpath, String inputLoc, String outputLoc) {
		try {
			BufferedImage expectedImage = ImageIO
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/" + inputLoc));

			WebElement logoImageElement_com = driver.findElement(By.xpath(xpath));
			Screenshot first_ig_img_com = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_com);

			ImageIO.write(first_ig_img_com.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/" + outputLoc));
			BufferedImage actualImage = first_ig_img_com.getImage();

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
}
