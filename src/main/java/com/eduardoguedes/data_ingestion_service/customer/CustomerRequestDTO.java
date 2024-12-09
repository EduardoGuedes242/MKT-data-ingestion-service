package com.eduardoguedes.data_ingestion_service.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CustomerRequestDTO(
        @NotBlank(message = "Name of customer is required")
        String name,

        @NotNull(message = "Registration date is required")
        java.time.LocalDate registrationDate,

        @NotNull(message = "Date of birth is required")
        java.time.LocalDate dateOfBirth,

        @NotBlank(message = "Gender is required")
        String gender,

        @NotBlank(message = "Neighborhood is required")
        String neighborhood,

        @NotBlank(message = "City is required")
        String city,

        @NotBlank(message = "State is required")
        String state,

        @NotBlank(message = "Country is required")
        String country,

        String nickname,

        @Email(message = "Invalid email format")
        String email,

        String phone,

        String observation
) {
}
