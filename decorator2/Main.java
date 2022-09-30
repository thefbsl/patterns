public class Main {
    public static void main(String[] args) {
        Car car = new ThirdCarBuild(new SecondCarBuild(new FirstCarBuild()));
        System.out.println(car.getBuild());
    }
}