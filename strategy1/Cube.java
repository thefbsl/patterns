import static java.lang.Math.*;

public class Cube implements CalculateInterface {
    @Override
    public double express(int a) {
        return pow(a, 3);
    }
}