import static java.lang.Math.*;

public class Square implements CalculateInterface {
    @Override
    public double express(int a) {
        return pow(a, 2);
    }
}
