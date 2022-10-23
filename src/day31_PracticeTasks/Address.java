package day31_PracticeTasks;

public class Address {

    public int buildingNumber;
    public String street, city,state;

    public String zipcode;

    public Address(int buildingNumber, String street, String city, String state, String zipcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }


    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipcode;
    }
}

/*
2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */