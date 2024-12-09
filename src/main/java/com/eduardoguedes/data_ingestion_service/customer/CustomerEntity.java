package com.eduardoguedes.data_ingestion_service.customer;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctm_id")
    private Long id;

    @Column(name = "ctm_name")
    private String name;

    @Column(name = "ctm_registrationDate")
    private LocalDate registrationDate;

    @Column(name = "ctm_dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "ctm_gender")
    private String gender;

    @Column(name = "ctm_neighborhood")
    private String neighborhood;

    @Column(name = "ctm_city")
    private String city;

    @Column(name = "ctm_state")
    private String state;

    @Column(name = "ctm_country")
    private String country;

    @Column(name = "ctm_nickname")
    private String nickname;

    @Column(name = "ctm_email")
    private String email;

    @Column(name = "ctm_phone")
    private String phone;

    @Column(name = "ctm_observation")
    private String observation;
}
