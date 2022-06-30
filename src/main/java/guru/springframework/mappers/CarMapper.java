package guru.springframework.mappers;

import guru.springframework.dao.CarDto;
import guru.springframework.domain.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Define this interface to convert for / to both ways
 * mapstruct plugin goal will generate the class to convert.
 * Click on implementayion, line 15
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);

    @Mapping(source = "seatCount", target = "numberOfSeats")
    Car carDtoToCar(CarDto carDto);
}
