package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.CountryDTO;
import co.d3vlin.pagila.entity.CountryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {
    CountryDTO fromEntity(CountryEntity countryEntity);

    CountryEntity fromDTO(CountryDTO countryDTO);
}
