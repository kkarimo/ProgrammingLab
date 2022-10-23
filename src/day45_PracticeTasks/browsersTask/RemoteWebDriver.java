package day45_PracticeTasks.browsersTask;

public class RemoteWebDriver implements TakeScreenShot, JavaScriptExecuter{

    private final String browserName = "Chrome";

    public RemoteWebDriver() {
    }

    public String getBrowserName() {
        return browserName;
    }

    @Override
    public String executeScript(String script) {
        return null;
    }

    @Override
    public void takeScreenShot() {

    }
}
/*
5. Create a class named RemoteWebDriver that implements WebDriver, TakeScreenShot, and JavaScriptExecuter Interface:
				Variables:
					browserName (final)

				Encapsulate all the fields

				Add Constructor that can set the fieled and displays the following message:
							"Opening "+ browserName+" browser"

				Overridden methods and their implementations:
						get(String url):
								"Getting the "+url+" on " + browserName + " browser"

						findElement(String locator):
								browserName+" driver locating an element by " + locator

						findElements(String locator):
								browserName+" driver locating multiple elements by " + locator

						close():
							"Closing the tab on "+browserName+" browser"

						quit():
							"Quitting the "+browserName+" browser"

						getTitle():
							browserName + "driver is getting the title"

						takeScreenShot():
							"Taking screenshot on: " + browserName + " browser"

						executeScript(String script):
							"Executing \"" + script + "\" script on" + browserName +" browser"
 */