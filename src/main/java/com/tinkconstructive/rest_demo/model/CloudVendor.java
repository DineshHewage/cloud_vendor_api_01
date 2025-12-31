package com.tinkconstructive.rest_demo.model;

public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendor(){
    }

    public CloudVendor(String vendorAddress, String vendorId, String vendorName, String vendorPhoneNumber) {
        this.vendorAddress = vendorAddress;
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
