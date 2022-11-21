package com.aiser.coupons.controllers;

import com.aiser.coupons.bean.Coupon;
import com.aiser.coupons.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/coupon")
public class CouponController{
    public final CouponService couponService;

    @Autowired
    public CouponController(CouponService couponService){
        this.couponService = couponService;
    }

	@GetMapping("/")
	public List<Coupon> getCoupons() {
		return this.couponService.getCoupons();
	}


	@PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
	public void saveCoupon(@RequestBody Coupon coupon) {
		this.couponService.save(coupon);
	}

}