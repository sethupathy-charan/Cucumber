package org.helper;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static String l;
	public static String s;
	public static Select sl;
	

public static void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\SeleniumTasks\\drivers\\chromedriver.exe");
	new ChromeDriver();
}
public static void chromeBrowser()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}


//WebDriver Methods=======================
public static void launchUrl(String url)
{
	driver.get(url);
	System.out.println(url);
}
public static void maxWindow()
{
	driver.manage().window().maximize();
}
public static void pageTitle()
{
	String title=driver.getTitle();
	System.out.println(title);
}
public static String pageUrl()
{
	return driver.getCurrentUrl();
}
public static void quitBrowser()
{
	driver.quit();
}
public static void close()
{
	driver.close();
}

//Locators========================
public static WebElement findById(String i)
{
	return driver.findElement(By.id(i));
}
public static WebElement findByName(String n)
{
	return driver.findElement(By.name(n));
}
public static WebElement findByClass(String c)
{
	return driver.findElement(By.className(c));
}
public static WebElement findByXpath(String c)
{
	return driver.findElement(By.xpath(c));
}

//Actions Class===================================================
public static void moveToElement(WebElement e)
{
	a=new Actions(driver);
	a.moveToElement(e).perform();
}
public static void dragAndDrop(WebElement src, WebElement des )
{   
	a=new Actions(driver);
	a.dragAndDrop(src, des).perform();
}
public static void clickDouble()
{
	a=new Actions(driver);
	a.doubleClick().perform();
} 
public static void rightClick()
{
	a=new Actions(driver);
	a.contextClick().perform();
}
public static void keyUp(CharSequence ky)
{
	a=new Actions(driver);
	a.keyUp(ky);
}
public static void keyDown(CharSequence dn)
{
	a=new Actions(driver);
	a.keyDown(dn);
}

//Robot Class====================================
public static void copy() throws AWTException
{
	 r=new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_C);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_C);
	}
public static void paste() throws AWTException
{
	 r=new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_V);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_V);
	}

//JavascriptExecutor==============================
public static void scrollDown(WebElement bottom)
{
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", bottom);
}
public static void scrollUp(WebElement top)
{
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", top);
}
public static void fillTxt(String s, WebElement w)
{
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value', 's')", w);
}
public static void getTxt(WebElement w)
{
	js=(JavascriptExecutor) driver;
	js.executeScript("return arguments[0].getAttribute('value')", w);
}

//Screenshot==========================================
public static void screenshot() throws IOException
{
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Charan\\Pictures");
	FileUtils.copyFile(src, des);
}

//Navigate Commands=========================
public static void navigateB(String url)
{
	driver.navigate().to(url);
}
public static void navigateBack()
{
	driver.navigate().back();
}
public static void navigateForward()
{
	driver.navigate().forward();
}
public static void navigateRefresh()
{
	driver.navigate().refresh();
}

//WebElement Methods===========================================
public static void fillTextbox(WebElement ref,String value)
{
	ref.sendKeys(value);
}
public static void btnClick(WebElement element)
{
	element.click();	
}public static void text(WebElement txt)
{	
	txt.getText();
}
public static void Attribute(WebElement at, String att)
{	
	at.getAttribute(att);
}
public static void cssValue(WebElement elem, String s)
{
	elem.getCssValue(s);
}
public static void isDisplayed()
{
	isDisplayed();
}
public static void isEnabled()
{
	isEnabled();
}
public static void isSelected()
{
	isSelected();
}

//Drop Down==============================================
public static void selectByIndex(WebElement w, int i)
{
	sl=new Select(w);
	sl.selectByIndex(i);
	
}
public static void selectByVisibleText(WebElement w, String i)
{
	sl=new Select(w);
	sl.selectByVisibleText(i);
}
public static void selectByValue(WebElement w, String i)
{
	sl=new Select(w);
	sl.selectByValue(i);
}
public static void isMultiple(WebElement w)
{
	sl=new Select(w);
	sl.isMultiple();
}
public static void getOptions(WebElement w)
{
	sl=new Select(w);
	sl.getOptions();
}
public static void getAllSelectedOption(WebElement w, String i)
{
	sl=new Select(w);
	sl.getAllSelectedOptions();
}
public static void getFirstSelectedOption(WebElement w, String i)
{
	sl=new Select(w);
	sl.getFirstSelectedOption();
}
public static void deselectByIndex(WebElement w, int i)
{
	sl=new Select(w);
	sl.deselectByIndex(i);
}
public static void deselectByVisibleText(WebElement w, String i)
{
	sl=new Select(w);
	sl.deselectByVisibleText(i);
}
public static void deselectByValue(WebElement w, String i)
{
	sl=new Select(w);
	sl.deselectByValue(i);
}
public static void deselectAll(WebElement w)
{
	sl=new Select(w);
	sl.deselectAll();
}

