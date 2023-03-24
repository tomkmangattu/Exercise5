package exercise;

import java.util.ArrayList;

public class Browser {
	private ArrayList<String> urlList;
	
	Browser(){
		urlList = new ArrayList<>();
	}
	
	void addUrl(String url) {
		urlList.add(url);
	}
	
	class BookMarks{
		private ArrayList<String> bookMarks;
		
		BookMarks(){
			bookMarks = new ArrayList<>();
		}
		
		void addBookMark(String url) {
			bookMarks.add(url);
		}
		
		void displayBookMarks() {
			for(String bookMark : bookMarks) {
				System.out.println(bookMark);
			}
		}
	}
	
	Shortcuts shortcuts = new Shortcuts() {
		ArrayList<String> shortcutsList = new ArrayList<>();
		
		@Override
		public void addShortcut(String url) {
			shortcutsList.add(url);
		}
		
		@Override
		public void displayShortcuts() {
			for(String url : shortcutsList) {
				System.out.println(url);
			}
		}
	};
	
	public static class History{
		static ArrayList<String> historyList = new ArrayList<>();
		
		
		static void addUrl(String url) {
			historyList.add(url);
		}
		
		static void displayHistory() {
			for(String url : historyList) {
				System.out.println(url);
			}
		}
	}
}
