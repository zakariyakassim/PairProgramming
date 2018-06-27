package pairprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class PairProgramming {

    static Scanner input = new Scanner(System.in);

    public static boolean isInteger(Object object) {
        if (object instanceof Integer) {
            return true;
        } else {
            String string = object.toString();

            try {
                Integer.parseInt(string);
            } catch (Exception e) {
                return false;
            }
        }

        return true;
    }

    public static String factorials(String numberRef) {

        if (PairProgramming.isInteger(numberRef)) {

            if (Integer.parseInt(numberRef) < 1) {
                return "This number is not a factorial number!";
            }

            double number = Double.parseDouble(numberRef);
            int count = 0;
            int division = 1;

            for (int i = 0; i < Integer.parseInt(numberRef); i++) {
                if (number != 1) {
                    number = number / division;
                    division++;
                    count++;

                    /*  System.out.println("Number: "+number);
                System.out.println("Count: "+count);
                System.out.println("Division: "+division);
                System.out.println("--------------------"); */
                    //  System.out.println("");
                } else {
                    break;
                }

                if (number < 1) {
                    return "This number is not a factorial number!";
                }

            }

            System.out.println("");

            return "Factorial of " + numberRef + " is " + count + "!";

        } else {

            return "It's not a number.";

        }

    }

    public static void runFactorial() {

        while (true) {

            System.out.println("Enter a factorial number: ");
            System.out.println("");
            String number = input.next();

            System.out.println("");
            System.out.println(PairProgramming.factorials(number));
            System.out.println("");

        }
    }

    public static ArrayList<String> doggoCompetition(int places, int position) {

        ArrayList<String> positions = new ArrayList<>();

        // String userPosition = position+PairProgramming.suffixOfNumber(position);
        for (int i = 1; i < places + 1; i++) {

            if (i != position) {
                positions.add(i + PairProgramming.suffixOfNumber(i) + ", ");
            }

        }

        
        positions.set(positions.size()-1, positions.get(positions.size()-1).replace(",", ""));
        
        return positions;
    }

    public static String suffixOfNumber(int number) {

        if (number >= 11 && number <= 13) {
            return "th";
        }

        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }

    }

    public static void runDoggoCompetition() {

        ArrayList<String> positions = new ArrayList<>();

        System.out.println("Enter amount of positions: ");
        System.out.println("");
        int positionAmount = input.nextInt();
        System.out.println("");
        System.out.println("Enter your position: ");
        int userPosition = input.nextInt();

        System.out.println("");

        positions = PairProgramming.doggoCompetition(positionAmount, userPosition);
        
        int row = 10;

        String data = "";
        
        for (int i = 0; i < positions.size(); i++) {
            if (i == row) {
                 System.out.println("");
                 row = row+10;
            }
           // System.out.println("f "+i);
          
              System.out.print(positions.get(i));
              // System.out.print(String.format("%5d", positions.get(i)));
               
               
           
            
        }
        
        System.out.println("");
        System.out.println("");

    }

    public static void main(String[] args) {

        // PairProgramming.runFactorial();
        PairProgramming.runDoggoCompetition();

        //  System.out.println(  PairProgramming.suffixOfNumber(10));
    }

}
