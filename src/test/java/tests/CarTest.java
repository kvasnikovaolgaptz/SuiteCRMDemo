package tests;

import dto.Car;
import org.testng.annotations.Test;

@Test
public class CarTest {
    public void test() {
        Car car = new Car("BMV",220);
        Car car1 = new Car("BMV",220);
        Car car2 = new Car();
        System.out.println(car);
        System.out.println(car.equals(car1));

    }
}
