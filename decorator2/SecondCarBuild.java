public class SecondCarBuild extends Decorator {

    public SecondCarBuild(Car car) {
        super(car);
    }

    public String getBuild(){
        return super.getBuild() + ", doors";
    }
}
