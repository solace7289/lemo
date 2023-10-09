/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import lombok.*;

import javax.persistence.*;
//import javax.persistence.*;


/**
 *
 * @author hoangson
 */
@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    
//    @JoinColumn(name = "role_id")
//    private Roel roel;

    @ManyToOne
    @JoinColumn(name="roel_id", nullable=false)
    private Roel roel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Roel getRoel() {
        return roel;
    }

    public void setRoel(Roel roel) {
        this.roel = roel;
    }
}
