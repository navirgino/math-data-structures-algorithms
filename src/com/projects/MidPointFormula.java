import java.util.Arrays;
import java.util.Scanner;

public class MidPointFormula {

    static int[] findPoint(){
        int px = 0;
        int py = 0;
        int qx = 1;
        int qy = 1;
        int rx = (qx - px) * 2;
        int ry = (qy - py) * 2;
        int[] r = {rx, ry};
        return r;
        }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findPoint()));
    }
}
