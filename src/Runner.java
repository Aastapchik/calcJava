import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().replace(" ", "");
        System.out.println(Calculator.calc(s));
    }
}
