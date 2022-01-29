package stage_one;

public class RoomOne {
    Guest[] bookings;

    public static void main(String[] args) {

        var myObj = new Guest();
        System.out.println("Your total bill is: " + myObj.bill);
        System.out.println("For " + myObj.days + " days");
    }
}
