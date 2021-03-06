package com.blockbank.database.domain;
/*@author Karish Resodikromo
* Data transfer object van user
* */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;


public class RegistrationDTO {

    private String firstname;
    private String prefix;
    private String lastname;
    private LocalDate dateOfBirth;
    private int bsn;
    private String emailAddress;
    private String username;
    private String password;
    private String address;
    private int houseNumber;
    private String affix;
    private String postalCode;
    private String city;
    private String country;

    public RegistrationDTO(String firstname, String prefix, String lastname, LocalDate dateOfBirth,
                           int bsn, String emailAddress, String username, String password, String address,
                           int houseNumber, String affix, String postalCode, String city, String country) {
        this.firstname = firstname;
        this.prefix = prefix;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.bsn = bsn;
        this.emailAddress = emailAddress;
        this.username = username;
        this.password = password;
        this.address = address;
        this.houseNumber = houseNumber;
        this.affix = affix;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getBsn() {
        return bsn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getAffix() {
        return affix;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstname='" + firstname + '\'' +
                ", prefix='" + prefix + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bsn=" + bsn +
                ", emailAddress='" + emailAddress + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", houseNumber=" + houseNumber +
                ", affix='" + affix + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationDTO that = (RegistrationDTO) o;
        return bsn == that.bsn && houseNumber == that.houseNumber && Objects.equals(firstname, that.firstname) &&
                Objects.equals(prefix, that.prefix) && Objects.equals(lastname, that.lastname) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(emailAddress, that.emailAddress) &&
                Objects.equals(username, that.username) && Objects.equals(password, that.password) &&
                Objects.equals(address, that.address) && Objects.equals(affix, that.affix) &&
                Objects.equals(postalCode, that.postalCode) && Objects.equals(city, that.city) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, prefix, lastname, dateOfBirth, bsn, emailAddress, username,
                password, address, houseNumber, affix, postalCode, city, country);
    }
}
