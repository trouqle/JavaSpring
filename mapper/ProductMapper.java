package com.orhankaya.n11h2.mapper;
import com.orhankaya.n11h2.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
//
//    @Mapping(target = "status", constant = "PASSIVE")
//    @Mapping(target = "name", source = "nameXXX")
//    Customer convertToCustomer(CustomerSaveRequest request);
//
//    CustomerDTO convertToCustomerDTO(Customer customer);
//
//    List<CustomerDTO> convertToCustomerDTOs(List<Customer> customers);
//
//    @Mapping(target = "id", ignore = true)
//    void updateCustomerFields(@MappingTarget Customer customer, CustomerUpdateRequest request);
//
//}
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
//    @Mapping(target = "status", constant = "ACTIVE")
//    @Mapping(target = "id", ignore = true)
//      void updateCustomerFields(@MappingTarget Product product, CustomerUpdateRequest request);

}
