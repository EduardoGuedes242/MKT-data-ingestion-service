package com.eduardoguedes.data_ingestion_service.customer.integration;

import com.eduardoguedes.data_ingestion_service.customer.CustomerEntity;
import com.eduardoguedes.data_ingestion_service.customer.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        customerRepository.deleteAll();
        CustomerEntity customer = new CustomerEntity();
        customer.setName("Customer Test");
        customerRepository.save(customer);
    }

    @Test
    @DisplayName("Should Return All Customer")
    void shouldReturnAllCustomer() throws Exception {
        mockMvc.perform(get("/customer")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name").value("Customer Test"));
    }

    @Test
    @DisplayName("Should create new Customer")
    void shouldCreateNewCustomer() throws Exception {
        String newCustomerJson = """
                {
                  "name": "Edu dudu"
                }
                
                """;

        mockMvc.perform(post("/customer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(newCustomerJson))
                .andExpect(status().isOk());

    }

}
