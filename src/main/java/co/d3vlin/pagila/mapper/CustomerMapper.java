package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.CustomerDTO;
import co.d3vlin.pagila.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {AddressMapper.class, StoreMapper.class})
public interface CustomerMapper {
    @Mapping(target = "address", source = "addressEntity")
    @Mapping(target = "store", source = "storeEntity")
    CustomerDTO fromEntity(CustomerEntity customerEntity);

    @InheritInverseConfiguration
    CustomerEntity fromDTO(CustomerDTO customerDTO);
}
