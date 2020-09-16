public class SquareDigit {

    public static int squareDigits(int n) {
        String s = n + "";
        String[] digits = s.split("");
        String output = "";

        for (String str : digits) {
            int i = Integer.parseInt(str);
            output += i * i;
        }
        return Integer.parseInt(output);
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(4));
    }
}
