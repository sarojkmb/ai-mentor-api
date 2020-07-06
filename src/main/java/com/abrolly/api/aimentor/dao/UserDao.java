package com.abrolly.api.aimentor.dao;


import com.abrolly.api.aimentor.exception.ResourceNotFoundException;
import com.abrolly.api.aimentor.model.User;
import com.abrolly.api.aimentor.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDao {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUserDao(){
        return userRepo.findAll();
    }

    public User getUserByIdDao(Long userId){
        return userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
    }

    public User createUserDao(User user){
        return userRepo.save(user);
    }


    public User updateUserDao(User userDetails, Long userid){
        User user = userRepo.findById(userid)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userid));

        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setGender(userDetails.getGender());
        user.setInterests(userDetails.getInterests());
        user.setExpertise(userDetails.getExpertise());
        user.setMyMentors(userDetails.getMyMentors());
        user.setMyFollowers(userDetails.getMyFollowers());

        User updatedNote = userRepo.save(user);
        return updatedNote;
    }

    public void deleteUserDao(Long userId){
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

         userRepo.delete(user);
    }

}
