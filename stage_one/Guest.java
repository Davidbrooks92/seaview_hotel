package stage_one;

public class Guest {
    String surname = "";
    int bill;

    public Guest() {
        bill = 0;
    }

    public void guestName() {
        String printName = surname;
        System.out.println(printName);
    }

    public static void Guest(String[] args) {
        Guest myObj = new Guest();
        System.out.println(myObj.bill);
    }
}
