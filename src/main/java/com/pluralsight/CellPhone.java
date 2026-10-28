package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String modelNumber;
    private String carrierNumber;
    private String phoneNumber;
    private String owner;

    public CellPhone() {

        //set defaults for the properties of this class
        this.serialNumber = 0;
        this.modelNumber = "";
        this.carrierNumber = "";
        this.phoneNumber = "";
        this.owner = "";


    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getCarrierNumber() {
        return carrierNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setCarrierNumber(String carrierNumber) {
        this.carrierNumber = carrierNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
