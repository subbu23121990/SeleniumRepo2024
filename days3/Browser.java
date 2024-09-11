package week1.days3;

public class Browser {

	public String launchBrowser(String browserName) {
	return browserName;
	}   
	
	public void launchBrowser1(String browserName)
	{
		System.out.println("Browser launched successfully1");
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
	
		Browser browser=new Browser();
		System.out.println(browser.launchBrowser("Browser launched successfully"));
		
		browser.launchBrowser("Browser launched successfully");
		browser.loadUrl();
		
		
	}

}
