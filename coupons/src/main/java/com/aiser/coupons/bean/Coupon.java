package com.aiser.coupons.bean;


import javax.persistence.*;

@Entity
@Table
public class Coupon {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private long startDate;
	private long endDate;
	private int amount;
	private CouponType couponType;
	private String message;
	private double price;
	private String image;

	public Coupon() {

	}

	public Coupon(long id, String title, long startDate, long endDate, int amount, CouponType couponType, String message,
			double price, String image) {
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.setCouponType(couponType);
		this.message = message;
		this.price = price;
		this.image = image;
	}

	
	public Coupon(String title, long startDate, long endDate, int amount, CouponType couponType, String message,
			double price, String image) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.setCouponType(couponType);
		this.message = message;
		this.price = price;
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getStartDate() {
		return startDate;
	}

	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}

	public long getEndDate() {
		return endDate;
	}

	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amount=" + amount + ", couponType=" + couponType + ", message=" + message + ", price=" + price
				+ ", image=" + image + "]";
	}

	public CouponType getCouponType() {
		return couponType;
	}

	public void setCouponType(CouponType couponType) {
		this.couponType = couponType;
	}

}
