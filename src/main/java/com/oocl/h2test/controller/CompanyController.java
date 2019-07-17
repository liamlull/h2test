package com.oocl.h2test.controller;


import com.oocl.h2test.model.Company;
import com.oocl.h2test.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getAllCompanyMessage(){
        return companyService.getAllCompanyMessage();
    }

    @PostMapping("/companies")
    public Company addNewCompany(@RequestBody Company company){
        return  companyService.addNewCompany(company);
    }

    @DeleteMapping ("/companies")
    public void deleteCompany(@RequestBody Company company){
        companyService.deleteCompany(company);
    }

    @PutMapping("/companies")
    public Company updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }




}
