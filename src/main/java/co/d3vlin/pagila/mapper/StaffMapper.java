package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.StaffDTO;
import co.d3vlin.pagila.dto.StoreDTO;
import co.d3vlin.pagila.entity.StaffEntity;
import co.d3vlin.pagila.entity.StoreEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = AddressMapper.class)
public interface StaffMapper {
    @Mapping(target = "store", expression = "java(toStoreRef(staffEntity.getStoreEntity()))")
    @Mapping(target = "address", source = "addressEntity")
    StaffDTO fromEntity(StaffEntity staffEntity);

    default StoreDTO toStoreRef(StoreEntity storeEntity) {
        if (storeEntity == null) {
            return null;
        }

        StoreDTO storeDTO = new StoreDTO();
        storeDTO.setId(storeEntity.getId());
        return storeDTO;
    }

    default StoreEntity toStoreEntityRef(StoreDTO storeDTO) {
        if (storeDTO == null) {
            return null;
        }

        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setId(storeDTO.getId());
        return storeEntity;
    }

    @InheritInverseConfiguration
    @Mapping(target = "storeEntity", expression = "java(toStoreEntityRef(staffDTO.getStore()))")
    StaffEntity fromDTO(StaffDTO staffDTO);
}
