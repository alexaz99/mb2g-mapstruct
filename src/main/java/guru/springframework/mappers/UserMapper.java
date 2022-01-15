package guru.springframework.mappers;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Write this mapper
 * For different field names, we will need to add @Mappings annotation
 * see https://www.baeldung.com/mapstruct
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
