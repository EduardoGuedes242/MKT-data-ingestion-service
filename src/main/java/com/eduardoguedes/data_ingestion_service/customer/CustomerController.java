package com.eduardoguedes.data_ingestion_service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/get")
    public List<CustomerEntity> getAll() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/teste")
    public void Teste() {
        System.out.println("Executnado");
    }
}
