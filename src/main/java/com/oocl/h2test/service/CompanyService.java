package com.oocl.h2test.service;


import com.oocl.h2test.model.Company;
import com.oocl.h2test.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company addNewCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> getAllCompanyMessage() {
        return companyRepository.findAll();
    }

    public void deleteCompany(Company company) {
        companyRepository.delete(company);
    }

    public Company updateCompany(Company company) {
        companyRepository.delete(company);
        return companyRepository.save(company);
    }
}
