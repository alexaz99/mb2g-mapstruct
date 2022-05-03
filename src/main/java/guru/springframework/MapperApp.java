package guru.springframework;

import guru.springframework.dao.CarDto;
import guru.springframework.domain.Car;
import guru.springframework.domain.User;
import guru.springframework.mappers.CarMapper;
import guru.springframework.mappers.UserMapper;
import guru.springframework.model.UserCommand;

public class MapperApp {

    public static void main(String[] args) {

        // UserCommand Should have setters/ getters
        UserCommand source = new UserCommand("Alex", "Tester", "tester@abc.com", "Desc");

        // User Should have setters/ getters
        User destination = UserMapper.INSTANCE.userCommandToUser(source);
        System.out.println(destination);

        Car car = new Car("Acura", 7);
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(carDto);

    }
}
