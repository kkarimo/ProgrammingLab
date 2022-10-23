package day36_PracticeTasks.phoneTask;

public class IPhone extends Phone {

    public void faceTime(long phoneNumber) {
        System.out.println(brand +  " is facetiming " + phoneNumber);
    }


    public void faceTime(String email) {
        System.out.println(brand +  " is facetiming with email " + email);
    }

}
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */