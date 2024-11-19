package com.wilson.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APIService {
    private APIRepository repository;

    public APIRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(APIRepository repository) {
        this.repository = repository;
    }

//    public List<Company> getCompany(int number) {
//        return repository.find(number);
//    }
}
