package com.java.medrecord.entity;

public enum AccessLevel {

//	    READ, WRITE, ADMIN
	
	    READ("Read Only"),
	    WRITE("Write Access"),
	    ADMIN("Administrator");

	    private final String description;

	    AccessLevel(String description) {
	        this.description = description;
	    }

	    public String getDescription() {
	        return description;
	    }
}
