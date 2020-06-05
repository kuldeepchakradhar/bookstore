package com.bookstore.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class UserPayment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String type;
	private String cardName;
	private String cardNumber;
	private int expiryMonth;
	private int expiryYear;
	private int cvc;
	private String holderName;
	private boolean paymentDefault;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userPayment")
	private UserBilling userBilling;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public int getExpiryMonth() {
		return expiryMonth;
	}


	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}


	public int getExpiryYear() {
		return expiryYear;
	}


	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}


	public int getCvc() {
		return cvc;
	}


	public void setCvc(int cvc) {
		this.cvc = cvc;
	}


	public String getHolderName() {
		return holderName;
	}


	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}


	public boolean isPaymentDefault() {
		return paymentDefault;
	}


	public void setPaymentDefault(boolean paymentDefault) {
		this.paymentDefault = paymentDefault;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UserBilling getUserBilling() {
		return userBilling;
	}


	public void setUserBilling(UserBilling userBilling) {
		this.userBilling = userBilling;
	}
	
	
	

}