package stage_one;

import java.util.Scanner;

public class Guest {
    Scanner surname;
    int bill = 20;
    int days;

    public Guest() {
        addSurname();
    }

    public void addSurname() {
        surname = new Scanner(System.in);
        System.out.println("Enter a Surname: ");
        String myObj = surname.nextLine();
        System.out.println("Surname is: " + myObj);
        System.out.println("Would you like to book a night? Yes or No");
        Scanner myobja = new Scanner(System.in);
        if ("Yes".equals(myobja.nextLine())) {
            addToBill();
        }
    }

    public void addToBill() {
        System.out.println("How many nights would you like? (28 days maximum)");
        Scanner daysT = new Scanner(System.in);
        bill = bill * daysT.nextInt();
    }

    public void guestName() {
        String myObj = surname.nextLine();
        System.out.println(myObj);
    }
    // This -v- needs to be moved to HotelTest.java, try to mve all I/O into the
    // test harness which will be in HotelTest.java

    public static void main(String[] args) {

        Guest myObj = new Guest();
        System.out.println("Your total bill is: " + myObj.bill);
        System.out.println("For " + myObj.days + " days");
    }
}
