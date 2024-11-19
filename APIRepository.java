package com.wilson.restapi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface APIRepository extends CrudRepository<Company, Long> {

    @Query("select c from Company c where c.company_number = :company_number")
    Company findByCompanyNumber(@Param("company_number") String company_number);

    @Query("select c from Company c where c.title LIKE :query")
    Company findByQuery(@Param("query") String query);

    @Query("select o from Officer o where o.company = :companynumber")
    Optional<Officer> findOfficerByCompanyNumber(@Param("companynumber") String companynumber);
}
