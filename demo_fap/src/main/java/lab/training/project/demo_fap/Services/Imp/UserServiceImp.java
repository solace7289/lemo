/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Services.Imp;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.Repositories.UserRepository;
import lab.training.project.demo_fap.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoangson
 */
@Service
public class UserServiceImp implements UserService {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
}
