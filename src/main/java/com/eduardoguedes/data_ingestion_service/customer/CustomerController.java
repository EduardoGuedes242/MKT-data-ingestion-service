package com.eduardoguedes.data_ingestion_service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerEntity> getAll() {
        return customerService.getAllCustomer();
    }

    @PostMapping
    public void createCustomer(@Validated @RequestBody CustomerRequestDTO customerRequestDTO) {
        CustomerEntity customer = new CustomerEntity(customerRequestDTO);
        customerService.createCustomer(customer);
    }

}
