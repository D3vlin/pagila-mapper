package co.d3vlin.pagila.mapper;

import co.d3vlin.pagila.dto.PaymentDTO;
import co.d3vlin.pagila.entity.PaymentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {CustomerMapper.class, StaffMapper.class, RentalMapper.class})
public interface PaymentMapper {
    @Mapping(target = "customer", source = "customerEntity")
    @Mapping(target = "staff", source = "staffEntity")
    @Mapping(target = "rental", source = "rentalEntity")
    PaymentDTO fromEntity(PaymentEntity paymentEntity);

    @InheritInverseConfiguration
    PaymentEntity fromDTO(PaymentDTO paymentDTO);
}
