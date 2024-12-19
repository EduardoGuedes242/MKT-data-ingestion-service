package com.eduardoguedes.data_ingestion_service.customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(name = "ctm_id")
    private Long id;

    @Column(name = "ctm_name")
    private String name;

    @Column(name = "ctm_registration_date")
    private LocalDate registrationDate;

    @Column(name = "ctm_date_of_birth")
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

    @Column(name = "ctm_extra_code")
    private Integer extraCode;

}
