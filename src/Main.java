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

        Scanner input = new Scanner(System.in);

        String question1 = "What iam I from?";
        String choice1 = "Russia";
        String choice2 = "Belarus";
        String choice3 = "Indonesia";

        String question2 = "Are you me?";
        String choice1a = "maybe";
        String choice2b = "yeah";
        String choice3c = "Interesting";

        String question3 = "Are you you?";
        String choice1d = "maybe";
        String choice2e = "yeah";
        String choice3f = "Interesting";



        String correct1 = choice2;
        String correct2 = choice2b;
        String correct3 = choice2e;
        System.out.println(question1);
        String userAnswer1 = input.next();
        System.out.println(question2);
        String userAnswer2 = input.next();
        System.out.println(question3);
        String userAnswer3 = input.next();

        if (userAnswer1 == correct1 && userAnswer2 == correct2 && userAnswer3==correct3){
            System.out.println("perfect answers");
        } else if (userAnswer1!=correct1){
                System.out.println("Answer to question 1 is " + correct1);
        }
        else if (userAnswer2!=correct2){
            System.out.println("Answer to question 2 is " + correct2);
        }else if (userAnswer3!=correct3){
            System.out.println("Answer to question 3 is " + correct3);
        }
    }
}

