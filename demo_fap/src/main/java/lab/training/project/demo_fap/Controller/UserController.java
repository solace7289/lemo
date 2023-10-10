/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lab.training.project.demo_fap.Entities.*;
import lab.training.project.demo_fap.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hoangson
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @PostMapping("/register")
    public Map<String, Object> createUser(@RequestBody User user){
        Map<String, Object> status = new HashMap<>();

        User testUser = new User();
        Role role = new Role();
        testUser.setUserCode("user code 1");
        testUser.setUserName("user name 1");

        role.setRoleId(1);
        role.setName("STUDENT");

        testUser.setRoleId(role);


        //save testUser
        userService.saveUser(testUser);

        System.out.println("Object:  "+user);
        System.out.println("test object 1: "+testUser);

        status.put("code", "200");
        status.put("message", "code is working");
        status.put("Object", testUser);
        
        return status;
    }
}
