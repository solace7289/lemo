/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import java.util.Date;
import javax.persistence.*;
//import jakarta.persistence.*;
//import org.hibernate.annotations.Table;

/**
 *
 * @author hoangson
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "user_code")
    private String userCode;
    
    @Column(name = "user_name")
    private String userName;
    
//    @Column(name = "img")
//    private String img;
//    
//    @Column(name = "dob")
//    private Date dob;
//    
//    @Column(name = "gender")
//    private int gender;
//    
//    @Column(name = "address")
//    private String address;
//    
//    @Column(name = "email")
//    private String email;
//    
//    @Column(name = "pass")
//    private String pass;
//    
//    @Column(name = "major_id")
//    private int majorId;
    
    @JoinColumn(name = "role_id")
    private RoleUser roleId;
        
}
