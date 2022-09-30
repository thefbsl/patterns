public class ThirdCarBuild extends Decorator {

    public ThirdCarBuild(Car car) {
        super(car);
    }

    public String getBuild(){
        return super.getBuild() + ", mirrors";
    }
}

