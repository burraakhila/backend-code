package com.example.demo.dto;

import java.util.List;

public class SaveRequest {
	private String userName;

	private List<String> selectedSeats;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getSelectedSeats() {
		return selectedSeats;
	}

	public void setSelectedSeats(List<String> selectedSeats) {
		this.selectedSeats = selectedSeats;
	}

}
