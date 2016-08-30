package com.simpleserver.data.model;

/**
 * @author sudhakar
 *
 */
public class Customer {
	int Yes = 0;
	int No = 0;
	int UserID = 0;
	String FirstName = ""; 
	String LastName = "";
	String CurrentStatus = "";
	String IsClockedIn = "";
	int GreeterQueuePosition = 0;
	String IsBusy = "";
	String EmailAddress = "";
	String CellPhone = "";
	String PhoneEXT = "";
	double salesPredictionScore = 0;
	
	public double getSalesPredictionScore() {
		return salesPredictionScore;
	}

	public void setSalesPredictionScore(double salesPredictionScore) {
		this.salesPredictionScore = salesPredictionScore;
	}

	public int getYes() {
		return Yes;
	}

	public void setYes(int yes) {
		Yes = yes;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCurrentStatus() {
		return CurrentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		CurrentStatus = currentStatus;
	}

	public String getIsClockedIn() {
		return IsClockedIn;
	}

	public void setIsClockedIn(String isClockedIn) {
		IsClockedIn = isClockedIn;
	}

	public int getGreeterQueuePosition() {
		return GreeterQueuePosition;
	}

	public void setGreeterQueuePosition(int greeterQueuePosition) {
		GreeterQueuePosition = greeterQueuePosition;
	}

	public String getIsBusy() {
		return IsBusy;
	}

	public void setIsBusy(String isBusy) {
		IsBusy = isBusy;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getCellPhone() {
		return CellPhone;
	}

	public void setCellPhone(String cellPhone) {
		CellPhone = cellPhone;
	}

	public String getPhoneEXT() {
		return PhoneEXT;
	}

	public void setPhoneEXT(String phoneEXT) {
		PhoneEXT = phoneEXT;
	}

}
