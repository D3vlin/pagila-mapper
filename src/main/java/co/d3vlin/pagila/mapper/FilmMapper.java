package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.FilmDTO;
import co.d3vlin.pagila.entity.FilmEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = LanguageMapper.class)
public interface FilmMapper {
    @Mapping(target = "language", source = "languageEntity")
    @Mapping(target = "originalLanguage", source = "originalLanguageEntity")
    FilmDTO fromEntity(FilmEntity filmEntity);

    @InheritInverseConfiguration
    FilmEntity fromDTO(FilmDTO filmDTO);
}
