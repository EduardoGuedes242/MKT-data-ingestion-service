package com.eduardoguedes.data_ingestion_service.customer;
import jakarta.persistence.*;

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

    public CustomerEntity(CustomerRequestDTO customerRequestDTO) {
       setName(customerRequestDTO.name());
       setRegistrationDate(customerRequestDTO.registrationDate());
       setDateOfBirth(customerRequestDTO.dateOfBirth());
       setGender(customerRequestDTO.gender());
       setNeighborhood(customerRequestDTO.neighborhood());
       setCity(customerRequestDTO.city());
       setState(customerRequestDTO.state());
       setCity(customerRequestDTO.country());
       setNickname(customerRequestDTO.nickname());
       setEmail(customerRequestDTO.email());
       setPhone(customerRequestDTO.phone());
       setObservation(customerRequestDTO.observation());
    }

    public CustomerEntity() {};

    public CustomerEntity(Long id, String name, LocalDate registrationDate, LocalDate dateOfBirth, String gender, String neighborhood, String city, String state, String country, String nickname, String email, String phone, String observation) {
        this.id = id;
        this.name = name;
        this.registrationDate = registrationDate;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.observation = observation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
