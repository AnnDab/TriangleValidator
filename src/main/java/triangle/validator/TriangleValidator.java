package triangle.validator;

        import java.util.Scanner;

public class TriangleValidator {
    private int a;
    private int b;
    private int c;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the length of side a.");
        int a = scanner.nextInt();
        System.out.println("Please, enter the length of side b.");
        int b = scanner.nextInt();
        System.out.println("Finally, please enter the length of side c.");
        int c = scanner.nextInt();

        TriangleValidator triangle = new TriangleValidator();
        if (triangle.validate(a, b, c)){
            System.out.println("This is a triangle.");
        } else
            System.out.println("Sorry! This is not a triangle. Try again.");
    }


    public boolean validate(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }
    }
}
