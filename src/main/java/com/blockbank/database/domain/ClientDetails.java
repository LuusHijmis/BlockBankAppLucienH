package com.blockbank.database.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ClientDetails {

    private String firstname;
    private String prefix;
    private String lastname;
    private LocalDate dateOfBirth;
    private int bsn;
    private String emailAddress;

    public ClientDetails(String firstname, String prefix, String lastname, LocalDate dateOfBirth, int bsn, String emailAddress) {
        this.firstname = firstname;
        this.prefix = prefix;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.bsn = bsn;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "ClientDetails{" +
                "firstname='" + firstname + '\'' +
                ", prefix='" + prefix + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bsn=" + bsn +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getBsn() {
        return bsn;
    }

    public void setBsn(int bsn) {
        this.bsn = bsn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDetails that = (ClientDetails) o;
        return bsn == that.bsn && Objects.equals(firstname, that.firstname) && Objects.equals(prefix, that.prefix) && Objects.equals(lastname, that.lastname) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, prefix, lastname, dateOfBirth, bsn, emailAddress);
    }
}
