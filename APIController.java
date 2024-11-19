package com.wilson.restapi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @Autowired
    private APIRepository repo;

    @GetMapping("/api")
    public Optional<Company> api(@RequestParam(value = "company", defaultValue = "1001") String number) {
        return Optional.ofNullable(repo.findByCompanyNumber(number));
    }

    @GetMapping("/search")
    public Optional<Company> search(@RequestParam(value = "query", defaultValue = "BBC") String query) {
        return Optional.ofNullable(repo.findByQuery(query));
    }

    @GetMapping("/officers")
    public Optional<Officer> officer(@RequestParam(value = "companynumber", defaultValue = "1001") String companynumber) {
        return repo.findOfficerByCompanyNumber(companynumber);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Company> getAllCompanies() {
        return repo.findAll();
    }
}