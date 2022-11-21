package com.aiser.coupons.service;

import org.springframework.stereotype.Service;
import com.aiser.coupons.bean.Coupon;
import com.aiser.coupons.repository.CouponRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CouponService{
	private final CouponRepository couponRepository;

	@Autowired
	public CouponService(CouponRepository couponRepository) {
		this.couponRepository = couponRepository;
	}

	public List<Coupon> getCoupons() {
    	return this.couponRepository.findAll();
	}

	public void save(Coupon coupon) {
		this.couponRepository.save(coupon);
	}
}