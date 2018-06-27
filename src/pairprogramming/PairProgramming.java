package pairprogramming;

import java.util.ArrayList;
import java.util.HashMap;
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

        positions.set(positions.size() - 1, positions.get(positions.size() - 1).replace(",", ""));

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
                row = row + 10;
            }
            // System.out.println("f "+i);

            System.out.print(positions.get(i));
            // System.out.print(String.format("%5d", positions.get(i)));

        }

        System.out.println("");
        System.out.println("");

    }

    public static int[] goldilocks(ArrayList<ArrayList<Integer>> list, int weight, int temperature) {

        int weightToReturn = 0;
        int temperatureToReturn = 0;

        for (int i = 0; i < list.size(); i++) {

                   if (list.get(i).get(0) > 100) {
                       
                      weightToReturn = list.get(i).get(0);
                       
                   }
                   
                   if (list.get(i).get(1) < 80) {
                       
                       temperatureToReturn = list.get(i).get(1);
                       
                   }

        }

        return new int[] {weightToReturn, temperatureToReturn};

        

    }
    
    

    public static void runGoldilocks() {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        
        
        ArrayList<Integer> item1 = new ArrayList<>();
        item1.add(100);
        item1.add(120);
        list.add(item1);
        
        ArrayList<Integer> item2 = new ArrayList<>();
        item2.add(297);
        item2.add(90);
        list.add(item2);
        
        ArrayList<Integer> item3 = new ArrayList<>();
        item3.add(66);
        item3.add(10);
        list.add(item3);
        
        ArrayList<Integer> item4 = new ArrayList<>();
        item4.add(104);
        item4.add(40);
        list.add(item4);
        
        
        
        System.out.println("Enter weight: ");
        int weight = input.nextInt();
 
        System.out.println("Enter temperature: ");
        int temperature = input.nextInt();
        
       /* while (true) {
            System.out.println("--------------" + index + "---------------");
            System.out.println("Enter seat weight: ");
            int weight = input.nextInt();

            if (weight == 0) {
                break;
            }

            System.out.println("");
            System.out.println("Enter temperature: ");
            int temperature = input.nextInt();

            index++;

            if (temperature == 0) {
                break;
            }

            ArrayList<Integer> item = new ArrayList<>();
            item.add(weight);
            item.add(temperature);
            
            list.add(item);
           
            
        } */
        
        System.out.println(PairProgramming.goldilocks(list, weight, temperature)[0]+ " " +PairProgramming.goldilocks(list, weight, temperature)[1]);

    }

    
    public static void calculator(int a, int b, int c){
        
        int[] numbers = new int[]{a,b,c};
        
       
        // 4 2 8
        
        
        if ((a*b)==c) {
            System.out.println(a+" * "+b+" = "+c);
            System.out.println(b+" * "+a+" = "+c);
            System.out.println(c+" / "+a+" = "+b);
            System.out.println("");
        }
        
        if((a/b)==c) {
            System.out.println(a+" / "+b+" = "+c);
            System.out.println(c+" / "+a+" = "+b);
        }
        if((b/a)==c) {
            System.out.println(b+" / "+a+" = "+c);
        }
        
        if((a+b)==c) {
            System.out.println(a+" + "+b+" = "+c);
        }
         
        if((a-b)==c) {
            System.out.println(a+" - "+b+" = "+c);
        }
        
        if((b-a)==c) {
            System.out.println(b+" - "+a+" = "+c);
        }
        
        //--------------------------
        if ((a*c)==b) {
            System.out.println(a+" * "+c+" = "+b);
        }
        
        if((a/c)==b) {
            System.out.println(a+" / "+c+" = "+b);
        }
       /* if((c/a)==b) {
            System.out.println(c+" / "+a+" = "+b);
        } */
        
        if((a+c)==b) {
            System.out.println(a+" + "+c+" = "+b);
        }
         
        if((a-c)==b) {
            System.out.println(a+" - "+c+" = "+b);
        }
        
        if((c-a)==b) {
            System.out.println(c+" - "+a+" = "+b);
        }
        
        //--------------------
        
        if ((b*c)==a) {
            System.out.println(b+" * "+c+" = "+a);
        }
        
        if((b/c)==a) {
            System.out.println(b+" * "+c+" = "+a);
        }
        if((c/b)==a) {
            System.out.println(c+" / "+b+" = "+a);
        }
        
        if((b+c)==a) {
            System.out.println(b+" * "+c+" = "+a);
        }
         
        if((b-c)==a) {
            System.out.println(b+" * "+c+" = "+a);
        }
        
        if((c-b)==a) {
            System.out.println(c+" * "+b+" = "+a);
        }
        
        
        
        
    }
    
   public static void runCalculator(){
       
      PairProgramming.calculator(4, 2, 8);
       
   }
    
    public static void main(String[] args) {

        // PairProgramming.runFactorial();
        //  PairProgramming.runDoggoCompetition();
        //PairProgramming.runGoldilocks();
         PairProgramming.runCalculator();

    }

}
