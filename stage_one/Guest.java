import java.util.Scanner;

public class Guest {
    Scanner surname;
    int bill = 20;
    int days = 0;
    int days2;
    String myObj;
    public Guest() {
        addSurname();
    }

    public void addSurname() {
        surname = new Scanner(System.in);
        System.out.println("Welcome to The Seaview Hotel's online booking system.");
        System.out.println("Enter your full name: ");
        myObj = surname.nextLine();
        System.out.println("Would you like to book a night? Yes or No");
        try (Scanner myobja = new Scanner(System.in)) {
            if ("Yes".equals(myobja.nextLine()) || "yes".equals(myobja.nextLine()) || "Yeah".equals(myobja.nextLine()) || "yeah".equals(myobja.nextLine())) {
                addToBill();
            } else {
            	return;
            }
        }
    }

    public void addToBill() {
        System.out.println("How many nights would you like? (28 days maximum)");
        Scanner daysT = new Scanner(System.in);
        days2 = days2 + daysT.nextInt();
        try (daysT) {
        	if (days2 > 28 || days2 < 1) {
        		System.out.println("Invalid Input.");
        		days2 =0;
        		addToBill();
        	} else {
            bill = bill * days2;
            System.out.println("Perfect.");
            System.out.println("Here is your booking details:");
            System.out.println("Name: " + myObj + ".");
            System.out.println("Length of stay: " + days2 + " days.");
            System.out.println("Total cost: £" + bill + ".");
            return;
        	}
        }
    }

    public void guestName() {
        String myObj = surname.nextLine();
        System.out.println(myObj);
        
    }
    // This -v- needs to be moved to HotelTest.java, try to move all I/O into the
    // test harness which will be in HotelTest.java
}
