public class SocialMediaLimit extends Decorator{

    public SocialMediaLimit(Operator operator) {
        super(operator);
    }

    public String getDescription(){
        return operator.getDescription() + ", no limit for social networks ";
    };
    public int getCost(){
        return operator.getCost() + 150;
    }
}
