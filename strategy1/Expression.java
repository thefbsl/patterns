public class Expression {
    private CalculateInterface calcBehaviour;

    public Expression(CalculateInterface calcBehaviour){
        this.calcBehaviour = calcBehaviour;
    }

    public double expressAnswer(int a){
        return calcBehaviour.express(a);
    }
}
