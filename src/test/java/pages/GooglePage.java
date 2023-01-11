package pages;

public class GooglePage extends BasePage {

	private String searchButton = "//div[@class=\"lJ9FBc\"]//input[@name=\"btnK\"]";
	private String searchTextField = "//input[@title=\"Buscar\"]";
			
	public GooglePage() {
		super(driver);
	}

	public void navigateToGoogle() {
		navigateTo("https://www.google.com/");
	}

	public void clickGoogleSearch() {
		clickElement(searchButton);
	}
	public void enterSearchCriteria(String criteria) {
		write(searchTextField, criteria);
	}
}
