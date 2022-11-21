package com.aiser.coupons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aiser.coupons.bean.Coupon;
import java.util.*;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long>{
    List<Coupon> findByTitle(String title);

    Coupon findById(long id);

}