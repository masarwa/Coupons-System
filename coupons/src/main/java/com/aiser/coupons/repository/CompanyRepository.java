package com.aiser.coupons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aiser.coupons.bean.Company;
import java.util.*;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
    List<Company> findByName(String name);

    Company findById(long id);

}