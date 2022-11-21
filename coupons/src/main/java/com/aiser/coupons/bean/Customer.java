
package com.aiser.coupons.bean;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @ManyToMany
    private Set<Coupon> coupons;

    public Customer(){}

    public Customer(Long id, String name, Integer age, String email, Set<Coupon> coupons){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.coupons = coupons;
    }

    public Customer(String name, Integer age, String email, Set<Coupon> coupons){
        this.name = name;
        this.age = age;
        this.email = email;
        this.coupons = coupons;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }


    public Integer getAge() {
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public Set<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}

    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " email: " + this.email;
    }
}