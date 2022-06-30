package guru.springframework.mappers;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Write this mapper
 * 1. Define API to convert a User to UserCommand
 * 2. Define API to convert a UserCommand to User
 *
 * That is only what we need for mapstruct. Now, use mvn to package on that and
 * check generated implementation in line 26
 *
 * For different field names, we will need to add @Mappings annotation
 * see https://www.baeldung.com/mapstruct
 *
 * https://stackabuse.com/guide-to-mapstruct-in-java-advanced-mapping-library/
 *
 * Define this interface to convert for / to both ways
 * mapstruct plugin goal will generate the class to convert.
 * Click on implementayion, line 20
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * Define API to convert a User to UserCommand
     */
    UserCommand userToUserCommand(User user);

    /**
     * Define API to convert a UserCommand to User
     */
    User userCommandToUser(UserCommand userCommand);
}
