import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int age = 15;
//        double GPA = 3.45;
//        char firstInitial = 'A';
//        String LastName = "Hon";
//        char lastInitial = LastName.charAt(0);
//        boolean hasPerfectAttendance = true;
//        String FirstName = "Abel";
//
//
//        System.out.println(FirstName + " " + LastName + " has a GPA of" + " " +GPA);
//        System.out.println("what do you want to update it to?");
//
//        Scanner input = new Scanner(System.in);
//        GPA = input.nextDouble();
//
//        System.out.println(FirstName + " " + LastName + "now has a GPA of" + " " +GPA);

//        System.out.println("pick a number between 1 and 10");
//        Scanner scanner = new Scanner(System.in);
//        int inputtedNum = scanner.nextInt();
//        if (inputtedNum < 5){
//            System.out.println("Enjoy the good luck a friend brings you");
//        } else{
//            System.out.println("Your shoe selection will make you very happy today");
//        }

//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while (isOnRepeat){
//            System.out.println("Playing the current song");
//            System.out.println("Will you like to play this song off of repeat? If so, answer yes");
//            String userInput = input.next();
//
//            if (userInput.equals("yes")){
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("Play next song");

        Scanner scanner = new Scanner(System.in);

        String question = "What iam I from?";
        String choice1 = "Russia";
        String choice2 = "Belarus";
        String choice3 = "Indonesia";




        String correct = choice2;
        System.out.println(question);
        String input = scanner.next();

        if (correct.equals(input.toLowerCase())){
            System.out.println("perfect answers");
        } else {
                System.out.println("Answer to question  is " + correct);
        }
    }
}

