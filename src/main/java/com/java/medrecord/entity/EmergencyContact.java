package com.java.medrecord.entity;

public class EmergencyContact {
	private String contactName;
	private String relationship;
	private String phoneNumber;
	private String email;
	private String address;
	private boolean primaryContact;

	public EmergencyContact(String contactName, String relationship, String phoneNumber, String email, String address,
			boolean primaryContact) {
		super();
		this.contactName = contactName;
		this.relationship = relationship;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.primaryContact = primaryContact;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(boolean primaryContact) {
		this.primaryContact = primaryContact;
	}

}
