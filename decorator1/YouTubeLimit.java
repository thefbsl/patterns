public class YouTubeLimit extends Decorator{

    public YouTubeLimit(Operator operator) {
        super(operator);
    }

    public String getDescription(){
        return operator.getDescription() + ", no limit for youtube";
    };
    public int getCost(){
        return operator.getCost() + 300;
    }
}