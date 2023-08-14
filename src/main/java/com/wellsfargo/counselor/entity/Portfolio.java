package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {

	@Id
    @GeneratedValue()
    private long portfolioId;
	
	@Id
	@ManyToOne
	private long clientId;
	
	
    @Column(nullable = false)
    private String creationDate;
    

    protected Portfolio() {

    }

    public Portfolio(String date) {
    	this.creationDate = date;
    }

    public String getCreationDate() {
        return creationDate;
    }
    
    public void setDate(String creationDate) {
    	this.creationDate = creationDate;
    }
    
    public Long getClientId() {
        return clientId;
    }
    
    public Long getportfolioId() {
        return portfolioId;
    }

}
