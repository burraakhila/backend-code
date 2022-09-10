package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SaveRequest;
import com.example.demo.repo.DemoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Demoservice {

	@Autowired
	DemoRepository demoRepository;

	public void saveDetails(SaveRequest saveRequest) {
		try {
			for(int i = 0;i<saveRequest.getSelectedSeats().size();i++)
			{
			demoRepository.saveDetailsInDB(saveRequest.getSelectedSeats().get(i), saveRequest.getUserName());
			}
		} catch (RuntimeException e) {
			System.out.println("Exception occured " + e);
		}
	}

}
