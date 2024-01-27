package com.java.medrecord.entity;



public class EmergencyAlert {
	 private String alertType;
	    private String message;
	    private String sender;
	    private String timestamp;
	    private boolean acknowledged;
	    
	    
	    
		public EmergencyAlert(String alertType, String message, String sender, String timestamp, boolean acknowledged) {
			super();
			this.alertType = alertType;
			this.message = message;
			this.sender = sender;
			this.timestamp = timestamp;
			this.acknowledged = acknowledged;
		}
		public String getAlertType() {
			return alertType;
		}
		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getSender() {
			return sender;
		}
		public void setSender(String sender) {
			this.sender = sender;
		}
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public boolean isAcknowledged() {
			return acknowledged;
		}
		public void setAcknowledged(boolean acknowledged) {
			this.acknowledged = acknowledged;
		}
	    
	    
	    
}
