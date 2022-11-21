
package com.aiser.coupons.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author aiser masarwa holds the type of a coupon
 * 
 */
public enum CouponType {
	RESTUARANT(1), ELECTRICTY(2), FOOD(3), HEALTH(4), SPORTS(5), CAMPING(6), TRAVELLING(
			7);

	private int id;
	private static final Map<Integer, CouponType> map;

	static {
		map = new HashMap<Integer, CouponType>();
		for (CouponType value : CouponType.values()) {
			map.put(value.id, value);
		}
	}

	CouponType(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public static CouponType findByKey(int id) {
		return map.get(id);
	}

}
