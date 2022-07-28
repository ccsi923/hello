import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of euros");

        Scanner sc = new Scanner(System.in);
        double gbp = sc.nextDouble();

        System.out.println("The amount on pounds is " + gbp * 0.84);
    }
}
