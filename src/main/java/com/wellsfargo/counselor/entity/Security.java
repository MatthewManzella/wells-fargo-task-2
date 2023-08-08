package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Security {

	@Id
    @GeneratedValue()
	@ManyToOne
    private long securityId;
	
	@Id
	@ManyToOne
	private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    public Security(String name, String category, float purchasePrice, String purchaseDate, int quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
}
