package com.eduardoguedes.data_ingestion_service.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Long, CustomerEntity> {
}
