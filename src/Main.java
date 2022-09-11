import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digest = in.nextInt();
        System.out.println(digest % 100 + "; " + digest / 100);
    }
}
