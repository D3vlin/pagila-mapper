package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.AddressDTO;
import co.d3vlin.pagila.entity.AddressEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = CityMapper.class)
public interface AddressMapper {
    @Mapping(target = "city", source = "cityEntity")
    AddressDTO fromEntity(AddressEntity addressEntity);

    @InheritInverseConfiguration
    AddressEntity fromDTO(AddressDTO addressDTO);
}
