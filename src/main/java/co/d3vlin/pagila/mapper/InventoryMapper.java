package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.InventoryDTO;
import co.d3vlin.pagila.entity.InventoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {FilmMapper.class, StoreMapper.class})
public interface InventoryMapper {
    @Mapping(target = "film", source = "filmEntity")
    @Mapping(target = "store", source = "storeEntity")
    InventoryDTO fromEntity(InventoryEntity inventoryEntity);

    @InheritInverseConfiguration
    InventoryEntity fromDTO(InventoryDTO inventoryDTO);
}
