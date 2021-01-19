import java.util.Scanner;

public class TestJavaProbs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer");
        Integer a = scan.nextInt();
        System.out.println("Enter integer");
        Integer b = scan.nextInt();

        JavaProbs jp = new JavaProbs(a,b);
        System.out.println(jp);

        JavaProbs jp2 = new JavaProbs();
        System.out.println(jp2);

        System.out.println(jp.getA());
        System.out.println(jp.getB());
        System.out.println(jp.nextEdge(a,b));
    }
}
