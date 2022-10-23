package day36_PracticeTasks.bookTask;

public class EBook extends Book{

    public String size;
    public int pages;

    public void setInfo(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("Reading" + title);
    }

}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */