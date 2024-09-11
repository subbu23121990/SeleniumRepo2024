package week1.days3;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browser =new Browser();
		
		System.out.println(browser.launchBrowser("Browser launched successfully"));
		browser.launchBrowser1("chrome");
		browser.loadUrl();

	}

}
