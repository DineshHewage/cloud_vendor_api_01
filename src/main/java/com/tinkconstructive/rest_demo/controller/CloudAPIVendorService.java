package com.tinkconstructive.rest_demo.controller;

import com.tinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController // This class receives http requests and returns JSON objects.
@RequestMapping("/cloudvendor") // Every request handled by this controller must start with /cloudvendor
public class CloudAPIVendorService {
/*
* CloudAPIVendorService receives the request
* it finds the matching CloudVendor from the database
* returns the CloudVendor object
* Spring automatically converts it to JSON and sends it back
*/
    CloudVendor cloudVendor_obj;

    @GetMapping("{vendorId}") //Take the value from the URL path and assign it to this method parameter
    public CloudVendor getCloudVendorDetail(@PathVariable String vendorId) {
/*  @PathVariable - If the URL is /cloudvendor/C1, the @PathVariable tells Spring:
    "Take 'C1' from the URL and put it into the String vendorId variable."*/
        //return new CloudVendor("C1","Vendor 1", "Address one", "0771758937");
        return cloudVendor_obj;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
/*  Spring sees the JSON coming in (like {"vendorId": "C1", "vendorName": "Tink"})
    and automatically converts it into a Java object (CloudVendor).*/
        this.cloudVendor_obj = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor_obj = cloudVendor;
        return "Cloud Vendor updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@RequestBody String vendorId) {
        this.cloudVendor_obj = null;
        return "Cloud Vendor deleted Successfully";
    }
}
