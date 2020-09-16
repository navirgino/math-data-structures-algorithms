import java.util.ArrayList;

public class LuhnsAlgorithm {
    //cs50 credit question but in java
    public static void main(String[] args) {
        String number = "378282246310005";
        ArrayList<Integer> array = arrayNumber(number);
        ArrayList<Integer> multiplied = multiplyW2(array);
        int added = addNumber(multiplied);
        if (check(added, array)) {
            System.out.println("This is a real credit card");
        } else {
            System.out.println("This credit card is invalid!");
        }

    }

    //Creates an array of ints of the given string.
    public static ArrayList<Integer> arrayNumber(String number) {
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        System.out.print("The credit card number is: ");
        for (int i = 0; i < number.length(); i++) {
            int x = Integer.parseInt(number.substring(i, i+1));
            numberArray.add(x);
            System.out.print(numberArray.get(i));
        }
        System.out.println();
        return numberArray;
    }

    public static ArrayList<Integer> multiplyW2(ArrayList<Integer> array) {
        ArrayList<Integer> multiplied = new ArrayList<Integer>();
        int y =0;
        for (int i = 1; i < array.size(); i+=2) {
            System.out.print(array.get(i) + " is multiplied with 2 to get: --> ");
            int x = array.get(i)*2;
            multiplied.add(x);
            System.out.println(multiplied.get(y));
            y++;
        }

        //The indexes that were multiplied by 2 is now set to 123 to easily see which ones are left to add up.
        System.out.println("The numbers that have not been multiplied by two are: ");
        for (int j = 1; j < array.size(); j+=2) {
            array.set(j, 123);
            System.out.print(array.get(j-1) + " ");
        }
        System.out.println();
        return multiplied;
    }

    static public int addNumber(ArrayList<Integer> array) {
        int added = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > 9) {
                int x = array.get(i)%10;
                int y = array.get(i)/10;
                added+= (x+y);
                System.out.printf("Two ints: %d + %d = % d\n", y, x, x+y);
            } else {
                added+= array.get(i);
            }
        }
        System.out.println("These are the every other number that are added together by each digit: " + added);
        return added;
    }

    public static boolean check (int added, ArrayList<Integer> array) {
        int addedRest = 0;
        System.out.print("All the other digits that weren't multiplied by 2: ");
        for (int i = 0; i < array.size(); i+=2) {
            addedRest+= array.get(i);
            System.out.print(array.get(i));
        }
        System.out.println();
        System.out.println("The above numbers add up to: " + addedRest + " Total: " + (addedRest+added));
        if ((added+addedRest)%10 == 0) {
            System.out.println("The total ends in a zero, therefor....\n");
            return true;
        }
        System.out.println("The total does not end in a zero, therefore....\n");
        return false;
    }
}
