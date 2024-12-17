package com.eduardoguedes.data_ingestion_service.customer;

public record CustomerResponseIdDTO(Long id) {

    public  CustomerResponseIdDTO(CustomerEntity entity) {
        this(entity.getId());
    }

}
