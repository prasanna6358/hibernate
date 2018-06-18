package com.peddi.webserv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
    @Id
    @Column(name="addrId")
    private int addressId;

    @Column(name="location",length = 300)
    private String location;

    public int getAddressId() {
        return addressId;
    }

    public String getLocation() {
        return location;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", location='" + location + '\'' +
                '}';
    }
}
