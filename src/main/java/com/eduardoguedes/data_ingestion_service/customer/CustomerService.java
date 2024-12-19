package com.eduardoguedes.data_ingestion_service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> getAllCustomer() {
        return  customerRepository.findAll();
    }

    public CustomerResponseIdDTO createCustomer(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
        return new CustomerResponseIdDTO(customerEntity);
    }

    public Optional<CustomerEntity> getOnlyCustomerById(Long id) {
        return customerRepository.findById(id);
    }

}
