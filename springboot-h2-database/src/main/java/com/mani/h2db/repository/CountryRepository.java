package com.mani.h2db.repository;

import com.mani.h2db.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country,Integer> {
}
