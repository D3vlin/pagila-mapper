package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.CityDTO;
import co.d3vlin.pagila.entity.CityEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = CountryMapper.class)
public interface CityMapper {
    @Mapping(target = "country", source = "countryEntity")
    CityDTO fromEntity(CityEntity cityEntity);

    @InheritInverseConfiguration
    CityEntity fromDTO(CityDTO cityDTO);
}
