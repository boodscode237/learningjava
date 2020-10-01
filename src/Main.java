import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 15;
        double GPA = 3.45;
        char firstInitial = 'A';
        String LastName = "Hon";
        char lastInitial = LastName.charAt(0);
        boolean hasPerfectAttendance = true;
        String FirstName = "Abel";


        System.out.println(FirstName + " " + LastName + " has a GPA of" + " " +GPA);
        System.out.println("what do you want to update it to?");

        Scanner input = new Scanner(System.in);
        GPA = input.nextDouble();

        System.out.println(FirstName + " " + LastName + "now has a GPA of" + " " +GPA);
    }
}

