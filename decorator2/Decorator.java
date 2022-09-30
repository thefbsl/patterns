abstract class Decorator implements Car {
    protected Car car;
    public Decorator(Car car){
        this.car = car;
    }

    public String getBuild(){
        return car.getBuild();
    };


}
