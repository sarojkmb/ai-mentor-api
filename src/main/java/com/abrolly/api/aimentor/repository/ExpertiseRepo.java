package com.abrolly.api.aimentor.repository;

import com.abrolly.api.aimentor.model.Expertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ExpertiseRepo extends JpaRepository<Expertise, Long> {

}
