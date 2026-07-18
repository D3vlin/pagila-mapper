package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.LanguageDTO;
import co.d3vlin.pagila.entity.LanguageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LanguageMapper {
    LanguageDTO fromEntity(LanguageEntity languageEntity);

    LanguageEntity fromDTO(LanguageDTO languageDTO);
}
