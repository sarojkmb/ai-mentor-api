package com.abrolly.api.aimentor.repository;

import com.abrolly.api.aimentor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

//    @Query(value = "SELECT nextval('seq_person')", nativeQuery = true)
//    Long getNextSeqPerson();
//
//    @Query("select u from user p where u.id in :personIds")
//    List<User>  getPersonListById(List<Integer> personIds);

//    List<User> findById(List<Integer> personIds);



}
