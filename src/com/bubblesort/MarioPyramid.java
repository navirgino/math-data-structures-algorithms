import java.io.*;


public class MarioPyramid
{

    static void printn(int num)
    {
        if (num == 0)
        return;
        System.out.println("# ");

        //recursively calling printn()
        printn(num - 1);
    }
    //method to print pattern
    static void pattern(int n, int i)
    {
        if (n == 0)
            return;
        printn(i);
        System.out.println();

        //recursively calling pattern()
        pattern(n - 1, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n, 2);
    }
}
