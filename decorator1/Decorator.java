abstract class Decorator implements Operator {
    protected Operator operator;
    public Decorator(Operator operator){
        this.operator = operator;
    }

    public String getDescription(){
        return operator.getDescription();
    };
    public int getCost(){
        return operator.getCost();
    }

}
