package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.StoreDTO;
import co.d3vlin.pagila.entity.StoreEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {AddressMapper.class, StaffMapper.class})
public interface StoreMapper {
    @Mapping(target = "managerStaff", source = "managerStaffEntity")
    @Mapping(target = "address", source = "addressEntity")
    StoreDTO fromEntity(StoreEntity storeEntity);

    @InheritInverseConfiguration
    @Mapping(target = "addressEntity", source = "address")
    StoreEntity fromDTO(StoreDTO storeDTO);
}
