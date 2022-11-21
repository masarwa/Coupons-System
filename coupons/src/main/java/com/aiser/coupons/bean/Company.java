
package com.aiser.coupons.bean;

import javax.persistence.*;
import java.util.Set;



@Entity
@Table
public class Company {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String email;
    
    @ManyToMany
    private Set<Coupon> coupons;

    public Company(){}

    public Company(Long id, String name, String password, String email, Set<Coupon> coupons){
        this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
        this.coupons = coupons;
    }

    public Company(String name, String password, String email, Set<Coupon> coupons){
		this.name = name;
		this.password = password;
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


    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public Set<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}

    public String toString() {
        return "Name: " + this.name + " Password: " + this.password + " email: " + this.email;
    }
}