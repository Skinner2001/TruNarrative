package com.wilson.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Officer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String premises;
    private String postal_code;
    private String country;
    private String locality;
    private String address_line_1;
    private String name;
    private String appointed_on;
    private String resigned_on;
    private String officer_role;
    private String date_of_birth;
    private String occupation;
    private String country_of_residence;
    private String nationality;

    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPremises() {
        return premises;
    }

    public void setPremises(String premises) {
        this.premises = premises;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppointed_on() {
        return appointed_on;
    }

    public void setAppointed_on(String appointed_on) {
        this.appointed_on = appointed_on;
    }

    public String getResigned_on() {
        return resigned_on;
    }

    public void setResigned_on(String resigned_on) {
        this.resigned_on = resigned_on;
    }

    public String getOfficer_role() {
        return officer_role;
    }

    public void setOfficer_role(String officer_role) {
        this.officer_role = officer_role;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCountry_of_residence() {
        return country_of_residence;
    }

    public void setCountry_of_residence(String country_of_residence) {
        this.country_of_residence = country_of_residence;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
