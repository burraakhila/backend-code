package com.example.demo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<DEMO, String> {

	@Modifying
	@Transactional
	@Query("update DEMO d set d.userName = ?2 , d.selectedSeats = ?1")
	void saveDetailsInDB(String string, String userName);

}
