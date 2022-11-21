package com.aiser.coupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.aiser.coupons.repository.CompanyRepository;
import com.aiser.coupons.repository.CouponRepository;
import com.aiser.coupons.bean.Coupon;
import com.aiser.coupons.bean.Company;
import com.aiser.coupons.bean.CouponType;
import java.util.*;  


@SpringBootApplication
public class CouponsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CouponsApplication.class, args);

		//FOR TESTING
		 CompanyRepository companyRepository = context.getBean(CompanyRepository.class);
		 CouponRepository couponRepository = context.getBean(CouponRepository.class);

		 Coupon coupon = new Coupon("coca-cola 50%", 233333333, 233333333, 1, CouponType.FOOD, "WM coca ad",
		 10, "coca.png");

		 couponRepository.save(coupon);

		 Set<Coupon> coupons = new HashSet<Coupon> ();
		 coupons.add(coupon);
		 Company company = createCompany1();
		 company.setCoupons(coupons);
		 companyRepository.save(company);

		 //then in Browser: http://localhost:8080/api/v1/company/
		 //http://localhost:8080/api/v1/coupon/
	}

	private static Company createCompany1() {
		Company company = new Company();
		company.setName("coca-cola");
		company.setEmail("coca@gmail.com");
		company.setPassword("21213");
		return company;

	}

}
