package day36_PracticeTasks.bookTask;

public class AudioBook extends Book{

    public String length, narrator;

    public void setInfo(String length, String narrator) {
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("Listening to "+title);
    }
}
/*
3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */