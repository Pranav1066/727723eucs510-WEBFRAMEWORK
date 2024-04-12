package com.praga.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.praga.demo.model.Address;

@RestController
public class AddressController {
    @GetMapping("/address")
    public Address praga() {
        return new Address(123, "Main st");
    }

}
