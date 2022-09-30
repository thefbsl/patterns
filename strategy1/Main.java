public class Main {
    public static void main(String[] args) {
        Expression squareOf = new Expression(new Square());
        Expression cubeOf = new Expression(new Cube());
        Expression rootOf = new Expression(new Root());
        Expression factorialOf = new Expression(new Factorial());
        System.out.println(squareOf.expressAnswer(4));
        System.out.println(cubeOf.expressAnswer(4));
        System.out.println(rootOf.expressAnswer(9));
        System.out.println(factorialOf.expressAnswer(5));
    }
}