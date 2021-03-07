package com.company.entities;

public class Library {
    private String name;
    private String location;
    private String address;

    public Library(String name, String location,String address){
        setName(name);
        setLocation(location);
        setAddress(address);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' + ", address='" + address + '\''+'}';
    }
}
