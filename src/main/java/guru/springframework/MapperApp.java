package guru.springframework;

import guru.springframework.domain.User;
import guru.springframework.mappers.UserMapper;
import guru.springframework.model.UserCommand;
import org.mapstruct.factory.Mappers;

public class MapperApp {

    public static void main(String[] args) {

        UserCommand source = new UserCommand("Alex", "Tester", "tester@abc.com");

        User destination = UserMapper.INSTANCE.userCommandToUser(source);


        //User destination = mapper.userCommandToUser(source);
        System.out.println(destination);

    }
}
