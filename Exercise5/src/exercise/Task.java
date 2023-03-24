package exercise;

public class Task {
	public static void main(String[] args) {
		Browser browser = new Browser();
		
		Browser.BookMarks bookMark = browser.new BookMarks();
		
		bookMark.addBookMark("www.google.com");
		bookMark.addBookMark("www.facebook.com");
		
		bookMark.displayBookMarks();
		
		browser.shortcuts.addShortcut("www.apple.com");
		browser.shortcuts.addShortcut("www.zoho.com");
		
		System.out.println("\nshortcuts ");
		browser.shortcuts.displayShortcuts();
		
		System.out.println("\nhistory");
		Browser.History.addUrl("www.amazon.com");
		Browser.History.displayHistory();
	}
}
