package com.eduardoguedes.data_ingestion_service.customer;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public CustomerResponseIdDTO createCustomer(@Validated @RequestBody CustomerEntity customerEntity) {
       return customerService.createCustomer(customerEntity);
    }

    @PutMapping("/edit")
    public String patchCustomer(@Validated @RequestBody CustomerEntity customerEntity) {
        customerService.editCustomer(customerEntity);
        return "Customer alter with Success";
    }

    @GetMapping("/{id}")
    public Optional<CustomerEntity> getOnlyCustomer(@Valid @PathVariable Long id) {
        return customerService.getOnlyCustomerById(id);
    }

}
