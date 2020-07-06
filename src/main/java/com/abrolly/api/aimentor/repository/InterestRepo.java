package com.abrolly.api.aimentor.repository;

import com.abrolly.api.aimentor.model.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InterestRepo extends JpaRepository<Interest, Long> {

}
