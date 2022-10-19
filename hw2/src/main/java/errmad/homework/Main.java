package errmad.homework;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        Vector myVector = new Vector(x1, y1, z1);
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();
        Vector yourVector = new Vector(x2, y2, z2);


        System.out.println("Vector one:  " + myVector.getX() + "  " + myVector.getY() + "  " + myVector.getZ());
        System.out.println("Vector two:  " + yourVector.getX() + "  " + yourVector.getY() + "  " + yourVector.getZ());
        System.out.println("Length one: " + myVector.getVectorLength());
        System.out.println("Length two: " + yourVector.getVectorLength());
        System.out.println("Scalar Product: " + myVector.getScalarProduct(yourVector));
        System.out.println("Cross Product: " + (myVector.getCrossProduct(yourVector)));
        System.out.println("Cos: " + myVector.getCos(yourVector));
        System.out.println("Sum: " + myVector.getSum(yourVector));
        System.out.println("Difference: " + myVector.getDifference(yourVector));
    }
}