package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.RentalDTO;
import co.d3vlin.pagila.entity.RentalEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {InventoryMapper.class, CustomerMapper.class, StaffMapper.class})
public interface RentalMapper {
    @Mapping(target = "inventory", source = "inventoryEntity")
    @Mapping(target = "customer", source = "customerEntity")
    @Mapping(target = "staff", source = "staffEntity")
    RentalDTO fromEntity(RentalEntity rentalEntity);

    @InheritInverseConfiguration
    RentalEntity fromDTO(RentalDTO rentalDTO);
}
