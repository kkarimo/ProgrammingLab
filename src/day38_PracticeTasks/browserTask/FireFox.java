package day38_PracticeTasks.browserTask;

public class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }
}
/*
2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"

 */