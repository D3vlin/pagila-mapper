package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.CategoryDTO;
import co.d3vlin.pagila.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    CategoryDTO fromEntity(CategoryEntity categoryEntity);

    CategoryEntity fromDTO(CategoryDTO categoryDTO);
}
