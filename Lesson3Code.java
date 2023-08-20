import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //will take input from customer age
        //if age > 18 we will print - you are adult
        // if age < 18 we will print - you are young.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your age");
//        int age = scanner.nextInt();
//
//        if (age > 18) {
//            System.out.println("you are adult!");
//        } else {
//            System.out.println("you are young");
//        }

        //will take input from the user it will be car speed.
        //if speed is higher than 120 - we will print "too fast"
        //if speed lower than 60 - we will print "too slow"
        //if the speed is between 60 and 120 we will print "good driver!"
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your speed");
//        int speed = scanner.nextInt();
//        if (speed >= 120) {
//            System.out.println("too fast");
//        } else if (speed <= 60) {
//            System.out.println("too slow");
//        } else {
//            System.out.println("good driver!");
//        }
//        if (speed > 60 && speed < 120) {
//            System.out.println("good driver!");
//        } else {
//            System.out.println("bad driver");
//        }

////        Get two ages of two brothers as input
//        For example:
//        Tomer’s age and Dany’s age.
//        If Tomer’s age is higher - print:
//              “Tomer is an older brother”
//        If Dany’s age is higher - print:
//              “Dany is an older brother”
//        If the ages are equal - print:
//          “Tomer and Dany are twins!”

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter age of Dany");
//        int danyAge = scanner.nextInt();
//        System.out.println("enter age of Tomer");
//        int tomerAge = scanner.nextInt();
//        if (danyAge > tomerAge) {
//            System.out.println("Dany is an older brother");
//        } else if (danyAge < tomerAge) {
//            System.out.println("Tomer is an older brother");
//        } else { //dany == tomer
//            System.out.println("Tomer and Dany are twins");
//        }
//        System.out.println("end of the program");
//

//        Ask user to provide the number:
//        If the number is Even :
//        Print “Even”
//        If the number is Odd :
//        Print “Odd”
//        Hint: use modulo
        // number is even if number/2 has remainder = 0
        // number is even if number%2 = 0
        //all other cases the number is odd.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number");
//        int num = scanner.nextInt();
//        if (num%2 == 0) { //the number divided by 2 has no remainder
//            System.out.println("the number is even");
//        } else { //only left case when the number is odd
//            System.out.println("the number is odd");
//        }
        /////Switch CASE/////
        ////////////////////
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number 1 , 2 or 3");
//        // 1 = stone // 2 paper // 3 scissors
//        int number = scanner.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("stone");
//                break;
//            case 2:
//                System.out.println("paper");
//                break;
//            case 3:
//                System.out.println("scissors");
//                break;
//            default:
//                System.out.println("you entered not correct number");
//        }
//        Take from the user number from 1 to 7 it is a day of the week:
//        If input = 1 print :
//          “Sunday”
//        If input 5 print:
//              “Thursday”
//        If input 7 print:
//              “ Saturday”
//        If number not 1 - 7 print:
//              “Not a good number”

//          if (number == 1){
//              System.out.println("stone");
//          } else if (number == 2) {
//              System.out.println("paper");
//          } else if (number == 3) {
//              System.out.println("scissors");
//          } else {
//              System.out.println("you entered not correct number");
//          }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1 to 7");

        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("you entered not correct number");
        }

    }
}
