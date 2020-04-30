package com.gateway.api.model;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 1818389559573830331L;
	private String id;
	private String issuer;
	private String userName;
	private long ttlMillis;
    

    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getIssuer() {
		return issuer;
	}


	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public long getTtlMillis() {
		return ttlMillis;
	}


	public void setTtlMillis(long ttlMillis) {
		this.ttlMillis = ttlMillis;
	}


	public AuthenticationRequest()
    {

    }


	public AuthenticationRequest(String id, String issuer, String userName, long ttlMillis) {
		super();
		this.id = id;
		this.issuer = issuer;
		this.userName = userName;
		this.ttlMillis = ttlMillis;
	}
	
}