//Alert Interface==================================
public static void accept()
{
	Alert a = driver.switchTo().alert();
	a.getText();
}
public static void dismiss()
{
	Alert a = driver.switchTo().alert();
	a.getText();
}
public static void sendKeys()
{
	Alert a = driver.switchTo().alert();
	a.getText();
}
public static void getText()
{
	Alert a = driver.switchTo().alert();
	a.getText();
}

//Frames===========================================
public static void frameByIdAndName(String s)
{
	driver.switchTo().frame(s);
}
public static void frameByIndex(int in)
{
	driver.switchTo().frame(in);
}
public static void frameByElement(WebElement w)
{
	driver.switchTo().frame(w);
}
public static void parentFrame()
{
	driver.switchTo().defaultContent();
}

//Waits===================================================
//Unconditional Wait------------
public static void sleep() throws InterruptedException
{
	Thread.sleep(5000);
}

//Conditional Wait------------
//1.Implicit Wait+++
public static void implicitWait(int i)
{
	driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
}

//2.Explicit Wait+++
//WebDriver Wait Methods***
public static void alertIsPresent(int i)
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.alertIsPresent());
}
public static void elementSelectionStateToBe(int i, WebElement e, boolean b) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.elementSelectionStateToBe(e, b));
}
public static void elementToBeClickable(int i, WebElement e) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.elementToBeClickable(e));
}
public static void elementToBeSelected(int i, WebElement e) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.elementToBeSelected(e));
}
public static void textToBePresentInElement(int i, WebElement e, String s) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.textToBePresentInElement(e,s));
}
public static void textToBePresentInElementValue(int i, WebElement e, String s ) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.textToBePresentInElementValue(e,s));
}
public static void titleIs(int i, String s) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.titleIs(s));
}
public static void titleContains(int i, String s) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.titleContains(s));
}
public static void visibilityOf(int i,  WebElement e) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.visibilityOf(e));
}
public static void visibilityOfAllElements(int i) 
{
	WebDriverWait w =new WebDriverWait(driver, i);
	w.until(ExpectedConditions.visibilityOfAllElements());
}

public static void createExcel() throws IOException {
	
	
	File f=new File(l);
	Workbook book=new XSSFWorkbook();
	Sheet sh=book.createSheet(s);
	
	Row r;
	
	for (int i = 0; i <= 100 ; i++) {
		 r=sh.createRow(i);
	for (int j = 0; j <= 100; j++) {
		r.createCell(j);
	}
	}
	FileOutputStream fout=new FileOutputStream(f);
	book.write(fout);
}

public static void createSheet(String she) throws IOException {
	
	
	File f=new File(l);
	FileInputStream fin=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(fin);
	Sheet sh=book.createSheet(she);
	
	Row r;
	for (int i = 0; i <= 100 ; i++) {
		 r=sh.createRow(i);
	for (int j = 0; j <= 100; j++) {
		r.createCell(j);
	}
	}
	OutputStream fout=new FileOutputStream(f);
	book.write(fout);
}

public static void editExcel(int rowNo, int cellNo, String val)throws IOException 
	 {
	File f=new File(l);
	FileInputStream fin=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(fin);
	Sheet sh=book.getSheet(s);
	Row r=sh.getRow(rowNo);
	Cell c=r.getCell(cellNo);
	c.setCellValue(val);
	OutputStream fout=new FileOutputStream(f);
	book.write(fout);
	}

public static String readExcel(int rowNo, int cellNo) throws IOException 
{
	File f=new File(l);
	FileInputStream fin = new FileInputStream(f);
	Workbook book= new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(s);
	Row r = sh.getRow(rowNo);
	Cell c = r.getCell(cellNo);
			
			int type = c.getCellType();
			
			String data;
			if(type==1) {
				data = c.getStringCellValue();
			}
			else if(DateUtil.isCellDateFormatted(c)) {
				Date date=c.getDateCellValue();
				SimpleDateFormat form=new SimpleDateFormat("dd/MM/yyy");
				data = form.format(date);
			}
			else {
				double d=c.getNumericCellValue();
				long lo=(long) d;
				data = String.valueOf(lo);
			}
		return data;
}
public static void file(String loc)
{
	l=loc;
	
}
public static void Sheet(String sh)
{
	s=sh;
}
public static void dateAndTime() {
	Date d=new Date();
	System.out.println(d);
	

}
	
}






