public class Factorial implements CalculateInterface {
    @Override
    public double express(int a) {
        for(int i = a - 1; i >= 1; i--){
            a *= i;
        }
        return a;
    }
}
