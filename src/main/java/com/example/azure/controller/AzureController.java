package com.example.azure.controller;


import com.example.azure.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure")
public class AzureController {

    @GetMapping
    @CrossOrigin
    public Employee testApplication(){
        return new Employee("1", "dheeraj","Engineer",10000);
    }

}
